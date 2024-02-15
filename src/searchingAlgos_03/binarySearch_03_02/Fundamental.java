package searchingAlgos_03.binarySearch_03_02;

import java.util.Scanner;

// Binary search in increasing sorted array : 2 3 5 6 8 100 888 999 1000 11111
// Binary search in decreasing sorted array : 99 80 70 55 66 22 -22 -33 -44 -100
// Binary search in order agnostic array

public class Fundamental {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sizeOfArray = input.nextInt();
        int[] array = new int[sizeOfArray];

        System.out.println("Enter a sorted array");

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("Here is the array");

        for (int ele : array) {
            System.out.println(ele + " ");
        }

        System.out.println("Enter the element to be searched");

        int targetElement = input.nextInt();

        //Order agnostic
        boolean isOrderIncreasing = true;
        boolean allAreSame = false;
        if (array[0] < array[array.length - 1]) {
            isOrderIncreasing = true;
        } else if (array[0] > array[array.length - 1]) {
            isOrderIncreasing = false;
        } else {
            allAreSame = true;
        }

        int elementIndex = -1;
        if (isOrderIncreasing) {
            elementIndex = binarySearchIncreasingSorted(array, targetElement);
        } else if (!isOrderIncreasing) {
            elementIndex = binarySearchDecreasingSorted(array, targetElement);
        } else if (allAreSame) {
            System.out.println("All elements are same");
        }


        if (elementIndex == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at " + (elementIndex + 1) + "th position of the array.");
        }

    }

    static int binarySearchIncreasingSorted(int[] arrayInput, int target){
        int startPoint = 0;
        int endPoint = arrayInput.length - 1;

        while(startPoint<=endPoint){
//            int midPoint = ((startPoint + endPoint) / 2);

            //Better to get the middle element
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

    static int binarySearchDecreasingSorted(int[] arrayInput, int target){
        int startPoint = 0;
        int endPoint = arrayInput.length - 1;

        while(startPoint<=endPoint){
//            int midPoint = ((startPoint + endPoint) / 2);

            //Better to get the middle element
            int midPoint = startPoint + ((endPoint - startPoint)/2);

            if (arrayInput[midPoint] == target){
                return midPoint;
            }

            if (target > arrayInput[midPoint]){
                endPoint = midPoint - 1;
            } else if (target < arrayInput[midPoint]) {
                startPoint = midPoint + 1;
            }
        }

        return -1;

    }
}
