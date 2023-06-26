package org.example;

public class Task1 {

    public static void main(String[] args) {

        String[][] stringTest = {{"1","2"}, {"3","4"}, {"abcde", "1337"}};
        System.out.println(sum2d(stringTest));
    }

    //первый ввариант
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int val;
                try {
                    val = Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    val = 0;
                }
                sum += val;
            }
        }
        return sum;
    }

}
