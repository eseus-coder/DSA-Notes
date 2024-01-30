package fundamentals_01.InputOutput_01_01;

//Primitives: are any datatype that you can not break ay further
public class Primitives {
    public static void main(String[] args) {
        //Primitives
        int rollNo = 64;
        char letter = 'A';
        float marks = 98.67f;
        double largeNumbers = 87654567.8765456; //Large decimal values
        long largeInteger = 8765456L; //Large integer
        boolean check = true;

        //Not primitives
        String name = "Arindam";

        //Wrapper: is used to get additional functionalities which are not there in primitives
        //will be covered in oops
        Integer rollNumber = 64;
        System.out.println(rollNumber.compareTo(rollNo));

        //Literals and identifier
        String thisIsAIdentifier = "thisIsALiteral";
    }
}
