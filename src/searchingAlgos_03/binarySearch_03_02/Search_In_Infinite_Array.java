package searchingAlgos_03.binarySearch_03_02;
//Refer the notebook notes for its detailed explanation
// https://leetcode.com/problems/search-in-a-sorted-array-of-unknown-size/description/
// Premium leetcode

public class Search_In_Infinite_Array {
    public static void main(String[] args) {
        int[] array = {2,3,5,7,8,10,11,13,15,17,19,21,23,27,30}; // This is a finite array but we will assume it to be infinite that is the assumption
        // So it won't be getting any outOfBoundExceptions in an infinite array which we might get right now
        // Because technically this is a finite array we are only assuming it to be infinite array

        int target = 30;

        // Returns the index value
        System.out.println(ans(array, target));
    }

    static int ans(int[] array, int target){
        int startIndex = 0;
        int endIndex = 1;

        while(target > array[endIndex]){
            int tempStart = endIndex + 1;
            int sizeOfBox = endIndex - startIndex +1; // Or the current sub-array where we were searching the target element
            endIndex = endIndex + sizeOfBox * 2; // Doubling the size
            startIndex = tempStart;

            /*
            * The above approach is just a tad bit more optimised but one can follow the below approach
            * as its more on the first trying approach, and from there one can optimise it to the above approach
            * --- This is a more clean approach
            * --- Above is more precise approach (to take care of the nooks and cranies)
            */

//             startIndex = endIndex;
//             endIndex = 2 * endIndex;
        }

        return binarySearchIncreasingSorted(array, target, startIndex, endIndex);
    }

    static int binarySearchIncreasingSorted(int[] arrayInput, int target, int startPoint, int endPoint){

        while(startPoint<=endPoint){

            //Better way to get the middle element
            int midPoint = startPoint + ((endPoint - startPoint)/2);

            if (arrayInput[midPoint] == target){
                return midPoint;
            }

            if (target > arrayInput[midPoint]){
                startPoint = midPoint + 1;
            } else if (target < arrayInput[midPoint]) {
                endPoint = midPoint - 1;
            }
        }

        return -1;

    }
}
