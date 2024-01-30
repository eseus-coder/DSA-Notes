package fundamentals_01.InputOutput_01_01;

public class TypeCasting {
    public static void main(String[] args) {
        //From smaller to bigger datatype it can move but only through compatible datatypes
        //Like int cannot convert to float if given as an input
        //But float can convert to int if given as an input
        //This is also called implicit type conversion


        //Explicit conversion or typecasting
        int explicit = (int)(67.56f); //Converts the float to int explicitly
        System.out.println(explicit);

        //Automatic type promotion in expression
        int promotion = 257;
        //Rule 1: All the byte, short, char values are converted into int
        //Rule 2: If the operand is float, double, long then the whole expression will be
        //converted into same


        //Max value byte can handle is 256, but as we are trying to
        //accomodate more it only stores the remainder of the two using modulo 257%256=1
        byte promoted = (byte)(promotion);
        System.out.println(promoted);

        //Then what is happening here?
        byte a = 40;
        byte b = 40;
        int c = a*b;
        //Here java automatically promotes the byte to int
        System.out.println(c);

        int z = 'A'; //Automatic type conversion (ASCII value)
        System.out.println(z);


        //When to use while and for loop?
        //Ans: When you know the number of iterations go with for loop and when you dont
        //go with while loop
    }
}
