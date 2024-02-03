package fundamentals_01.FunctionsMethods_01_04;

public class FunctionOverloading {
    public static void main(String[] args) {
        fun(5);
        fun(5, 7);
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(int a, int b){
        System.out.println(a + " " + b);
    }

    /*
        Learning:
            1. Two or more functions of the same name can exist,
                    - if they have different number of arguments
                    - If they have different data type for arguments
    */
}
