package array_arrayList_02.questionsPractice_02_04;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] numbers = {1,2,6,4,5, 8, 10, 11, 423, 536, 5};
        reverse(numbers);

        System.out.println(Arrays.toString(numbers));
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<end){
            Swap.swap(arr, start, end);
            start++;
            end--;
        }
    }
}
