package oop;

public class P02PositiveNegativeZero {

    public static void classifyNumber(int number) {
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    public static void main(String[] args) {
        System.out.println("classifyNumber(15)");
        System.out.println("Expected:\nPositive");
        System.out.println("Actual:");
        classifyNumber(15);
        System.out.println();

        System.out.println("classifyNumber(-4)");
        System.out.println("Expected:\nNegative");
        System.out.println("Actual:");
        classifyNumber(-4);
        System.out.println();

        System.out.println("classifyNumber(0)");
        System.out.println("Expected:\nZero");
        System.out.println("Actual:");
        classifyNumber(0);
    }
}
