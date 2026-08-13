// Last updated: 8/13/2026, 3:49:17 PM
class Solution {
     public List<String> fizzBuzz(int n) {

            List<String> list = new ArrayList<>();

           for(int i = 1; i <=n; i++) {

           // Condition for both divisible
              if(i%3 == 0  && i%5 == 0){

                  list.add("FizzBuzz");

   //  condition for divisible by 3
             }  else if(i%3 == 0){

                    list.add("Fizz");
 //  condition for divisible by 5
             }  else if(i%5==0){

                 list.add("Buzz");
 
   //  for Normal integer , by changing interger i to string using String.valueOf()

             }else {
                 list.add(String.valueOf(i));
             }
             
         }
         return list;
              
     }
}