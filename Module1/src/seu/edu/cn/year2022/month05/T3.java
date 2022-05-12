/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-05-02 16:13:52.038-+08:00
 */

package seu.edu.cn.year2022.month05;

import java.util.*;

public class T3 {
    public static void main(String[] args) {
        T3.Solution solution = new T3().new Solution();
        int[] nums = {1, 2, 3};
        System.out.println(solution.permute(nums));

    }

    class Solution {
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> output = new ArrayList<>();
            for (int num : nums) {
                output.add(num);
            }
            int n = nums.length;
            backtrack(n, output, res, 0);
            return res;
        }

        //回溯法

        public void backtrack(int n, List<Integer> output, List<List<Integer>> res, int first) {
            // 所有数都填完了
            if (first == n) {
                List<Integer> temp = new ArrayList<Integer>(output);
                res.add(temp);

            }
            for (int i = first; i < n; i++) {
                // 动态维护数组
                Collections.swap(output, first, i);
                // 继续递归填下一个数
                backtrack(n, output, res, first + 1);
                // 撤销操作
                Collections.swap(output, first, i);
            }
        }
    }
}
