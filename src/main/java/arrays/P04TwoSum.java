package arrays;

import java.util.Arrays;

public class P04TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        // Look at every number in the array
        for (int i = 0; i < nums.length; i++) {
            
            // Look at every number that comes AFTER the current one
            for (int j = i + 1; j < nums.length; j++) {
                
                // If they add up to the target, return their positions
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        // If no match is found, return an empty array
        return new int[]{};
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] nums1 = {2, 7, 11, 15};
        System.out.println("Test 1 (Expected [0, 1]): " + Arrays.toString(twoSum(nums1, 9)));

        // Test Case 2
        int[] nums2 = {3, 2, 4};
        System.out.println("Test 2 (Expected [1, 2]): " + Arrays.toString(twoSum(nums2, 6)));
    }
}
