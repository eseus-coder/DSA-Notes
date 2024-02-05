package array_arrayList_02.two_dimensional_array_02_02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rowSize = 2;
        int colSize = 2;

        int[][] numbersTwo = {
                {1,2,3,4}, //0th index
                {5,6,7,8}, //1st index
                {9,10,11,12} //2nd index
        };

        int[][] array2D = new int[rowSize][colSize];
        for (int row = 0; row < array2D.length; row++) {

            /*
                As every row can have varying length, "every row" here is basically another array in
                itself.
                So we can take the length of the array at this location like this:
                    numbersTwo[row].length

                        For e.g:
                            numbersTwo[1].length = 4 //{5,6,7,8}

            */
            for (int col = 0; col < array2D[row].length; col++) {
                array2D[row][col] = input.nextInt();
            }
        }

        //Printing using advanced for loop
        for (int[] num : array2D) {
            System.out.println(Arrays.toString(num));
        };

        //Another way to print
        for (int row = 0; row < array2D.length; row++) {
            for (int col = 0; col < array2D[row].length; col++) {
                System.out.print(array2D[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println("NEW");
        //Another way to print
        for (int row = 0; row < array2D.length; row++) {
            System.out.println(Arrays.toString(array2D[row]));
        }
    }
}
