package searchingAlgos_03.linearSearch_03_01;

import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char targetCharachter = input.next().charAt(0);

        String search = "Arise";

        boolean existsOrNot = searchString(search, targetCharachter);
        System.out.println(existsOrNot);
    }

    static boolean searchString(String stringSearch, char target){
        if (stringSearch.length() == 0 ){
            return false;
        }

        for (int i = 0; i < stringSearch.length(); i++) {
            if (stringSearch.charAt(i) == target) {
                return true; // To return the element index
            }
        }
        return false;
    }
}
