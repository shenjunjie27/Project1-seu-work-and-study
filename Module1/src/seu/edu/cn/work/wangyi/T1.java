/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-04-24 14:30:54.536-+08:00
 */

package seu.edu.cn.work.wangyi;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] res = new char[4 * n][4 * n];
        for (int i = 0; i < 4 * n; i++) {
            for (int j = 0; j < 4 * n; j++) {
                res[i][j] = '.';
            }
        }
        for (int i = n; i < 3 * n; i++) {
            for (int j = 0; j < 4 * n; j++) {
                res[i][j] = '*';
            }
        }
        int t = n;
        for (int i = 0; i < n; i++, t--) {
            for (int j = t; j < 4 * n - t; j++) {
                res[i][j] = '*';
            }
        }
        t = n;
        for (int i = n; i < 3 * n; i++) {
            for (int j = t; j < 4 * n - t; j++) {
                res[i][j] = '.';
            }
        }
        t = 1;
        for (int i = 3 * n; i < 4 * n; i++, t++) {
            for (int j = t; j < 4 * n - t; j++) {
                res[i][j] = '*';
            }
        }
        for (int i = 0; i < res.length; i++) {
            String s = String.valueOf(res[i]);
            System.out.println(s);

        }

    }
}

