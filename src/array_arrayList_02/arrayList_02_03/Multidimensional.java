package array_arrayList_02.arrayList_02_03;

import java.util.ArrayList;
import java.util.Scanner;

public class Multidimensional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> multiDimensional = new ArrayList<>();

        System.out.println("Enter the number for 2D arraylist::");
        int number = input.nextInt();

        //Initialize the above array list
        for (int i = 0; i < number; i++) {
            multiDimensional.add(new ArrayList<>());
        }

        //take the value from the user
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                multiDimensional.get(i).add(input.nextInt());
            }
        }

        //Printing out the array list
        System.out.println(multiDimensional);
    }
}
