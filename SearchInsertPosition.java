/*
 
leetcode --> 35
Given a sorted array of distinct integers and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.

APPROACH -->
WE WILL APPLY BINARY SEARCH AND WILL ADJUST THE START AND END ACCORDING TO THE MID 
AND RETURN START BECAUSE START WILL ALWAYS BE THE INDEX WHERE ELEMENTS SHOULD BE PLACED

 */

class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
}
