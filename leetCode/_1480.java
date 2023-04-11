package leetCode;

import java.util.Arrays;

public class _1480 {
//    Input: nums = [1,2,3,4]
//    Output: [1,3,6,10]
//    Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
    public static void main(String[] args) {
        int[] nums = {1,5};
        System.out.println(Arrays.toString(nums(nums)));
    }

    public static int[] nums(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        return nums;
    }
}
