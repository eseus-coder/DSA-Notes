package fundamentals_01.FunctionsMethods_01_04;

import java.util.Arrays;

//Java as a language is only and always Pass by Value and never pass by reference
public class PassByValue {
    public static void main(String[] args) {
        String name = "Arindam Bose";
        System.out.println("Name::" + name);

        //But if we are to modify an object than it will be reflected
        //in the original value as well
        int[] arr = {1,2,3,5,6,7};
        checkTheValue(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void checkTheValue(int[] nums) {
        nums[0] = 99;
    }

    static void passByValue(String name) {
        name = "Aaron Eseus"; //It is creating a new object
        System.out.println("Name::" + name);
    }
}
