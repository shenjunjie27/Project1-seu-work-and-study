/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-05-13 12:03:23.074-+08:00
 */

package seu.edu.cn.year2022.month05;

public class T5 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, -1};
        new T5().sortArray(nums);
        for(int num : nums) {
            System.out.println(num);
        }

    }

    void swap(int[] nums, int i, int j) {
        if (i == j) return;
        nums[i] = nums[i] ^ nums[j];
        nums[j] = nums[i] ^ nums[j];
        nums[i] = nums[i] ^ nums[j];
    }

    int rand_partition(int[] nums, int left, int right) {
        int pos = left + (int) (Math.random() * (right - left));
        swap(nums, left, pos);
        int temp = nums[left];
        while (left < right) {
            while (left < right && nums[right] > temp) {
                right--;
            }
            nums[left] = nums[right];
            while (left < right && nums[left] <= temp) {
                left++;
            }
            nums[right] = nums[left];

        }
        nums[left] = temp;
        return left;

    }

    void helper(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int pos = rand_partition(nums, left, right);
        helper(nums, left, pos - 1);
        helper(nums, pos + 1, right);
    }

    public int[] sortArray(int[] nums) {
        helper(nums, 0, nums.length - 1);
        return nums;
    }

}
