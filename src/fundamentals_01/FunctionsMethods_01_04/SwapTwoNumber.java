package fundamentals_01.FunctionsMethods_01_04;

public class SwapTwoNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);
    }
}
