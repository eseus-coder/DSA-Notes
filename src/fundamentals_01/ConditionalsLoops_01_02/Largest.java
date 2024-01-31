package fundamentals_01.ConditionalsLoops_01_02;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        //To check the greatest of the three
        int max = a;
        if (b>max){
            max = b;
        }
        if (c>max) {
            max = c;
        }

        System.out.println("Max is " + max );

        //Using predefined functions
        int usingFunction = Math.max(a, b);
        int usingFunctionOnThree = Math.max(c, Math.max(a, b));
        System.out.println(usingFunction);
        System.out.println(usingFunctionOnThree);



        //Similarly for minimum value
        int min = a;
        int findingMinimum = Math.min(c, Math.min(a,b)); //Using predefined function

        if(b<min){
            min = b;
        }
        if(c<min){
            min=c;
        }
        System.out.println("Minimum " + min);
        System.out.println("From predefined method::" + findingMinimum);
    }
}
