package fundamentals_01.InputOutput_01_01;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println(num1+num2);
    }
}
