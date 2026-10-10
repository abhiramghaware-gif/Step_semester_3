import java.util.Arrays;

public class L5_RotateArray {
    public static int[] rotateArray(int[] nums, int k) {
        int length = nums.length;
        if (length == 0) return nums;
        
        k = k % length;
        int[] newArray = new int[length];
        
        for (int i = 0; i < length; i++) {
            int newPosition = (i + k) % length;
            newArray[newPosition] = nums[i];
        }
        
        for (int i = 0; i < length; i++) {
            nums[i] = newArray[i];
        }
        
        return newArray;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        System.out.println(Arrays.toString(rotateArray(nums, k)));
    }
}
