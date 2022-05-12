/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-05-12 16:00:35.342-+08:00
 */

package seu.edu.cn.work.fanruan;

import java.util.HashSet;
import java.util.Set;

public class T2 {
    public String findLuckyNum(int n) {
        // write code here
        long[] dp = new long[n + 1];
        dp[0] = 1;
        int i1 = 1;
        int i2 = 1;
        int i3 = 1;
        for (int i = 1; i <= n; i++) {
            dp[i] = Math.min(Math.min(2 * dp[i1 - 1], 3 * dp[i2 - 1]), 7 * dp[i3 - 1]);
            if (dp[i] == 2 * dp[i1 - 1]) i1++;
            if (dp[i] == 3 * dp[i2 - 1]) i2++;
            if (dp[i] == 7 * dp[i3 - 1]) i3++;

        }
        return String.valueOf(dp[n]);

    }
}
