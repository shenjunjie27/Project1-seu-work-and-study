/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-08-31 19:52:40.229-+08:00
 */

package seu.edu.cn.work.huawei;

import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int[][] matrix = new int[n][m];
        int StartRow = 0;
        int StartCol = 0;

        for (int i = 0; i < n; i++) {
            String s1 = sc.nextLine();
            String[] str1 = s1.split(" ");
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(str1[j]);
                if (matrix[i][j] == 2) {
                    StartRow = i;
                    StartCol = j;
                }
            }
        }
        backtrack(matrix, StartRow, StartCol, 0);
        System.out.println(minTime);

    }

    static int[][] way = new int[][]{
            {0, 1},
            {1, 0},
            {0, -1},
            {-1, 0}
    };
    static int minTime = Integer.MAX_VALUE;

    public static void backtrack(int[][] matrix, int row, int col, int time) {
        if (matrix[row][col] == 4) {
            time += 2;
            matrix[row][col] = 1;
        } else if (matrix[row][col] == 6) {
            matrix[row][col] = 1;
            for (int i = 0; i < 4; i++) {
                int nextR = row + way[i][0];
                int nextC = col + way[i][1];
                if (nextR >= 0 && nextR < matrix.length && nextC >= 0 && nextC < matrix[0].length && matrix[nextR][nextC] == 1) {
                    matrix[nextR][nextC] = 0;
                }
            }

        } else if (matrix[row][col] == 3) {
            minTime = Math.min(minTime, time);
            return;
        }
        matrix[row][col] = 1;
        for (int i = 0; i < 4; i++) {
            int nextR = row + way[i][0];
            int nextC = col + way[i][1];
            if (nextR >= 0 && nextR < matrix.length && nextC >= 0 && nextC < matrix[0].length && matrix[nextR][nextC] != 1) {
                backtrack(matrix, nextR, nextC, time + 1);
            }
        }

    }

}

