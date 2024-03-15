package searchingAlgos_03.binarySearch_03_02.two_dimensional_array_03_02_13;
//We are assumin here that the matrix is in sorted manner both row-wise and column wise
//E.G: {
// {10, 20, 30, 40},
// {15, 25, 35, 45},
// {25, 35, 45, 55},
// {35, 45, 55, 65}
// }


import java.util.Arrays;

public class RowColMatrixSorted {
    public static void main(String[] args) {
        int[][] arrayNumbers = {
                                 {1, 3, 5, 7},
                                 {10,11,16,20},
                                 {23,30,34,60},
                            };
        int target = 3;
        System.out.println(Arrays.toString(searchInSortedMatrix(arrayNumbers, target)));
    }

    //Approach without binary search (Refer notebook for analysis)
    //We did not make use of midpoint and so, therefor we can still improve upon this
    static int[] searchInSortedMatrix(int[][]arr, int target){

        if (arr.length == 0 ){
            return new int[]{-1, -1};
        }

        int startPoint = 0; //Basically the first element in the matrix
        int endPoint = arr[0].length - 1; //The last coloumns first element or 1sr rows last element

        while(startPoint < arr.length && endPoint >= 0){
                if (target == arr[startPoint][endPoint]) {
                    return new int[]{startPoint, endPoint};
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

        return new int[]{-1, -1};
    }
}
