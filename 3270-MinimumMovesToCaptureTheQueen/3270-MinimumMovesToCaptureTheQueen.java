// Last updated: 8/13/2026, 3:42:23 PM
class Solution {
    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
        if(a==e || b==f){
            //check if bishop is in the path of rook or not..
            if(a==c){
                if((d>b && d<f) || (d>f && d<b))return 2;
            }if(b==d){
                if((c>a && c<e) || (c>e && c<a))return 2;
            }
            return 1;
        }
        else if(Math.abs(c-e)==Math.abs(d-f)){
            // check if rook is in the path of bishop or not..
            if(Math.abs(a-c)==Math.abs(b-d) && Math.abs(e-a)==Math.abs(f-b)){
                if((a>e && a<c) || (a>c && a<e)){
                   return 2;
                }
            }
            return 1;
        }
        return 2;
    }
}