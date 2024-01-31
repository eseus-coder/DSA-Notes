package fundamentals_01.ConditionalsLoops_01_02;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //trim() : to remove the whitespaces
        //charAt() : to get the charachter at 0th index
        char valueFromUser = input.next().trim().charAt(0);

        //We are using the concept of ASCII here
        if (valueFromUser>='a' && valueFromUser<='z') {
            System.out.println("Lowercase");
        } else if (valueFromUser>='A' && valueFromUser<='Z') {
            System.out.println("Uppercase");
        } else {
            System.out.println("Some symbol!");
        }

        System.out.println(valueFromUser);
    }
}
