package array_arrayList_02.two_dimensional_array_02_02;

import java.util.Arrays;

public class ArrayFundamentals {
    public static void main(String[] args) {
        /*
            Synatx and how it is shown:
                1 2 3
                4 5 6
                7 8 9

                dataType[][] variableName = new dataType[size][size];
                []: First bracket for rows
                []: Second bracket for columns

                Note: Adding the number of rows is mandatory
        */

        int size = 5;
        int[][] numbers = new int[size][];

        int[][] numbersTwo = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        /*
            In Java, when you call Arrays.toString() on a two-dimensional array,
            it doesn't provide a nicely formatted representation of the array's contents.
            Instead, it gives you a string that starts with [I@ followed by a hash code.
            The [I part indicates that it's an array of integers (I stands for integer),
            and the following hash code is unique to the specific instance of the array.

            If you want to print the actual content of the numbersTwo array, you'll need
            to loop through it and print each element individually, like this:
        */
        for (int[] num : numbersTwo) {
            System.out.println(Arrays.toString(num));
        }

    }
}
