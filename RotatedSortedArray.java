/*
LEETCODE --> 33 SEARCH IN ROTATED SORTED ARRAY
IN THIS QUESTION WE ARE GIVEN AN ARRAY IS  SORTED AND ROTATED N TIMES A.WE HAVE TO SEARCH FOR A TARGET ELEMENT 
SOLUTION -->

WE WILL FIRST DIVIDE THE ARRAY IN TWO PARTS AND CHECK THAT WHICH PART IS SORTED AND WHICHEVER PART IS FOUND SORTED 
LEFT OR RIGHT, WE WILL AGAIN SEARCH IN THAT PART USING RECURSION


 */




class Solution {
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
