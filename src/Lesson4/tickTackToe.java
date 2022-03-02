package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class tickTackToe {

    public static void main(String[] args) {
        String[][] map = initMap(5);
        boolean isGameActive = true;

        System.out.println();
        System.out.println("Да начнётся Игра!");
        System.out.println();

        while (isGameActive) {
            printMap(map);
            System.out.println();
            playerTurn(map);
            printMap(map);
            System.out.println();
            if (isWinner("X", map) || isDraw(map)) {
                isGameActive = false;
                break;
            }

            compTurn(map);
            printMap(map);
            if (isWinner("0", map) || isDraw(map)) {
                isGameActive = false;
                break;
            }
            System.out.println();
            System.out.println("Копьютер сделал ход!");
            System.out.println();
        }


        }

        public static boolean isWinner(String mark, String[][] map) {
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map.length; j++) {
                    if (
                        (map[0][0].equals(mark) && map[0][1].equals(mark) && map[0][2].equals(mark) && map[0][3].equals(mark))
                                || (map[0][1].equals(mark) && map[0][2].equals(mark) && map[0][3].equals(mark) && map[0][4].equals(mark))
                                || (map[1][0].equals(mark) && map[1][1].equals(mark) && map[1][2].equals(mark)&& map[1][3].equals(mark))
                                || (map[1][1].equals(mark) && map[1][2].equals(mark) && map[1][3].equals(mark)&& map[1][4].equals(mark))
                                || (map[2][0].equals(mark) && map[2][1].equals(mark) && map[2][2].equals(mark) && map[2][3].equals(mark))
                                || (map[2][1].equals(mark) && map[2][2].equals(mark) && map[2][3].equals(mark) && map[2][4].equals(mark))
                                || (map[3][0].equals(mark) && map[3][1].equals(mark) && map[3][2].equals(mark)&& map[3][3].equals(mark))
                                || (map[3][1].equals(mark) && map[3][2].equals(mark) && map[3][3].equals(mark)&& map[3][4].equals(mark))
                                || (map[4][0].equals(mark) && map[4][1].equals(mark) && map[4][2].equals(mark) && map[4][3].equals(mark))
                                || (map[4][1].equals(mark) && map[4][2].equals(mark) && map[4][3].equals(mark) && map[4][4].equals(mark))

                    ) {
                    System.out.println(mark + " " + "Победил");
                    return true;
                }

                }  if (
                    (map[0][0].equals(mark) && map[1][0].equals(mark) && map[2][0].equals(mark) && map[3][0].equals(mark))
                            || (map[1][0].equals(mark) && map[2][0].equals(mark) && map[3][0].equals(mark)&& map[4][0].equals(mark))
                            || (map[0][1].equals(mark) && map[1][1].equals(mark) && map[2][1].equals(mark) && map[3][1].equals(mark))
                            || (map[1][1].equals(mark) && map[2][1].equals(mark) && map[3][1].equals(mark) && map[4][1].equals(mark))
                            || (map[0][2].equals(mark) && map[1][2].equals(mark) && map[2][2].equals(mark) && map[3][2].equals(mark))
                            || (map[1][2].equals(mark) && map[2][2].equals(mark) && map[3][2].equals(mark) && map[4][2].equals(mark))
                            || (map[0][3].equals(mark) && map[1][3].equals(mark) && map[2][3].equals(mark) && map[3][3].equals(mark))
                            || (map[1][3].equals(mark) && map[2][3].equals(mark) && map[3][3].equals(mark) && map[4][3].equals(mark))
                            || (map[0][4].equals(mark) && map[1][4].equals(mark) && map[2][4].equals(mark)&& map[3][4].equals(mark))
                            || (map[1][4].equals(mark) && map[2][4].equals(mark) && map[3][4].equals(mark)&& map[4][4].equals(mark))

                ) {
                System.out.println(mark + " " + "Победил");
                return true;
            }

            }  if (
                (map[0][0].equals(mark) && map[1][1].equals(mark) && map[2][2].equals(mark) && map[3][3].equals(mark))
                        || (map[1][1].equals(mark) && map[2][2].equals(mark) && map[3][3].equals(mark) && map[4][4].equals(mark))
                        || (map[0][4].equals(mark) && map[1][3].equals(mark) && map[2][2].equals(mark) && map[3][1].equals(mark))
                        || (map[1][3].equals(mark) && map[2][2].equals(mark) && map[3][1].equals(mark) && map[4][0].equals(mark))
            ) {
                System.out.println(mark + " " + "Победил");
                return true;
            } else {
                return false;
            }

        }

        public static boolean isDraw(String[][] map) {
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map.length; j++) {
                    if (map[i][j].equals(".")) {
                        return false;
                    }
                }
            }
            System.out.println("Ничья!");

        return true;
        }

        public static void playerTurn(String[][] map) {
            System.out.println("Ход игрока,сделайте свой ход!");

            Scanner sc = new Scanner(System.in);

            boolean isActiveTurn = true;

            while (isActiveTurn) {

                int x = sc.nextInt();
                int y = sc.nextInt();

                if ((x > 0 && x <= map[0].length) && (y > 0 && y <= map.length)) {
                    if (map[x - 1][y - 1].equals(".")) {
                        map[x -1 ][y - 1] = "X";
                        isActiveTurn = false;
                    } else {
                        System.out.println("Ячейка уже занята");
                    }
                } else {
                    System.out.println("Вы вышли за пределы поля");
                }
            }
        }

        public static void compTurn(String[][] map) {
            System.out.println("Ход Компьютера!");
            System.out.println();

            Random random = new Random();

            boolean isActiveTurn = true;

            while (isActiveTurn) {

                int x = random.nextInt(map[0].length);
                int y = random.nextInt(map.length);

                if (map[x][y].equals(".")) {
                    map[x][y] = "0";
                    isActiveTurn = false;
                }
            }

         }
        public static String[][] initMap(int size) {
            String[][] map = new String[size][size];
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map.length; j++) {

                    map[i][j] = ".";

                }
            }
            return map;
        }
        public static void printMap(String[][] map) {
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map.length; j++) {

                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }

        }

}
