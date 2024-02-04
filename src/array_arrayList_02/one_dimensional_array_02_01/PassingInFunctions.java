package array_arrayList_02.one_dimensional_array_02_01;

import java.util.Arrays;
import java.util.Scanner;

public class PassingInFunctions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = 5;
        int[] takingInput = new int[size];

        for (int i = 0; i < takingInput.length; i++) {
            takingInput[i] = input.nextInt();
        }

        int[] arrayReturned = passingArray(takingInput);
        System.out.println("After returning::" + Arrays.toString(arrayReturned));
    }

    static int[] passingArray(int[] arrayPassed){
        System.out.println("Initial array::" + Arrays.toString(arrayPassed));
        arrayPassed[2] = 990;
        return arrayPassed;
    }
}
