package searchingAlgos_03.linearSearch_03_01;
//https://leetcode.com/problems/richest-customer-wealth/description/

public class Leetcode_1672 {
    public static void main(String[] args) {
        int[][] num1 = {
                {1,2,3},
                {3,2,1}
        };
        int[][] num2 = {
                {1,5},
                {7,3},
                {3,5}
        };
        int[][] num3 = {
                {2,8,7},
                {7,1,3},
                {1,9,5}
        };
        System.out.println(richestWealth(num1));
        System.out.println(richestWealth(num2));
        System.out.println(richestWealth(num3));
    }

    static int richestWealth(int[][] arr){

        int maxWealth = 0;

        for (int row = 0; row < arr.length; row++) {
            int totalWealthPerAccount = 0;

            for (int col = 0; col < arr[row].length; col++) {
                totalWealthPerAccount += arr[row][col];
            }

            if (totalWealthPerAccount > maxWealth) {
                maxWealth = totalWealthPerAccount;
            }
        }

        return maxWealth;
    }

}
