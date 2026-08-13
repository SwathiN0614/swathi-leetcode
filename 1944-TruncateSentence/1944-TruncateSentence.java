// Last updated: 8/13/2026, 3:43:28 PM
class Solution {
    public String truncateSentence(String s, int k) {
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                c+=1;
            }
            if(c==k){
                return s.substring(0,i);
            }
        }
        return s;
    }   
}