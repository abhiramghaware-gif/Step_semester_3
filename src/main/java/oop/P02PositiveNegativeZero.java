package oop;

public class P02PositiveNegativeZero {

    public static void classifyNumber(int number) {
        // If the number is greater than 0, it's positive
        if (number > 0) {
            System.out.println("Positive");
        } 
        // If the number is less than 0, it's negative
        else if (number < 0) {
            System.out.println("Negative");
        } 
        // Otherwise, it must be exactly 0
        else {
            System.out.println("Zero");
        }
    }

    public static void main(String[] args) {
        // Test Case 1
        System.out.println("Test 1 (Expected: Positive):");
        classifyNumber(15);
        
        System.out.println(); // blank line

        // Test Case 2
        System.out.println("Test 2 (Expected: Negative):");
        classifyNumber(-4);
        
        System.out.println(); // blank line

        // Test Case 3
        System.out.println("Test 3 (Expected: Zero):");
        classifyNumber(0);
    }
}
