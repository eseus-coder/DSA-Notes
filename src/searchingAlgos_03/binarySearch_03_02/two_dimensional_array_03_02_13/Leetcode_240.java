package searchingAlgos_03.binarySearch_03_02.two_dimensional_array_03_02_13;
//https://leetcode.com/problems/search-a-2d-matrix-ii/description/
//We are assuming here that the matrix is in sorted manner both row-wise and column wise
//(THIS IS NOT A PURE SORTED ARRAY)
//E.G: {
// {10, 20, 30, 40},
// {15, 25, 35, 45},
// {25, 35, 45, 55},
// {35, 45, 55, 65}
// }

//FOR PURE SORTED ARRAY
//Each row is sorted in non-decreasing order.
//The first integer of each row is greater than the last integer of the previous row.
/*
* E.G:
* [
*   [1,3,5,7],
*   [10,11,16,20],
*   [23,30,34,60]
* ]
* */

public class Leetcode_240 {
    public static void main(String[] args) {
        int[][] arrayNumbers = {
                                 {1, 3, 5, 7},
                                 {10,11,16,20},
                                 {23,30,34,60},
                            };
        int target = 3;

        //If want to return index where the element is
//        System.out.println(Arrays.toString(searchInSortedMatrix(arrayNumbers, target)));

        //If want to just check whether the target exists or not
        System.out.println(searchInSortedMatrix(arrayNumbers, target));
    }

    //Approach without binary search (Refer notebook for analysis)
    //(THIS IS NOT A PURE SORTED ARRAY)

    //If want to return index where the element is
//    static int[] searchInSortedMatrix(int[][]arr, int target){

    //If want to just check whether the target exists or not
    static boolean searchInSortedMatrix(int[][]arr, int target){

        if (arr.length == 0 ){

            //If want to return index where the element is
//            return new int[]{-1, -1};

            //If want to just check whether the target exists or not
            return false;
        }

        int startPoint = 0; //Basically the first element in the matrix
        int endPoint = arr[0].length - 1; //The last coloumns first element or 1sr rows last element

        while(startPoint < arr.length && endPoint >= 0){
                if (target == arr[startPoint][endPoint]) {

                    //If want to return index where the element is
//                    return new int[]{startPoint, endPoint};

                    //If want to just check whether the target exists or not
                    return true;
                }

                if (target < arr[startPoint][endPoint]){
                    //Because in the coloumn, the target can not be greater than any other element now
                    //why? because the coloumn is also sorted and in that coloumn we compared with the
                    //first element or lets say the minimum or least valued number
                    endPoint--;
                } else {
                    //Because in the row, the target can not be lesser than any other element now
                    //why? because the row is also sorted and in that row we compared with the
                    //last element or lets say the maximum or most valued number
                    startPoint++;
                }
        }

        //If want to return index where the element is
//        return new int[]{-1, -1};

        //If want to just check whether the target exists or not
        return false;
    }
}
