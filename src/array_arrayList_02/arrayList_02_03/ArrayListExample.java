package array_arrayList_02.arrayList_02_03;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Syntax
        /*
        Inside the <> brackets we can only pass, wrapper classes not primitives
        */
        ArrayList<Integer> nameOfTheArrayList = new ArrayList<>(10); //Here 10 is given as a default value
        ArrayList<Integer> nameOfTheArrayListTwo = new ArrayList<>(5); //Here 10 is given as a default value

        //How to add in an array list
        nameOfTheArrayList.add(456);
        nameOfTheArrayList.add(45);
        nameOfTheArrayList.add(76575);
        nameOfTheArrayList.add(424);

        //Other functionalities can be checked after the name of the array list and dot

        System.out.println(nameOfTheArrayList);

        for (int i = 0; i < 5; i++) {
            nameOfTheArrayListTwo.add(input.nextInt());
        }

        System.out.print(nameOfTheArrayListTwo);

    }
}
