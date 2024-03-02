package searchingAlgos_03.binarySearch_03_02;
//https://leetcode.com/problems/search-in-rotated-sorted-array/description/

/*
* Normal sorted array = [0,1,2,4,5,6,7]
* Same array rotated (1st rotation)/Rotated at pivot index 0 = [7,0,1,2,4,5,6]
* Same array rotated (2nd rotation)/Rotated at pivot index 1 = [6,7,0,1,2,4,5]
* same array rotated (3rd rotation)/Rotated at pivot index 2 = [5,6,7,0,1,2,4]
*/

public class Leetcode_33 {
    public static void main(String[] args) {

        int[] nums = {3,1};
        int target = 1;

        System.out.println(firstApproach(nums, target));
    }

    //The elaborative approach
    static int firstApproach(int[] arr, int target) {

        int startIndex = 0;
        int endIndex = arr.length - 1;

        //Find the peak in this rotated array
        //Why? We know that the integer array nums sorted in ascending order (with distinct values).
        //And pivot is the element where the array is kind of changes from normal ascending array to
        //rotated array
        //So we can say that the pivot is the max element of the array
        int peakIndex = peakIndexInArray(arr);

        //Find on the left side of the peak
        int foundOnTargetIndex = binarySearchIncreasingSorted(arr, target, startIndex, peakIndex);

        //Find on the right side of the peak
        if(foundOnTargetIndex < 0){
            foundOnTargetIndex = binarySearchIncreasingSorted(arr, target, peakIndex, endIndex);
        }

        return foundOnTargetIndex;
    }

    //Can refer Leetcode_852
    static int peakIndexInArray(int[] arr){
        int result = -1;

        int startIndex = 0;
        int endIndex = arr.length - 1;

        //We are not using the <= condition here, because when the start and index are on the same element, that itself is the answer
        //we dont need to check after that
        //startIndex and endIndex are always trying to find the max element in the below 2 checks(from both the ends
        //hence when they are pointing to just one element, that is when we know we have found the peak
        while(startIndex<endIndex){
            int middleIndex = startIndex + (endIndex - startIndex) / 2; //Finding middle index
            int middle = arr[middleIndex]; //Middle element
            int middleForward = arr[middleIndex + 1]; //Element next to middle (not previous)

            //If the element next to the middle is greater, we know that the peak element is on the right
            if (middleForward > middle) {
                startIndex = middleIndex + 1;
            }
            //If the element next to the middle, is actually less than the middle, then we know that the peak element will be on the left
            //Why is endIndex = middleIndex? and not endIndex = middleIndex - 1? like in the binary search algo?
            //--- Because we are not sure whether the endIndex = middleIndex - 1 element is greater than the middle element as of now
            //  --- Than why are we doing startIndex = middleIndex + 1;(?), why are we sure there? simply because we already
            //  --- verified it here middleForward > middle. (How?) Because middleForward = middleIndex + 1.
            if (middleForward < middle) {
                endIndex = middleIndex;
            }
        }

        //Here startIndex == endIndex, and pointing towards the largest element because of the 2 checks above
        return startIndex;
    }

    static int binarySearchIncreasingSorted(int[] arrayInput, int target, int startIndex, int peakIndex){
        int startPoint = startIndex;
        int endPoint = peakIndex;

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
