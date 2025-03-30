/*
 
LEETCODE --> 153
FIND THE MINIMUM IN ROTATED SORTED ARRAY 
APPROACH -->
WE WILL COMPARE THE MID AND END ELEMENT AND IF THE MID IS SMALLER THAN THEN END THAT MEANS THE ARRAY IS SORTED
AND IF THE ARRAY IS SORTED THEN DISCARD THE UPDATE THE MIN VALUE TO START INDEX AND CHECK TILL START<END
AT LAST RETURN VALUE AT END BECAUSE IT WILL BE THE SMALLEST VALUE 

 */
class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = start +(end-start)/2;

            if(nums[end]<nums[mid]){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return nums[end];
    }
}