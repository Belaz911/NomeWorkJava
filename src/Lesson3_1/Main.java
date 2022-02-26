package Lesson3_1;

import java.sql.SQLOutput;

    public class Main {

        public static void main(String[] args) {
            replaceOnesAndZeros();
            isFillInNumbers();
            isMultiply();
            isSymbolsDiagonal();



        }

        public static void replaceOnesAndZeros() {
            int[] zerosOnes = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0};
            for (int i = 0; i < zerosOnes.length; i++) {
                if (zerosOnes[i] == 0) {
                    zerosOnes[i] = 1;
                } else {
                    zerosOnes[i] = 0;
                }
                System.out.println(zerosOnes[i]);
            }
            System.out.println();
        }

        public static void isFillInNumbers() {
            int[] num = new int[100];
            for (int i = 0; i < num.length; i++) {
                num[i] = i + 1;

                System.out.println(num[i]);
            }
            System.out.println();

        }

        public static void isMultiply() {
            int[] num = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

            for (int i = 0; i < num.length; i++) {
                if (num[i] < 6 && num[i] >= 0) {
                    num[i] = num[i] * 2;
                }

                System.out.println(num[i]);
            }
            System.out.println();
        }

        public static void isSymbolsDiagonal() {
            int[][] table = new int[5][5];
            for (int i = 0; i < table.length; i++) {
                for (int j = 0; j < table.length; j++) {

                    table[0][0] = 1;
                    table[1][1] = 1;
                    table[2][2] = 1;
                    table[3][3] = 1;
                    table[4][4] = 1;
                    table[4][0] = 1;
                    table[3][1] = 1;
                    table[1][3] = 1;
                    table[0][4] = 1;

                    System.out.print(table[i][j] + " ");
                }
                System.out.println();
            }
        }

        public static int[] isReturn(int len, int initialValue) {
            int[] num = new int[len];
            for (int i = 0; i < num.length; i++) {
                num[i] = initialValue;
            }
            //Не догнал как вывести результат
            return num;

        }
    }



