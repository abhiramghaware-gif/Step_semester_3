package oop;

public class P03PrintNumbersUpToN {

    public static void printNumbersUpToN(int n) {
        // Start counting from 1. Keep going as long as i is less than or equal to n. Add 1 each time.
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // Test Case 1: Print numbers 1 through 5
        System.out.println("Test 1 (Expected: 1 2 3 4 5 on separate lines):");
        printNumbersUpToN(5);
    }
}
