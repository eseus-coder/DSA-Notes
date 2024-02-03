package fundamentals_01.FunctionsMethods_01_04;

public class FunctionSum {
    public static void main(String[] args) {
        System.out.println("Its A");
        something();

        //Stored returned value of the funtion in a variable and displayed it
        int result = functionName(5, 7); //These are called arguments when data is passed
        System.out.println("Result::" + result);

        //String return type function
        String stringResult = functionString();
        System.out.println("String type::" + stringResult);

        //When pressed alt+enter it creates the function if the function already doesnt exists
        String functionCreationTesting = functionTesting();
    }

    private static String functionTesting() {
        String tesing="";
        return tesing;
    }

    public static void something() {
        System.out.println("Its B");
    }

    /*
    Syntax of Functions/Methods:-
      access modifier return_type fundtion_name(arguments){
        //Body
        return statement;
      }
    */

    /*
        Learnings: -
            1. If the main function is static, and from that any other function is to be called
                then that function also needs to be static
    */

    //Function with return statement (returning an integer value)
    static int functionName(int a, int b){ //These are called parameters when defining in function
        int sum = a + b;
        return sum;
    }

    //Function with return statement of string
    static String functionString(){
        String greeting = "How are you?";
        return greeting;
    }
}
