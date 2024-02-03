package fundamentals_01.FunctionsMethods_01_04;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        boolean ans = isPrime(a);
        System.out.println(ans);
    }

    static boolean isPrime(int n){
        if (n<=1){
            System.out.println("Composite Number");
            return false;
        }

        int c = 2;
        while(c*c <= n) {
            if(n%c==0){
                System.out.println("Not Prime"); //As its divisible
                return false;
            }
            c++;
        }
        if(c*c>n){
            return true; //As it's not divisible
        }
        return false;

        //If it was to be simplified
        //return c * c > n; //As it's not divisible
    }
}
