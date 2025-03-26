
/*
 
LEETCODE --> 74
IN THIS WE HAVE TO FIND WHEATHER THE GIVEN ELEMENT IS PRESENT OR NOT IN THE 2D ARRAY IN LOGN COMPLEXITY

SOLUTION --->

FIRST OF ALL WE WILL CHECK THAT IN WHICH ROW THE GIVEN VALUE EXIST......FOR THAT WE WILL APPLY BINARY SEARCH THROUGH 0th
COLUMN (THIS IS POSSIBLE BECAUSE THE GIVEN ARRAY IS SORTED ROW WISE AND COL WISE)...AFTER FINDING THAT ROW WE WILL SEARCH 
FOR THE ELEMENT IN THAT ROW USING BINARY SEARCH

TIME COMPLEXITY WILL O(log(m*n))
 */




class SeachIn2DArray{
    public boolean searchMatrix(int[][] matrix, int target) {
       int rowIdx = searchRow(matrix,target);
       if(rowIdx != -1) return binarySearchOverRow(rowIdx,matrix,target);
       else return false;
    }

    public static int searchRow(int matrix[][],int target){
        int start = 0;
        int end = matrix.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;

            if(matrix[mid][0]<=target && target <=matrix[mid][matrix[0].length-1]){
                return mid;
            }
            else if(matrix[mid][0]<target){
                start = mid+1;
            }
            else if(matrix[mid][0]>target){
                end = mid-1;
            }
        }
        return -1;
    }

    public boolean binarySearchOverRow(int rowIdx,int matrix[][],int target){
        int start = 0;
        int end = matrix[rowIdx].length-1;
        while(start<=end){
            int mid = start+(end - start)/2;
            if(matrix[rowIdx][mid] == target) return true;
            else if(matrix[rowIdx][mid]>target) end = mid-1;
            else start = mid+1;
        }
        return false;
    }
}