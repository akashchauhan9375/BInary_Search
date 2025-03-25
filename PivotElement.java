
/*
 
LEETCODE -- 33
IN THIS QUESTION WE ARE GIVEN AN ARRAY WHICH IS SORTED AND ROTATED BY UNKNOWN TIMES.WE HAVE TO FIND THE TARGET VALUE AND
RETURN THE INDEX OF THAT VALUE IN LOGN COMPLEXITY

SOLUTION -->
WE WILL DIVIDE BY ARRAY IN TWO PARTS AND WILL CHECK WHICH PART IS SORTED LEFT OR RIGHT.....
IF THIS TYPE OF ARRAY IF THE FIRST ELEMENT IS SMALLER THAN LAST ELEMENT THEN ARRAY IS SORTED
AFTER FINDING THE SORTED PART WE WILL RECURSIVELY APPLY BINARY SEARCH ON THAT PART OF ARRAY 


 */



class PivotElement{
    public int search(int[] arr, int target) {
        return binarySearch(arr, target, 0, arr.length - 1);
    }

    private int binarySearch(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        // Check if the left half is sorted
        if (arr[left] <= arr[mid]) {
            if (arr[left] <= target && target < arr[mid]) {
                return binarySearch(arr, target, left, mid - 1);
            } else {
                return binarySearch(arr, target, mid + 1, right);
            }
        }
        // Right half is sorted
        else {
            if (arr[mid] < target && target <= arr[right]) {
                return binarySearch(arr, target, mid + 1, right);
            } else {
                return binarySearch(arr, target, left, mid - 1);
            }
        }
    }
}