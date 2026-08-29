package arrays;

import java.util.Arrays;

public class P04TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        System.out.println("twoSum(new int[]{2, 7, 11, 15}, 9)");
        System.out.println("Expected:\n[0, 1]");
        System.out.println("Actual:");
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println();

        System.out.println("twoSum(new int[]{3, 2, 4}, 6)");
        System.out.println("Expected:\n[1, 2]");
        System.out.println("Actual:");
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
    }
}
