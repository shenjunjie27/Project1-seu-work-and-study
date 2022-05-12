/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-04-24 14:30:54.352-+08:00
 */

package seu.edu.cn.work.wangyi;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] strings = s.split(" ");
        int n = Integer.parseInt(strings[0]);
        int k = Integer.parseInt(strings[1]);
        int x = Integer.parseInt(strings[2]);
        String res = "";
        boolean b = isRight(n, k, x, res);
        if (b) {
            System.out.println(res);
        } else {
            System.out.println("-1");
        }
    }

    public static boolean isRight(int n, int k, int x, String res1) {
        if (n == 2) {
            int[] nums = new int[k];
            for (int i = 0; i < k; i++) {
                nums[i] = i + 1;
            }
            int res[] = twoSum(nums, x, res1);
            if (res == null) {
                return false;
            } else {
                return true;
            }
        } else {
            int t = k;
            k--;
            res1 = res1 + String.valueOf(k) + " ";
            return isRight(n - 1, k, x - t, res1);
        }

    }

    public static int[] twoSum(int[] nums, int target, String res) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
//                    System.out.println(nums[i] + " " + nums[j]);
                    res = res + String.valueOf(nums[i]) + " " + String.valueOf(nums[j]) + " ";
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
