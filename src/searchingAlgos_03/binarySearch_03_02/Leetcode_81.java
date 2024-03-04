package searchingAlgos_03.binarySearch_03_02;
//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
//Refer Leetcode_33 first before looking into this

public class Leetcode_81 {
    public static void main(String[] args) {
        int[] nums = {2,5,6,0,0,1,2};
        int target = 3;

        int result = duplicateValuedArray(nums, target);
        if (result == -1){
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }

    static int duplicateValuedArray(int[] arr, int target) {

        int startIndex = 0;
        int endIndex = arr.length - 1;

        //Find the peak in this rotated array
        //Why? We know that the integer array nums sorted in ascending order (with distinct values).
        //And pivot is the element where the array is kind of changes from normal ascending array to
        //rotated array
        //So we can say that the pivot is the max element of the array
        int peakIndex = peakIndexInArray(arr);

        if (peakIndex == -1) {
            //Doing a normal b.s because the array is not rotated
            return(binarySearchIncreasingSorted(arr, target, startIndex, endIndex));
        }

        //if the pivot index that we found, we need to check whether the pivot itself is the target search
        //or not
        if (arr[peakIndex] == target) {
            return peakIndex;
        }

        int foundTargetIndex = -1;

        //Find on the left side of the peak
        foundTargetIndex = (binarySearchIncreasingSorted(arr, target, startIndex, peakIndex - 1));

        //Find on the right side of the peak
        if (foundTargetIndex == -1) {
            foundTargetIndex = (binarySearchIncreasingSorted(arr, target, peakIndex + 1, endIndex));
        }

        return foundTargetIndex;
    }

    //Can refer Leetcode_852
    //Refer the notebook notes
    static int peakIndexInArray(int[] arr){
        int startIndex = 0;
        int endIndex = arr.length - 1;

        while(startIndex<=endIndex){
            int middleIndex = startIndex + (endIndex - startIndex) / 2; //Finding middle index

            //Case 1
            //middleIndex < endIndex : to prevent from array out of bound exception
            if (middleIndex < endIndex && arr[middleIndex] > arr[middleIndex + 1]) { //Next element to middle
                return middleIndex;
            }

            //Case 2
            //middleIndex > startIndex : to prevent from array out of bound exception
            if (middleIndex > startIndex && arr[middleIndex] < arr[middleIndex - 1]) { //Previous element to middle
                return middleIndex - 1;
            }

            //Case 3
            //We need to skip the duplicates if the start, mid and end element are same
            if (arr[middleIndex] == arr[startIndex] && arr[middleIndex] == arr[endIndex]) {
                //Note: Before we skip we need to check whether the element that is being skipped
                //is not the pivot
                //how do we check?
                //To skip the start element we can use case 1
                //Basically checking for the DIP
                if (startIndex < endIndex && arr[startIndex] > arr[startIndex+1]){
                    return startIndex;
                }
                startIndex++;

                //To skip the end element we can use the case 2
                //Basically checking for the DIP
                if (endIndex > startIndex && arr[endIndex] < arr[endIndex - 1]){
                    return endIndex - 1;
                }
                endIndex--;

            } else if ( arr[middleIndex] > arr[startIndex] || (arr[middleIndex] == arr[startIndex] && arr[middleIndex] > arr[endIndex])) {
                startIndex = middleIndex + 1;
            } else {
                endIndex = middleIndex - 1;
            }
        }

        return -1;
    }

    static int binarySearchIncreasingSorted(int[] arr, int target, int start, int end){

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else{
                return mid;
            }

        }
        return -1;

    }
}
