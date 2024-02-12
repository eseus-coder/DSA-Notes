package searchingAlgos_03.linearSearch_03_01;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int leftRange = input.nextInt();
        int leftRange = 0;
//        int rightRange = input.nextInt();
        int rightRange = 3;

        int toSearch = 78;
        int[] array =  {1, 8, 78, 12, 2, 4, 85};

        int number = searchRange(array, leftRange, rightRange, toSearch);
        System.out.println(number);
    }

    static int searchRange(int[] arr, int leftRange, int rightRange, int target){
        if (arr.length == 0 ){
            return -1;
        }

        for (int i = leftRange; i < rightRange; i++) {
            if (arr[i] == target) {
                return i; //To return the element index
            }
        }

        return -1;
    }
}

