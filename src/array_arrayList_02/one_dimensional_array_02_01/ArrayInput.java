package array_arrayList_02.one_dimensional_array_02_01;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {

        //Array of primitives
        int size = 5;
        Scanner input = new Scanner(System.in);
        int[] arrayInput = new int[size];

        //Input using for loop
        for (int i = 0; i < arrayInput.length; i++) {
            arrayInput[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(arrayInput)); //Converting the array into string and printing them

        //Printing using for-each loop similar to in python
        for (int num : arrayInput) {
            System.out.print(num + " ");
        }

        System.out.println(); //Just to give space

        //Array of objects
        String[] stringValue = new String[size];
        for (int i = 0; i < stringValue.length; i++) {
            stringValue[i] = input.next();
        }

        System.out.println(Arrays.toString(stringValue));
    }
}
