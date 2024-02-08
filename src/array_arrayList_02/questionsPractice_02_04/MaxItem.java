package array_arrayList_02.questionsPractice_02_04;

public class MaxItem {
    public static void main(String[] args) {
        int[] numbers = {1,2,6,4,5, 8, 10, 11, 423, 536, 5};
        max(numbers);

        maxInRange(numbers, 2, 8);
    }

    static void max(int[] arr){

        int maxElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxElement){
                maxElement = arr[i];
            }
        }

        System.out.println("Max element is::" + maxElement);
    }

    //Max element in a range
    static void maxInRange(int[] arr, int range1, int range2){

        int maxElement = arr[range1];
        for (int i = range1; i < range2; i++) {
            if (arr[i] > maxElement){
                maxElement = arr[i];
            }
        }

        System.out.println("Max element in range " + range1 + " & " + range2 + " is::" + maxElement);
    }

}
