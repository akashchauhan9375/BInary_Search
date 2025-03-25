

//FIND THE FIRST OCCURENCE IN LOGN COMPLEXITYs

class FirstOccurennce{
    public static int Find(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
        
        int ans = -1;

        while(start<=end){
            int mid =  (start+end)/2;
            if(arr[mid] == target){
                ans = mid;
                end = mid-1;
            }

            else if(arr[mid]<target){
                start = mid+1;
            }

            else{
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String st[]){
        int arr [] = {1,2,3,3,3,3,4,5};
        int target = 3;
        System.out.println(Find(arr, target));

    }
}