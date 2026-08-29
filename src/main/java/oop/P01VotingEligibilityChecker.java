package oop;

public class P01VotingEligibilityChecker {

    public static void checkVotingEligibility(int age) {
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }

    public static void main(String[] args) {
        System.out.println("checkVotingEligibility(20)");
        System.out.println("Expected:\nEligible to vote");
        System.out.println("Actual:");
        checkVotingEligibility(20);
        System.out.println();

        System.out.println("checkVotingEligibility(16)");
        System.out.println("Expected:\nNot eligible to vote");
        System.out.println("Actual:");
        checkVotingEligibility(16);
    }
}
