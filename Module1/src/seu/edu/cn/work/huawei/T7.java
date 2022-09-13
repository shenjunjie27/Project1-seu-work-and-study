/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-09-09 19:10:51.772-+08:00
 */

package seu.edu.cn.work.huawei;

import java.util.Scanner;

public class T7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s0 = sc.nextLine();
        String s1 = sc.nextLine();
        String[] strings0 = s0.split(" ");
        int M = strings0.length;
        int[] nums = new int[M];
        for (int i = 0; i < M; i++) {
            nums[i] = Integer.parseInt(strings0[i]);
        }
        int N = Integer.parseInt(s1);


    }
}
