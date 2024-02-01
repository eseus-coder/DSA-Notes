package fundamentals_01.Switch_01_03;

import java.util.Scanner;

//This only describes basic syntax and its usage
public class SwitchBasics {
    public static void main(String[] args) {
        //Difference between == and .equals()
        //.equal() only checks for the value
        //== checks for both value and reference


        /*
        //Older syntax
            switch(expression){
                case 1:
                    //Code
                    break;
                case 2:
                    //Code
                    break;
                default:
                    //Code
            }

            Rules to follow:
                1. case have to be the same type as expression (constants or literals)
                2. within every case break should be there, to terminate the code
                    - If break is not there, then it would move on to the next case
                3. Default is there when no case matches
                    - If no default is given put "break" at the end
        */

        Scanner input = new Scanner(System.in);
        String fruitInput = input.next();

        switch (fruitInput){
            case "mango":
                System.out.println("King");
                break;
            case "apple":
                System.out.println("Red");
                break;
            default:
                System.out.println("Nothing");
        }


        /*
        //New Syntax
            switch (fruitInput) {
                case "mango" -> System.out.println("King");
                case "apple" -> System.out.println("Red");
                default -> System.out.println("Nothing");
            }
        */

        //Similar implementation of it would be to find out the day based on 1-7 number
        //Similar implementation of it would be to find out the weekday/weekend based on 1-7 number

        /*
         //Nested Switch
             switch(expression){
                    case 1:
                        switch(expression){
                            case 1:
                                //Code
                                break;
                            case 2:
                                //Code
                                break;
                            default:
                                //Code
                        }
                        break;
                    case 2:
                        //Code
                        break;
                    default:
                        //Code
              }
        */
    }
}
