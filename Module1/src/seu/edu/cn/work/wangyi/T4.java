/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-04-24 14:30:54.374-+08:00
 */

package seu.edu.cn.work.wangyi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s1 = sc.nextLine().split(" ");
        int n = Integer.parseInt(s1[0]);
        String[] s2 = sc.nextLine().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(s2[i]);
        }
        List<Integer> list = new ArrayList<>();
        int k = 0;
        while (k < n) {
            for (int i = k; i < n; i++) {
                List<Integer> list1 = new ArrayList<>();
                for (int j = k; j <= i; j++) {
                    list1.add(a[j]);
                }
                list.add(mul(list1));
            }
            k++;
        }
        int res = 0;
        for (int i = 0; i < list.size(); i++) {
            int count = count(String.valueOf(list.get(i)));
            res = count + res;

        }
        System.out.println(res);


    }

    //求数组中所有数的乘积
    public static int mul(List<Integer> list) {
        int res = 1;
        for (int i = 0; i < list.size(); i++) {
            res *= list.get(i);
        }
        return res;
    }

    //求字符串末尾0的数量
    public static int count(String s) {
        int res = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '0') {
                res++;
            } else {
                break;
            }
        }
        return res;
    }
}
