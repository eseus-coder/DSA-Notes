package fundamentals_01.ConditionalsLoops_01_02;

public class Conditionals {
    public static void main(String[] args) {
        //If-else (T or F)
        int salary = 5000;
        if(salary>10000){
            System.out.println("Bigger");
        } else if (salary==5000) {
            System.out.println("Same");
        } else {
            System.out.println("Smaller");
        }
    }
}
