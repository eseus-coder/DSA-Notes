//package: folder in which the java files lies
package fundamentals_01.InputOutput_01_01;

import java.util.Scanner;

//Main or .java filename: Is from where the code starts to exit
//class: name of group of functions
//public: is an access modifier (accessible from everywhere)
//public class should be the same name as that of file name
public class InputOutput {

    //static: is so that we don't have to create an object of InputOutput class, as it will remain same
    //void: it is the return type of the function
    //String[] args: cmd line arguments (whatever cmd is given from the terminal)
    public static void main(String[] args) {

        //output
        System.out.println("Output");

        //input
        //Scanner: is a class using whose objects of input stream we take inputs
        Scanner input = new Scanner(System.in);
        //System.out.println(input.next()); //To take input but will print only the first string
        //System.out.println(input.nextInt()); //To take integer as an input
        //System.out.println(input.nextLine()); //To take whole line as an input

        int rollNumber = input.nextInt();
        float marksInDecimal = input.nextFloat();
        System.out.println(marksInDecimal);
    }
}
