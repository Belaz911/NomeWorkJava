package Lesson2;

public class Main {


    public static void main(String[] args) {
        System.out.println(checkSum(5,6));
        checkPositiveNegative(100);
        System.out.println(isIntegerOrNot(122.1));
        isStringAndNumber("Hello",34);
    }

    public static boolean checkSum(int sum,int sum2) {
        boolean result = sum + sum2 >= 10 && sum + sum2 <= 20;
        return result;

    }
    public static void checkPositiveNegative(int num) {

        if (num >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    public static boolean isIntegerOrNot(double num) {
        if (num %1 == 0) {
            return true;
        }
        return false;
    }
    public static void isStringAndNumber(String word,int num) {
        for (int i = 0; i < 6; i ++) {
            System.out.println(word + " " + num );
        }
    }
}
