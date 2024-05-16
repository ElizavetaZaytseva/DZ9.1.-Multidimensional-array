package app;

import java.util.Random;



public class Arrays {
    public static void main(String[] args) {
        int row = 4;
        int column = 4;

        int[][] table = new int[row][column];
        Random random = new Random();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                table[i][j] = random.nextInt(100) + 1;
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }


        int sumEvenRows = 0;
        int sumOddRows = 0;
        long multiplicationEvenColumns = 1;
        long multiplicationOddColumns = 1;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {

                if (i % 2 == 0) {
                    sumEvenRows += table[i][j];
                }
                if (i % 2 != 0) {
                    sumOddRows += table[i][j];
                }
                if (j % 2 == 0) {
                    multiplicationEvenColumns *= table[i][j];
                }
                if (j % 2 != 0) {
                    multiplicationOddColumns *= table[i][j];
                }
            }
        }
        System.out.println("Sum of elements in even rows :" + sumEvenRows);
        System.out.println("Sum of elements in odd rows: " + sumOddRows);
        System.out.println("Multiplication of elements in even Columns :" + multiplicationEvenColumns);
        System.out.println("Multiplication of elements in odd Columns : " + multiplicationOddColumns);


        int sumFirstrow = 0;
        int sumRow = 0;
        int sumColumns = 0;
        int sumDiagonal1 = 0;
        int sumDiagonal2 = 0;

        for (int j = 0; j < table.length; j++) {
            sumFirstrow += table[0][j];
        }
        for (int i = 0; i < table.length; i++) {
            sumDiagonal1 += table[i][i];
            sumDiagonal2 += table[i][table.length - 1 - i];

            for (int j = 0; j < table.length; j++) {
                sumRow += table[i][j];
                sumColumns += table[j][i];
            }
        }

        boolean isMagicSquare=false;
        if (sumFirstrow == sumDiagonal1 || sumFirstrow == sumDiagonal2||sumFirstrow == sumRow||sumFirstrow == sumColumns) {
            System.out.println("The matrix is a magic square");
        } else {
            System.out.println("The matrix is not a magic square");
        }
    }
}

