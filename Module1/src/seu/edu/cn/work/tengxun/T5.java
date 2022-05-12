/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-04-24 21:01:50.293-+08:00
 */

package seu.edu.cn.work.tengxun;

import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str1 = sc.nextLine().split(" ");
        String[] str2 = sc.nextLine().split(" ");
        int n = Integer.parseInt(str1[0]);
        int m = Integer.parseInt(str1[1]);
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(str2[i]);
        }
        int money = m;
        int count = 0;
        int[] dp = new int[n];
        int temp0 = money + a[1] - a[0];
        int temp1 = money;
        if (temp0 > temp1) {
            dp[1] = temp1;
            count++;
            money = money - a[0];
        } else {
            dp[1] = temp0;
        }
        for (int i = 2; i < a.length; i++) {
            int price = a[i];
            if (money >= price && count >= 1) {
                temp0 = dp[i - 1] + (1 + count) * (a[i] - a[i - 1]);
                temp1 = dp[i - 1] + (1 - count) * (a[i] - a[i - 1]);
                if (temp0 > temp1) {
                    dp[i] = temp0;
                    count++;
                    money = money - price;
                } else {
                    dp[i] = temp1;
                    count--;
                    money = money + price;
                }
            } else {
                if (count < 1 && money >= price) {
                    temp0 = dp[i - 1] + (1 + count) * (a[i] - a[i - 1]);
                    temp1 = dp[i - 1];
                    if (temp0 > temp1) {
                        dp[i] = temp0;
                        count++;
                        money = money - price;
                    } else {
                        dp[i] = temp1;
                    }
                }
                if (money < price && count >= 1) {
                    temp0 = dp[i - 1];
                    temp1 = dp[i - 1] + (1 - count) * (a[i] - a[i - 1]);
                    if (temp0 > temp1) {
                        dp[i] = temp0;
                    } else {
                        dp[i] = temp1;
                        count--;
                        money = money + price;
                    }


                }
            }


        }
        System.out.println(dp[n - 2]);
    }
}
