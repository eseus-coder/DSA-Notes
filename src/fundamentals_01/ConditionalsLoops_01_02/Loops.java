package fundamentals_01.ConditionalsLoops_01_02;

public class Loops {
    public static void main(String[] args) {
        //For Loops
        /*
            for(initialisation; cnodition; increment/decrement){
                //body
            }
        */
//        int num = 5;
//        for(int i = 1; i<=5; i++){
//            System.out.println(i);
//        }

        //User inputted numbers
//        Scanner input = new Scanner(System.in);
//        int numberFromUser = input.nextInt();
//
//        for (int i = 1; i<=numberFromUser; i++){
//            System.out.println("User::" + i);
//        }


        //While Loops
        /*
            while(condition) {
                //body
            }
        */

//        int i = 1;
//        while (i<=5){
//            System.out.println(i);
//            i++;
//        }


        //Do-While Loop : This loop executes at least once
        /*
            do{

            } while(condition);
        */

        int i = 2;
        do {
            System.out.print(i + " ");
            i+=3;
        } while (i<=100);
    }
}
