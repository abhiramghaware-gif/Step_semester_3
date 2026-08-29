package oop;

public class P03PrintNumbersUpToN {

    public static void printNumbersUpToN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        System.out.println("printNumbersUpToN(5)");
        System.out.println("Expected:\n1\n2\n3\n4\n5");
        System.out.println("Actual:");
        printNumbersUpToN(5);
    }
}
