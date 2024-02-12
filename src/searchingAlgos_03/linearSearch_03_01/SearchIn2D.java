package searchingAlgos_03.linearSearch_03_01;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] numberArray = {
                {8,5,6},
                {9,4,2}
        };

        int target = 2;

        int[] indices = searchInTwoD(numberArray, target);

        if (indices != null) {
            System.out.println("Element found at row: " + indices[0] + ", col: " + indices[1]);
        } else {
            System.out.println("Element not found in the 2D array.");
        }
    }

    static int[] searchInTwoD(int[][] arr, int target){
        if (arr.length == 0 ){
            return null;
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }

        return null;
    }
}

/*
Similarly we can search for min and max in the array.
Take the first element as the min, now while iterating check whether the current element is
less than the min element, if yes replace the element, otherwise keep iterating.
Same in the case of max element finding.
*/