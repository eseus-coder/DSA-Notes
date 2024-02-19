package searchingAlgos_03.binarySearch_03_02;
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
// Refer the Ceiling_Floor_Increasing_Order.java and notebook

/*
* As the idea is only to find the greater than charachter, that is we removed the target === middle check.
* As we dont need to verify that.
* */
public class Leetcode_744 {
    public static void main(String[] args) {

        char[] array = {'c','f','j'};
        char target = 'c';

        System.out.println(ceilingCharachterOfTheArray(array, target));
    }

    static char ceilingCharachterOfTheArray(char[] array, char target){


        // Two pointers
        int startIndex = 0;
        int endIndex = array.length - 1;

        while(startIndex<=endIndex){

            //Finding the middle element
            int middle = startIndex + ((endIndex - startIndex)/2);


            if (target >= array[middle]){
                startIndex = middle + 1;

            } else {
                endIndex = middle - 1;

            }
        }

        // Test case 3, or the wrap around condition (if not present in the array than return
        // the first element)
        if (startIndex == array.length) {
            return array[0];
        }

        //Modulo will basically return the char at startIndex : For optimized sol
//        return array[startIndex % array.length];
        return array[startIndex];
    }
}
