public class Main {
    public static void main(String[] args) {
        // OOP problems
        System.out.println("Voting Eligibility:");
        P01VotingEligibilityChecker.checkVotingEligibility(20);
        P01VotingEligibilityChecker.checkVotingEligibility(16);
        System.out.println();

        System.out.println("Positive/Negative/Zero:");
        P02PositiveNegativeZero.classifyNumber(15);
        P02PositiveNegativeZero.classifyNumber(-4);
        P02PositiveNegativeZero.classifyNumber(0);
        System.out.println();

        System.out.println("Print Numbers Up to N:");
        P03PrintNumbersUpToN.printNumbersUpToN(5);
        System.out.println();

        // Array problems
        System.out.println("Two Sum:");
        int[] twoSumResult = P04TwoSum.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(java.util.Arrays.toString(twoSumResult));
        System.out.println();

        System.out.println("Best Time to Buy and Sell Stock:");
        System.out.println(P05BestTimeToBuySellStock.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println();

        System.out.println("Contains Duplicate:");
        System.out.println(P06ContainsDuplicate.containsDuplicate(new int[]{1, 2, 3, 1}));
        System.out.println(P06ContainsDuplicate.containsDuplicate(new int[]{1, 2, 3, 4}));
    }
}
