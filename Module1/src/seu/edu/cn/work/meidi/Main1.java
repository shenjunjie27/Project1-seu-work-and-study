/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-09-13 15:37:00.324-+08:00
 */

package seu.edu.cn.work.meidi;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split(",");
        int n = strings.length;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(strings[i]);
        }
        Arrays.sort(nums);
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(nums[i] + "]");
            } else {
                System.out.print(nums[i] + ", ");
            }
        }

    }

}
