// Last updated: 8/13/2026, 3:46:08 PM
class Solution {
    public String reverseOnlyLetters(String s) {
        char temp[] = s.toCharArray();      
        int low = 0 , high = s.length()-1;
        while(low < high){
            if(Character.isAlphabetic(temp[low]) && Character.isAlphabetic(temp[high])){
                char i = temp[low];temp[low] = temp[high];
                temp[high] = i;//   Please UPVOTE \U0001f64b‍♂️\U0001f64b\U0001f481\U0001f647\U0001f647\U0001f647‍♂️\U0001f647‍♀️\U0001f647\U0001f647
                low++; high--;
            }else if(!Character.isAlphabetic(temp[low]))  low++;
            else if(!Character.isAlphabetic(temp[high]))  high--;   
        }
        return String.valueOf(temp);
    }
}



