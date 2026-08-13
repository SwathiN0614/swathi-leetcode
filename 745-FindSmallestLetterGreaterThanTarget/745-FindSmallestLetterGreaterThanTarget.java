// Last updated: 8/13/2026, 3:47:03 PM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(int i=0;i<letters.length;i++)
        {
            if(letters[i]>target)
            {
                return letters[i];
            }
        }
        return letters[0];
    }
}