/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-04-24 14:30:54.533-+08:00
 */

package seu.edu.cn.work.wangyi;

import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[][] res = new char[2 * n - 1][2 * n - 1];
        for (int i = 0; i < (2 * n - 1); i++) {
            for (int j = 0; j < (2 * n - 1); j++) {
                res[i][j] = ' ';
            }
        }
        for (int i = 0; i < 2 * n - 1; i++) {
            res[i][i] = '*';
            res[2 * n - 2 - i][i] = '*';
            res[n - 1][i] = '*';
            res[i][n - 1] = '*';
        }
        for (int i = 0; i < n; i++) {
            res[i][0] = '*';
            res[i + n - 1][2 * n - 2] = '*';
            res[0][i + n - 1] = '*';
            res[2 * n - 2][i] = '*';
        }
        for (int i = 0; i < 2 * n - 1; i++) {
            System.out.println(String.valueOf(res[i]));
        }
    }
}
