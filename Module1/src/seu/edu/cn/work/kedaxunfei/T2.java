/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-09-03 20:03:27.161-+08:00
 */

package seu.edu.cn.work.kedaxunfei;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s0 = sc.nextLine();
        String s1 = sc.nextLine();
        String[] strings = s0.split("\\|");
        int n = strings.length;
        for (int i = 0; i < n; i++) {
            String w1 = strings[i];
            String w2 = s1;
            if (maxDistance(w1, w2) == 2) {
                System.out.println(w1);
            }

        }
    }

    //计算最大编辑距离
    public static int maxDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
                }
            }
        }
        return dp[m][n];
    }


}
