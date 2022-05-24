/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-05-18 19:23:27.185-+08:00
 */

package seu.edu.cn.year2022.month05;

public class T6 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, -1};
        new T6().quickSort(nums, 0, nums.length - 1);
        for (int num : nums
        ) {
            System.out.println(num);

        }


    }

    void quickSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int pos = partition(nums, left, right);
        quickSort(nums, left, pos - 1);
        quickSort(nums, pos + 1, right);
    }

    int partition(int[] nums, int left, int right) {
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

    void swap(int[] nums, int i, int j) {
        if (i == j) return;
        nums[i] = nums[i] ^ nums[j];
        nums[j] = nums[i] ^ nums[j];
        nums[i] = nums[i] ^ nums[j];
    }



}
