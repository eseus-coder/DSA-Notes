package fundamentals_01.FunctionsMethods_01_04;

public class Scoping {
    //Function/Method scopes
    //Block scopes
    //Loop Scopes
    //Shadowing : As in to declare two variables with the same name, and the lower level can
        //overlap/replace the upper level


    static int x= 10; //Shadowing for class variable

    public static void main(String[] args) {
        x = 20; //Shadowing
        System.out.println(x);
    }
}
