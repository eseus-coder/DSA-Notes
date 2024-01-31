package fundamentals_01.ConditionalsLoops_01_02;

import java.util.Scanner;

//Count the occurrence of a digit in a number
public class OccurrencesInNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inputToCount = input.nextInt(); //This takes the digit whose occurrence is to be counted
        int inputFromCount = input.nextInt(); //This takes the number
        int temp = inputFromCount; //Just storing it for output otherwise not required

        int count = 0; //To keep the number of occurrences counted
        while(inputFromCount > 0){ //Till the number is > 0 because we are constantly updating the number
            int remainder = inputFromCount % 10; //Taking out the last digit from the number
            if(remainder == inputToCount){ //Checking the last digit
                count++; //Incrementing the count if found to be true
            }
            inputFromCount = inputFromCount / 10; //Updating the number by removing the last digit from the number
        }

        System.out.println("The number " + temp + " for digit "
                + inputToCount + " has " + count + " occurrences!");
    }
}
