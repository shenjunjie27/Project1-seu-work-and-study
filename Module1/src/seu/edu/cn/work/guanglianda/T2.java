/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-04-24 14:30:54.564-+08:00
 */

package seu.edu.cn.work.guanglianda;

import java.util.List;
import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.charAt(i) - '0';
        }
        int[] s0 = {1, 1, 1, 1, 1, 1, 0};
        int[] s1 = {0, 0, 0, 1, 1, 0, 0};
        int[] s2 = {1, 0, 1, 1, 0, 1, 1};
        int[] s3 = {0, 0, 1, 1, 1, 1, 1};
        int[] s4 = {0, 1, 0, 1, 1, 0, 1};
        int[] s5 = {0, 1, 1, 0, 1, 1, 1};
        int[] s6 = {1, 1, 1, 0, 1, 1, 1};
        int[] s7 = {0, 0, 1, 1, 1, 0, 0};
        int[] s8 = {1, 1, 1, 1, 1, 1, 1};
        int[] s9 = {0, 1, 1, 1, 1, 0, 1};
        int[] s10 = {0, 0, 0, 0, 0, 0, 0};
        int res = 0;
        List<int[]> list = List.of(s0, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
        res += count(list.get(10), list.get(a[0]));
        for (int i = 0; i < n - 1; i++) {
            res += count(list.get(a[i]), list.get(a[i + 1]));
        }

        System.out.println(res);

    }

    //比较两个数组中元素不同的个数
    public static int count(int[] a, int[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                count++;
            }
        }
        return count;
    }
}
