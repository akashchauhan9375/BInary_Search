/*
 
LEETCODE --> 69
IN THIS QUESTION WE HAVE TO FIND THE SQUARE ROOT USING BINARY SEARCH
SOLUTION -->
IN ORDER THE FIND THE SQUARE ROOT OUR SPACE WILL BE 0 TO THAT NUMBER BECAUSE SQUARE ROOT WILL LIE ONLY IN THAT RANGE 
FIND THE MID AND CHEKC IF MID*MID IS EQUALS TO X AND CHNAGE THE POINTERS ACCORDINGLY

 */


class SquareRootUsingBs{
    public static int root(int x){
        int start = 0;
        int end = x;

        while(start<=end){
            int mid = start+(end-start)/2;
            long sq = (long)mid*mid;
            if(sq == x){
                return mid ;
            }
            if(sq<x){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return end;
    }
}