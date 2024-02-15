package searchingAlgos_03.binarySearch_03_02;

import java.util.Arrays;
import java.util.Scanner;

/*
* Ceiling: Smallest number in the array which is >= to the target number
* Floor: Greatest number in the array which is <= to the target number
*/
/*
array = [2,4,6,11,15,18,21]
target = 14
ceiling = 15
floor = 11
*/
//Refer notebook for more detailed analysis
public class Ceiling_Floor_Increasing_Order {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of array elements you want to enter::");
        int arrayNumber = input.nextInt();

        int[] array = new int[arrayNumber];

        System.out.println("Enter the array elements in increasing order::");

        for (int i = 0; i < arrayNumber; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("Here is the array::" + Arrays.toString(array));

        System.out.println("Enter the target element whose ceiling and floor you would like to find::");

        int targetNumber = input.nextInt();

        // If the target number is greater than the greatest number in the array
        // -- This is a failsafe
        if (targetNumber > array[array.length - 1]){
            System.out.println("target number is greater than the greatest number in the array:: -1");
        }

        // If the target number is smaller than the smallest number in the array then
        // we basically won't have the floor value in the array search space
        if (targetNumber < array[0]) {
            System.out.println("target number is smaller than the smallest number in the array:: -1");
        }

        if (!(targetNumber > array[array.length - 1]) && !(targetNumber < array[0])) {
            int ceilingIndex = ceilingNumberOfTheArray(array, targetNumber);
            int floorIndex = floorNumberOfTheArray(array, targetNumber);

            System.out.println("Ceil::" + array[ceilingIndex]);
            System.out.println("Floor::" + array[floorIndex]);
        }

    }

    // static int[] ceilingNumberOfTheArray(int[] array, int target) //If want to return both start and end index together
    static int ceilingNumberOfTheArray(int[] array, int target){

        // int[] result = new int[2]; // Array to hold startIndex and endIndex

        int startIndex = 0;
        int endIndex = array.length - 1;

        while(startIndex<=endIndex){
            int middle = startIndex + ((endIndex - startIndex)/2);

            if (target == array[middle]){
                return middle;
            }

            if (target > array[middle]){
                startIndex = middle + 1;
            }

            if (target < array[middle]){
                endIndex = middle - 1;
            }
        }

        // result[0] = startIndex; // Assigning startIndex to result[0]
        // result[1] = endIndex;   // Assigning endIndex to result[1]
        // return result;

        return startIndex;
    }

    static int floorNumberOfTheArray(int[] array, int target){
        int startIndex = 0;
        int endIndex = array.length - 1;

        while(startIndex<=endIndex){
            int middle = startIndex + ((endIndex - startIndex)/2);

            if (target == array[middle]){
                return middle;
            }

            if (target > array[middle]){
                startIndex = middle + 1;
            }

            if (target < array[middle]){
                endIndex = middle - 1;
            }
        }
        return endIndex;
    }
}



/*
NOTE:: Above code is only correct for increasing order sorted array.
However, when it is a decreasing order sorted array, we need to use the
decreasing order B.S.
And accordingly need to return end index and start index for ceiling and floor
value respectively. [IMPT LINE]

Refer notebook for better reference
*/