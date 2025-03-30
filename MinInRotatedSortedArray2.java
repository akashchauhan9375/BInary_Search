/*
 
LEETCODE --> 154
IN THIS QUESTION WE HAVE TO FIND THE MINIMUM ELEMENT FROM THE GIVEN ARRAY WHICH ALSO HAS DULPLICATE VALUE
SOLUTION -->
WE WILL COMPARE THE MID AND END ELEMENT AND IF THE MID IS SMALLER THAN THEN END THAT MEANS THE ARRAY IS SORTED
AND IF THE ARRAY IS SORTED THEN DISCARD THE UPDATE THE MIN VALUE TO START INDEX AND CHECK TILL START<END
AT LAST RETURN VALUE AT END BECAUSE IT WILL BE THE SMALLEST VALUE 
FOR DISCARDING DUPLICATE VALUE WE WILL CHECK GOR IT AND IF FOUND THEN WE WILL UPDATE THE END POINTER
BY DECREASING END BY 1


 */



class MinInSortedArray2{
    public static int search(int arr[]){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start +(end-start)/2;
            if(arr[mid] == arr[end]){
                end = end-1;
            }
            else if(arr[mid]<arr[end]){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return arr[end];
    }
}