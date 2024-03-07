package searchingAlgos_03.binarySearch_03_02;
//https://leetcode.com/problems/split-array-largest-sum/description/

//Similar to the following:
//https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/
//https://www.geeksforgeeks.org/allocate-minimum-number-pages/
//Painter's partition or Allocation of books

//Notebook for analysis

public class Leetcode_410 {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int splittingAllowed = 2;

        int result = splitArray(nums, splittingAllowed);
        System.out.println(result);
    }

    public static int splitArray(int[] array, int k){
        int start = 0; //Min value (Case 2) : Max element from the array
        int end = 0; //Max value (Case 1) : Sum of whole array

        for (int num:array) {
            start = Math.max(start, num); //In the end of the loop it will have the max of the array
            end += num; //It will have the sum of the array
        }

        while(start<end){

            //Try for the middle as potential ans
            int middle = start + (end-start)/2;

            //Calculate how many pieces we can divide this array in with middle as the max sum
            //Max sum being the sum of individual array elements
            int sum = 0;
            int pieces = 1; //Because we will atleast have one array which is the original one

            for (int num:array) {

                //sum+num being: individual array elements being added up should not exceed middle value
                //If it does exceed we will start a new sub array and its sum
                //So here we will increment the pieces counter which keeps track of the no of sub arrays
                if (sum + num > middle) {
                    sum = num;
                    pieces++;
                } else {
                    //If the individual array elements being added up does not exceed middle value
                    //then we will keep adding into that sub array itself
                    sum += num;
                }
            }

            //k: No of sub array splitting permitted to us
            //pieces: No of sub array splitting we did
            if (pieces <= k) {
                end = middle;
            } else {
                start = middle + 1;
            }
        }

        return start; //We can return either start or end bcz start==end

    }
}
