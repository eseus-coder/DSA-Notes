package array_arrayList_02.one_dimensional_array_02_01;

import java.util.Arrays;

public class ArrayFundamentals {
    public static void main(String[] args) {
        /*
            Syntax:
                dataType[] variableName = new dataType[sizeOfArray];
                OR
                dataType[] variableName = {};

                "new" keyword is used create an object in the heap memory
        */
        int size = 10;
        int[] numbers = new int[size]; //Empty array with a size of 10
        int[] numbersTwo = {1,2,3,4,5,6,7,8};

        int[] numbersThree; //Only declarations (Defined in the stack memory)
        numbersThree = new int[size]; //Initialisation (Object is being created in heap memory)

        //Indexing of an array starts from 0
        System.out.println(numbersTwo[6]);
    }
}
