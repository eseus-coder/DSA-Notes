package searchingAlgos_03.linearSearch_03_01;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] array =  {11, 8, 78, 12, 2, 4, 85};
        System.out.println(minNumberArray(array));
    }

    static int minNumberArray(int[] arr){
        if (arr.length == 0 ){
            return -1;
        }

        int minNumber = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minNumber) {
                minNumber = arr[i];
            }
        }

        return minNumber;
    }
}
