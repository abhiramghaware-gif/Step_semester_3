package arrays;

public class P06ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        // Loop through each number in the array
        for (int i = 0; i < nums.length; i++) {
            
            // Compare it with all the numbers that come after it
            for (int j = i + 1; j < nums.length; j++) {
                
                // If they are exactly the same, we found a duplicate
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        
        // If the loops finish and no duplicates were found, return false
        return false;
    }

    public static void main(String[] args) {
        // Test Case 1: Has a duplicate (the number 1)
        int[] test1 = {1, 2, 3, 1};
        System.out.println("Test 1 (Expected true): " + containsDuplicate(test1));

        // Test Case 2: Has no duplicates
        int[] test2 = {1, 2, 3, 4};
        System.out.println("Test 2 (Expected false): " + containsDuplicate(test2));
    }
}
