/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-04-24 20:45:12.612-+08:00
 */

package seu.edu.cn.work.tengxun;

import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int n = Integer.parseInt(s1);
        long[][] pre = new long[n + 1][2];
        for (int i = 0; i < n; i++) {
            if (s2.charAt(i) == '0') {
                pre[i + 1][0] = pre[i][0] + i + 1;
                pre[i + 1][1] = pre[i][1];
            } else {
                pre[i + 1][0] = pre[i][0];
                pre[i + 1][1] = pre[i][1] + i + 1;
            }
        }
        long sum_a = pre[n][0];
        long sum_b = pre[n][1];

        long res = Long.MAX_VALUE;
        for (int i = 0; i <= n; i++) {
            long w = pre[i][0];
            long v = sum_b - pre[i][1];
            res = Math.min(res, Math.abs(w - v));
        }
        System.out.println(res);
    }
}
