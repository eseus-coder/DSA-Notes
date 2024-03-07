package searchingAlgos_03.binarySearch_03_02;
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/description/
//Go through the following in sequence:
//1. Leetcode_33
//2. Leetcode_81
//3. Leetcode_153

public class Leetcode_154 {
    public static void main(String[] args) {
        int[] nums = {2,2,2,0,1};

        int result = minimumInduplicateValuedArray(nums);
        System.out.println(result);
    }

    static int minimumInduplicateValuedArray(int[] arr) {
        //Find the peak in this rotated array
        //Why? We know that the integer array nums sorted in ascending order (with distinct values).
        //And pivot is the element where the array is kind of changes from normal ascending array to
        //rotated array
        //So we can say that the pivot is the max element of the array
        int peakElementInTheArray = peakElementInTheArray(arr);

        //If peak element exists, then the element next to it would be the minimum
        //Because of the DIP
        //And if the peak element is returned -1, then it simply means that the array is
        //not rotated it is a normal increasing order sorted array,
        //in that case starting element is the minimum

        if(peakElementInTheArray == -1){
            return arr[0];
        } else {
            return arr[peakElementInTheArray + 1];
        }
    }

    //Refer the notebook notes
    static int peakElementInTheArray(int[] arr){
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
}
