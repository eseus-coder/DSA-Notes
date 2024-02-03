package fundamentals_01.FunctionsMethods_01_04;

import java.util.Arrays;

//Variable number of arguments: essentially we can pass n number of arguments
public class VariableArgs {
    public static void main(String[] args) {
        fun(1,3,4,4,6,7,87,87,869,90);
        fun2(10,20,"Arindam", "Bose", "Aaron", "Eseus");
    }

    private static void fun2(int i, int i1, String ...eseus) {
        System.out.println(Arrays.toString(eseus));
    }

    static void fun(int ...arg){
        System.out.println(Arrays.toString(arg));
    }

    /*
        Learning:
            1. Variable length args to be always provided at the end as an argument
    */
}
