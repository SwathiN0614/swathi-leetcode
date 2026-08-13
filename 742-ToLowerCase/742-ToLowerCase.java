// Last updated: 8/13/2026, 3:47:07 PM
class Solution {
    public String toLowerCase(String s) {

        // Manual ASCII conversion

        String result = "";

        for(int i = 0; i < s.length(); i++){

            char ch = s.charAt(i);

            if(65 <= ch && ch <= 90){
                result += (char)(ch + 32);
            }
            else{
                result += ch;
            }
        }

        return result;
    }
}