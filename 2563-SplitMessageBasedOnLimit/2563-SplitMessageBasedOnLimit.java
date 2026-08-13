// Last updated: 8/13/2026, 3:43:04 PM
class Solution {
    int baseLength = 3;

    public String[] splitMessage(String message, int limit) {
        int left = 1;
        int right = Math.min(9, message.length());
        // start small - while answer has not been found, keep going
        int parts = searchForAnswer(left, right, message, limit);
        while (parts == -1 && right <= message.length()) {
            left *= 10;
            right = right * 10 + 9;
            parts = searchForAnswer(left, right, message, limit);
        }

        if (parts == -1) {
            return new String[0];
        }

        return splitMessage(message, limit, parts);
    }

    public int searchForAnswer(int left, int right, String message, int limit) {
        while (left < right) {
            int mid = (left + right) / 2;
            int result = canSplit(message, limit, mid);
            if (result > 0) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return canSplit(message, limit, right) == 0 ? right : -1;
    }

    public String[] splitMessage(String message, int limit, int parts) {
        String[] ans = new String[parts];
        String commonSuffix = "/" + parts + ">";
        int messageIndex = 0;
        for (int i = 1; i <= parts; i++) {
            StringBuilder currLine = new StringBuilder();
            String currSuffix = "<" + i + commonSuffix;
            int numChars = limit - (currSuffix.length());
            while (numChars > 0 && messageIndex <= message.length() - 1) {
                currLine.append(message.charAt(messageIndex));
                messageIndex++;
                numChars--;
            }
            currLine.append(currSuffix);
            ans[i - 1] = currLine.toString();
        }
        return ans;
    }

    
    public int canSplit(String message, int limit, int parts) {
        String partString = parts + "";
        int baseLength = this.baseLength + partString.length();
        
        if (baseLength + partString.length() > limit) {
            return -1;
        }

        int charsLeft = message.length();
        int digits = 1;
        int places = 10;
        
        for (int i = 1; i < parts; i++) {
            if (i / places != (i - 1) / places) {
                digits++;
                places *= 10;
            }
            // subtract off 
            charsLeft -= limit - (digits + baseLength);
            if (charsLeft <= 0) {
                break;
            }
        }
       
        if (charsLeft < 0) {
            return -1;
        
        } else if (charsLeft > limit - (digits + baseLength)) {
            return 1;
        
        } else {
            return 0;
        }
    }
}