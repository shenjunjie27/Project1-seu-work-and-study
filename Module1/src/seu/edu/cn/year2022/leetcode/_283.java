package seu.edu.cn.year2022.leetcode;

public class _283 {
    class Solution {
        public void moveZeroes(int[] nums) {
            if (nums == null)
                return;


            int j = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[j] = nums[i];
                    j++;
                }
            }
            for (int i = j; i < nums.length; i++) {
                nums[i] = 0;
            }


        }
    }
}
