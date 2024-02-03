package fundamentals_01.FunctionsMethods_01_04;

import java.util.Scanner;

/*
 An armstrong number is the cube and sum of all the digits in the said number
 If after sum and cube, the result is equal to the original number than it is an armstrong number
*/
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int numberToCheck = input.nextInt();
//        boolean result = armstrongNumber(numberToCheck);
//        System.out.println(result);

        //To print armstrong numbers in a range
        for(int i=100; i<1000; i++){
            if(armstrongNumber(i)){
                System.out.print(" " + i);
            }
        }
    }

    static boolean armstrongNumber(int n){
        int temp = n;
        int sum = 0;

        while(n>0){
            int remainder = n%10;
            n = n / 10;
            int cube = remainder * remainder * remainder;
            sum += cube;

        }

        if (temp == sum){
            return true;
        } else {
            return false;
        }
    }
}
