package org.example;

public class multidmnsarrayj {
    public static void main(String[] args) {

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers.length);
        System.out.println(myNumbers[0].length);
        System.out.println(myNumbers[1].length);

        for (int[] myNumber : myNumbers) {
            for (int i : myNumber) {
                System.out.println(i);
            }
        }

       //can also be written in this way
//        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
//        for (int i = 0; i < myNumbers.length; ++i) {
//            for(int j = 0; j < myNumbers[i].length; ++j) {
//                System.out.println(myNumbers[i][j]);
//            }
//        }
    }
}
