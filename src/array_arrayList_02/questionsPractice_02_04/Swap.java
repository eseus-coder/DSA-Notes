package array_arrayList_02.questionsPractice_02_04;

import java.util.ArrayList;
import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        //Function call with arguments
        swap(numbers, 0, 4);

        System.out.println(Arrays.toString(numbers));

        swapWithout(numbers, 1, 3);

        System.out.println(Arrays.toString(numbers));

    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    //without using third variable
    static void swapWithout(int[] arr, int index1, int index2){
        arr[index1] = arr[index1] + arr[index2];
        arr[index2] = arr[index1] - arr[index2];
        arr[index1] = arr[index1] - arr[index2];
    }

    //Same can be done with the XOR bitwise operator as well
    // ^
}
