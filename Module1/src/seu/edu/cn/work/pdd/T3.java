/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-04-24 14:30:54.550-+08:00
 */

package seu.edu.cn.work.pdd;

import java.util.Arrays;
import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split(" ");
        int m = Integer.parseInt(str[0]);
        int n = Integer.parseInt(str[1]);
        int x = Integer.parseInt(str[2]);
        int k = m;
        int[] a = new int[m];
        while (k-- != 0) {
            String s1 = sc.nextLine();
            a[m - k - 1] = Integer.parseInt(s1);
        }
        Arrays.sort(a);


        int ans = a[a.length - 1] + x;

        int flag = 0;
        while (flag != 1) {
            int t = m;
            while (t > n) {
                if (a[t - 1] <= ans - x * (m - t + 1)) {
                    t = t - n;
                } else {
                    ans = ans + 2 * x;
                    break;
                }

            }
            if (t <= n) {
                if (a[t - 1] <= ans - x * (m - t + 1)) {
                    flag = 1;
                }
            }
        }
        System.out.println(ans);

    }
}
