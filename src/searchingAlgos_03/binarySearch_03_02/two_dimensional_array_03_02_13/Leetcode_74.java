package searchingAlgos_03.binarySearch_03_02.two_dimensional_array_03_02_13;
//https://leetcode.com/problems/search-a-2d-matrix/description/
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

/*
* Approach: -
* --- First we will apply binary search to find a potential row where the target must lie
* ----- How?
* --------- Treat the first row as the start and end row as the end (for pointers)
* --------- After that find the middle row
* --------- Now check in this middle row whether the target exists or not, (it should be greater than equal to first ele and less than equal to last ele)
* --------------- Bcz. then only we will know that the target lies in this row, otherwise
* --------------- we will check if the target is greater than last element of the middle row if yes, then search space will be shifted to the rows after the middle row
* --------------- and vice versa
* --- Once we have gotten the row, simply apply binary search on the particular row
* ----- Keeping the first element of the row to be the start pointer, last element to be the end pointer initially
* */

public class Leetcode_74 {
    public static void main(String[] args) {
        int[][] arrayNumbers = {
                {1, 3, 5, 7},
                {10,11,16,20},
                {23,30,34,60},
        };
        int target = 61;
        int potentialRowExists = searchingPotentialRow(arrayNumbers, target); //Potential row where the ans can lie
        if (potentialRowExists != -1) {
//            System.out.println(Arrays.toString(binarySearchInTheSelectedRow(arrayNumbers, potentialRowExists, target)));
            System.out.println(binarySearchInTheSelectedRow(arrayNumbers, potentialRowExists, target));
        } else {
            System.out.println("Doesn't Exists");
        }

    }

//    static int[] binarySearchInTheSelectedRow(int[][] matrix, int row, int target){
    static boolean binarySearchInTheSelectedRow(int[][] matrix, int row, int target){
        int startPoint = 0;
        int endPoint = matrix[row].length - 1;

        while(startPoint<=endPoint){

            //Better way to get the middle element
            int midPoint = startPoint + ((endPoint - startPoint)/2);

            if (target == matrix[row][midPoint]){
//                return new int[]{row,midPoint};
                return true;
            }

            if (target > matrix[row][midPoint]){
                startPoint = midPoint + 1;
            } else if (target < matrix[row][midPoint]) {
                endPoint = midPoint - 1;
            }
        }

//        return new int[]{-1,-1};
        return false;
    }

    static int searchingPotentialRow(int[][] matrix, int target){

        if (matrix==null || matrix.length == 0){
            return -1;
        }

        /*
                As every row can have varying length which will correspond to the number of cols,
                 "every row" here is basically another array in itself.
                So we can take the length of the array at this location like this:
                    numbersTwo[row].length

                        For e.g:
                            numbersTwo[1].length = 4 //{5,6,7,8}

        */

        int startRow = 0; //Points to the first row
        int endRow = matrix.length - 1; //Points to the last row
        int indexOfLastElementInMiddleRowPointer = matrix[startRow].length - 1; //Last index of row

        while(startRow<=endRow){

            int middleRow = startRow + (endRow - startRow) / 2;

            //Greater than equals to the first ele and less than equals to the last ele of the middle row selected
            if(target >=  matrix[middleRow][0] && target <= matrix[middleRow][indexOfLastElementInMiddleRowPointer]){
                //target is present in this row itself
                return middleRow;
            } else if (target > matrix[middleRow][indexOfLastElementInMiddleRowPointer]) { //Greater than the last ele of the middle row selected
                //we will check in the rows below this middle row
                startRow = middleRow + 1;
            } else if (target < matrix[middleRow][0]) { //indexOfFirstElementInMiddleRowPointer //Less than the first ele of the middle row selected
                //we will check in the rows above this middle row
                endRow = middleRow - 1;
            }
        }

        //No potential row where the ans can lie
        //the target is not there in the matrix itself
        return -1;
    }
}
