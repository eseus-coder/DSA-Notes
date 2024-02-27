package searchingAlgos_03.binarySearch_03_02;
// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

/*
* Bitonic array or mountain array: The number first increases and then decreases in the array
* Why Binary search for this?
* --- Because till the point the number are increasing are basically a sorted sub-array
* --- and from the point where it starts decreasing to the end it is decreasing (again a sorted sub-array)
*/

public class Leetcode_852 {
    public static void main(String[] args) {
        int[] arr = {0,1,0};
        int[] arr2 = {0,2,1,0};
        int[] arr3 = {0,10,5,2};
        int[] arr4 = {1,2,6,5,3};
        int[] arr5 = {18,29,38,59,98,100,99,98,90};
        int[] arr6 = {3,5,3,2,0};

        System.out.println(peakIndexInMountainArrayNaive(arr));
        System.out.println(peakIndexInMountainArrayNaive(arr2));
        System.out.println(peakIndexInMountainArrayNaive(arr3));
        System.out.println(peakIndexInMountainArray(arr4));
        System.out.println(peakIndexInMountainArray(arr5));
        System.out.println(peakIndexInMountainArray(arr6));
    }

    // Naive approach: Only works for few cases
    /*
    * In this approach we are simply finding the middle element as always, and then finding the elements which are immediatley next
    * and previous to the middle element. Based on that we move towards right or left.
    * */
    static int peakIndexInMountainArrayNaive(int[] arr){
        int result = -1;

        if (arr.length < 3){
            System.out.println("Doesn't satisfy the condition");
            return result;
        }

        int startIndex = 0;
        int endIndex = arr.length - 1;

        while(startIndex<=endIndex){
            int middleIndex = startIndex + (endIndex - startIndex) / 2; //Finding middle index
            int middle = arr[middleIndex]; //Middle element
            int middleForward = arr[middleIndex + 1]; //Element next to middle
            int middleBackward = arr[middleIndex - 1]; //Element previous to middle

            //Becuase we are searching for the peak, we will decide our search space towards that
            if (middleForward > middle) {
                startIndex = middleIndex + 1;
            } else if (middleBackward > middle) {
                endIndex = middleIndex - 1;
            } else {
                //This will execute when the start the middle element we found is the peak. (How?) Because the next
                //element is not greater than the middle and previous element is not greater than the middle.
                //And as soon as we found this, we terminate the loop and return the index
                result = middleIndex;
                break;
            }
        }
        return result;
    }

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
