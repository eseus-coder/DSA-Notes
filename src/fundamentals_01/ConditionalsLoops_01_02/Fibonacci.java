package fundamentals_01.ConditionalsLoops_01_02;

import java.util.Scanner;

//Finding nth fibonacci number
public class Fibonacci {
    public static void main(String[] args) {
        //Fibo: is the sum of last two numbers
        //0 1 1 2 3 5 8 13 . . . . . .
        int a = 0; //First number in sequence
        int b = 1; //Second number in sequence

        Scanner input = new Scanner(System.in);

        int nthTerm = input.nextInt();

        if (nthTerm == 1) {
            System.out.println("Number is::" + a);
        } else if (nthTerm == 2 || nthTerm == 3) {
            System.out.println("Number is::" + b);
        } else {
            for (int i = 2; i<=nthTerm; i++) {
                int temp = b;
                b = a + b; //Updating
                a = temp;
            }
            System.out.println("Number is::" + b);
        }
    }
}
