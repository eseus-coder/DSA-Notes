package fundamentals_01.ConditionalsLoops_01_02;

import java.util.Scanner;

//Given a number output the reverse of it
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inputTheNumberToReverse = input.nextInt();

        int result = 0; //This is where we will store the reverse number
        while(inputTheNumberToReverse>0){ //As we will keep updating the value, run the loop till it is > 0
            int remainder = inputTheNumberToReverse % 10; //Getting the last digit
            result = result * 10 + remainder; //Adding/Appending the last digit to the result
            inputTheNumberToReverse = inputTheNumberToReverse / 10; //Updating the number
        }

        System.out.println("Reverse is::" + result);
    }
}
