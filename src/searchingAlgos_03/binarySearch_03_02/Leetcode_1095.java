package searchingAlgos_03.binarySearch_03_02;
// https://leetcode.com/problems/find-in-mountain-array/description/

public class Leetcode_1095 {
    public static void main(String[] args) {

        int[] array = {1,5,2};
        int target = 2;
        int peakIndex =  peakIndexInMountainArray(array);

        int startIndex = 0;
        int endIndex = array.length - 1;
        int firstOccurence = orderAgnosticSearch(target, array, startIndex, peakIndex);
        if (firstOccurence < 0){
            firstOccurence = orderAgnosticSearch(target, array, peakIndex, endIndex);
        }

        System.out.println(firstOccurence);
    }


    //After finding the peak, we will treat the peak as the breaking point to divide the main array
    //into two sub array, one in increasing order and other in decreasing order
    static int orderAgnosticSearch(int target, int[] array, int start, int end){
        int startIndex = start;
        int endIndex = end;
        boolean isOrderIncreasing = true;
        if (array[startIndex] < array[endIndex]) {
            isOrderIncreasing = true;
        } else if (array[startIndex] > array[endIndex]) {
            isOrderIncreasing = false;
        }

        while(startIndex<=endIndex){
            int middle = startIndex + ((endIndex - startIndex)/2);

            if (target == array[middle]){
                return middle;
            }

            if (target > array[middle]){
                if(isOrderIncreasing){
                    startIndex = middle + 1;
                } else {
                    endIndex = middle - 1;
                }
            }

            if (target < array[middle]){
                if(isOrderIncreasing){
                    endIndex = middle - 1;
                } else {
                    startIndex = middle + 1;
                }
            }
        }

        return -1;
    }

    //Refer Leetcode_852
    // Efficient approach: works for all cases
    static int peakIndexInMountainArray(int[] arr){
        int result = -1;

        if (arr.length < 3){
            System.out.println("Doesn't satisfy the condition");
            return result;
        }

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
}
