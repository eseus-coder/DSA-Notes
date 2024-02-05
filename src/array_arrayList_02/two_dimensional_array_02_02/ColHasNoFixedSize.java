package array_arrayList_02.two_dimensional_array_02_02;

import java.util.Scanner;

public class ColHasNoFixedSize {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] numbersTwo = {
                {1,2,3,4}, //0th index
                {5,6,7,8}, //1st index
                {9,10,11,12} //2nd index
        };

        for (int row = 0; row < numbersTwo.length; row++) {

            /*
                As every row can have varying length, "every row" here is basically another array in
                itself.
                So we can take the length of the array at this location like this:
                    numbersTwo[row].length

                        For e.g:
                            numbersTwo[1].length = 4 //{5,6,7,8}

            */
            for (int col = 0; col < numbersTwo[row].length; col++) {
                System.out.print(numbersTwo[row][col] + " ");
            }
            System.out.println();
        }
    }
}
