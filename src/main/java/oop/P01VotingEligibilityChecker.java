package oop;

public class P01VotingEligibilityChecker {

    public static void checkVotingEligibility(int age) {
        // Check if the age is 18 or older
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            // Otherwise, they are under 18
            System.out.println("Not eligible to vote");
        }
    }

    public static void main(String[] args) {
        // Test Case 1: 20 years old
        System.out.println("Test 1 (Expected: Eligible to vote):");
        checkVotingEligibility(20);
        
        System.out.println(); // blank line for spacing

        // Test Case 2: 16 years old
        System.out.println("Test 2 (Expected: Not eligible to vote):");
        checkVotingEligibility(16);
    }
}
