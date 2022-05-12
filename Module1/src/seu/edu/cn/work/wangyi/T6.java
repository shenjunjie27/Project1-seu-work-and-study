/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-04-24 14:30:54.522-+08:00
 */

package seu.edu.cn.work.wangyi;

import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        String[] str1 = sc.nextLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int p = Integer.parseInt(str[1]);
        int x = Integer.parseInt(str[2]);
        int[] a = new int[n];
        int sum_origin = 0;
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(str1[i]);
            sum_origin += a[i];
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= p; j++) {
                if (j != a[i] && (sum_origin + j - a[i]) % x == 0) {
                    res++;
                }
            }
        }
        System.out.println(res);
    }

}
