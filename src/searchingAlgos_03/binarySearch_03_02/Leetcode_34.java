package searchingAlgos_03.binarySearch_03_02;
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
/*
* Idea is to break down the question, using one loop we are finding the first occurence
* and using the second loop we are finding the last occurence
*
* -- In the first loop we are finding on the left side of the middle element (assuming inc order array)
*       --- Because when we are searching on the left side it is understood that the first occurence
*               will be on this side only. (Why? Because this is a sorted incr. order array, so when the
*               middle and target matches, on the left side it will either have the same value or a value less than it)
*               --- If its the same value then the first occurence will change to that
*       --- That is why we reduce the search space by doing end = middle - 1
*
* -- In the second loop we are finding on the right side of the middle element (assuming inc order array)
*       --- Because when we are searching on the right side it is understood that the last occurence
*               will be on this side only. (Why? Because this is a sorted incr. order array, so when the
*               middle and target matches, on the right side it will either have the same value or a value greater than it)
*               --- If its the same value then the last occurence will change to that
*       --- That is why we reduce the search space by doing start = middle + 1
*
* -- As soon as the target matches with the middle element, we store the value and search in the
*       search space of right or left with the help of two loops.
*       --- We are storing the value every time because we are only assuming that this can be one of the
*           possible first or last occurence to the target element in the array
*
* We can further optimize the code in a sense that the code is repeated, but keeping it on repeating side for now
* for easy revision.
* -- Simply send a boolean which tells whether we are searching for the first occurence or last, and call the function twice
*       --- As soon as the target matches with the middle element, we store the value and search in the
 *          search space of right or left with the help of two loops.
 *          --- We are storing the value every time because we are only assuming that this can be one of the
 *              possible first or last occurence to the target element in the array
* */
import java.util.Arrays;

public class Leetcode_34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 6;

        System.out.println(Arrays.toString(searchRange(nums, target)));



        //OPTIMISED on repeation
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        int[] result = {-1, -1};
        result[0] = start;
        result[1] = end;

        System.out.println(Arrays.toString(result));
    }

    static int[] searchRange(int[] nums, int target) {

        int[] result = new int[2];

        int startIndex = 0;
        int endIndex = nums.length - 1;

        int startPosition = -1;
        int endPosition = -1;

        // Searching on the left side of the middle element
        while(startIndex<=endIndex){
            int middle = startIndex + ((endIndex - startIndex)/2);

            if (target == nums[middle]){
                // Here we are assuming this to be one of the possible solutions
                startPosition = middle;

                // Here we decided to check on the left to see if there are same elements
                // or not, if yes than on the next iteration, the startPosition will update
                endIndex = middle - 1;
            }

            if (target > nums[middle]){
                startIndex = middle + 1;
            }

            if (target < nums[middle]){
                endIndex = middle - 1;
            }
        }

        // Here basically resetting the start and index value to use in the new/next loop
        startIndex = 0;
        endIndex = nums.length - 1;

        // Searching on the right side of the middle element
        while(startIndex<=endIndex){
            int middle = startIndex + ((endIndex - startIndex)/2);

            if (target == nums[middle]){
                // Here we are assuming this to be one of the possible solutions
                endPosition = middle;

                // Here we decided to check on the right to see if there are same
                // elements or not, if yes than on the next iteration, the endPosition will update
                startIndex = middle + 1;
            }

            if (target > nums[middle]){
                startIndex = middle + 1;
            }

            if (target < nums[middle]){
                endIndex = middle - 1;
            }
        }

        // This is a way to return an array
        result[0] = startPosition;
        result[1] = endPosition;

        return result;
    }

    static int search(int[] nums, int target, boolean isSearchingForFirstOccurence) {
        int startIndex = 0;
        int endIndex = nums.length - 1;

        int position = -1;


        while(startIndex<=endIndex){
            int middle = startIndex + ((endIndex - startIndex)/2);

            if (target == nums[middle]){

                // Searching on the left side of the middle element
                if (isSearchingForFirstOccurence) {
                    // Here we are assuming this to be one of the possible solutions
                    position = middle;

                    // Here we decided to check on the left to see if there are same elements
                    // or not, if yes than on the next iteration, the startPosition will update
                    endIndex = middle - 1;
                }
                // Searching on the right side of the middle element
                else {
                    // Here we are assuming this to be one of the possible solutions
                    position = middle;

                    // Here we decided to check on the right to see if there are same
                    // elements or not, if yes than on the next iteration, the endPosition will update
                    startIndex = middle + 1;
                }

            }

            if (target > nums[middle]){
                startIndex = middle + 1;
            }

            if (target < nums[middle]){
                endIndex = middle - 1;
            }
        }

        return position;
    }
}
