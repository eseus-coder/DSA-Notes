package searchingAlgos_03.binarySearch_03_02;
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
//Refer Leetcode_33 first before looking into this

//This question is also similar in the sense that we need to find the rotation count
//In this case we would need to return the index instead of element
//https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/

public class Leetcode_153 {
    public static void main(String[] args) {
        int[] nums = {11,13,15,17};

        int result = (minimumInRotatedArray(nums));
        System.out.println(result);
    }

    static int minimumInRotatedArray(int[] arr) {
        //Find the peak in this rotated array
        //Why? We know that the integer array nums sorted in ascending order (with distinct values).
        //And pivot is the element where the array is kind of changes from normal ascending array to
        //rotated array
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
            //Getting closer to DIP
            if (arr[middleIndex] > arr[startIndex]) { //Middle element and start element
                startIndex = middleIndex + 1;
            } else { //Case 4
                endIndex = middleIndex - 1;
            }
        }

        return -1;
    }
}
