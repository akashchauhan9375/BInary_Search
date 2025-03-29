
/*
 LEETCODE -- 34

 IN THIS WE ARE GIVEN AN ARRAY AND A TARGET ELEMENT AND WE HAVE TO FIND THE FIRST AND LAST OCCURENCE OF THE ELEMENT 
 IN THE ARRAY USING BINARY SEARCH
 APPROACH -->

WE WILL CHECK FOR THE ELEMENT IN THE RIGHT AND LEFT SUBARRAY
TWO FUNCTION WILL BE MADE ONE FOR LEFT AND ONE FOR RIGHT AND WE WILL UPDATE THE VALUE OF START AND END ACCORDINGLY
IN BOTH THE FUNCTIONS
 */




class FirstAndLastOccurence{
    public static int[] result(int arr[],int target){
        int left = leftSearch(arr, target);
        int right = rightSearch(arr, target);

        return new int[]{left,right};

    }

    public static int leftSearch(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
        int idx = -1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid] == target){
                idx = mid;
                end = mid-1;
            }
            else if(arr[mid] <target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }

        }
        return idx;
    }

    public static int rightSearch(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
        int idx = -1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr[mid] == target){
                idx = mid;
                start = mid+1;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return idx;
    }
}