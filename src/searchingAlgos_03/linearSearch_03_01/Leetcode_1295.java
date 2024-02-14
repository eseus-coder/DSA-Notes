package searchingAlgos_03.linearSearch_03_01;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class Leetcode_1295 {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int[] numsTwo = {555,901,482,1771};
        System.out.println(evenDigits(nums));
        System.out.println(evenDigits(numsTwo));
    }

    static int evenDigits(int[] arr){
        int numberThatAreEven = 0;

        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            // Counter to keep track of number of digits in a single number
            int evenCheck = 0;

            //taking the array element and putting it into a variable
            int iteratingElement = arr[i];

            //if the number is negative converting it into a positive one
            if (arr[i] == -1) {
                iteratingElement *= (-1);
            }

            //if the number is 0 from the beginning nothing can be done
            if (arr[i] == 0) {
                return 1;
            }

            //iterating through the whole number
            //by removing the last digit and every time a digit is removed
            //we increment the count
//            while(iteratingElement!=0){
//                iteratingElement /= 10; //Updating the number
//                evenCheck++;
//            }

            //Optimized way to find the number of digits with good old log
            evenCheck = (int)(Math.log10(iteratingElement)) + 1;

            //if the count that we got above, is 'even' then the count for
            //number of even digit numbers for the array is incremented by one
            if (evenCheck%2 == 0) {
                numberThatAreEven++;
            }
        }

        return numberThatAreEven;
    }
}
