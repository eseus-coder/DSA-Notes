package searchingAlgos_03.linearSearch_03_01;

import java.util.Scanner;

public class Fundamental {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int elementToBeSearched = input.nextInt();

        int[] arrayOfNumbers = {1, 8, 78, 12, 2, 4, 85};
        int indexFoundAt = linearSearch(arrayOfNumbers, elementToBeSearched);

        if (indexFoundAt != -1) {
            System.out.println(elementToBeSearched + " found at " + indexFoundAt + " index!");
        } else {
            System.out.println(elementToBeSearched + " was not found.");
        }
    }

    static int linearSearch(int[] numArr, int targetElement){
        if (numArr.length == 0 ){
            return -1;
        }

        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] == targetElement) {
                return i; //To return the element index
            }
        }

        return -1;
    }
}
