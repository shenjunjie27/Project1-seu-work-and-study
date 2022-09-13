/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-08-31 19:04:37.885-+08:00
 */

package seu.edu.cn.work.huawei;

import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
//        System.out.println("A".equalsIgnoreCase("a"));
        String[] arr_s1 = s1.split(" ");
        String[] arr_s2 = s2.split(" ");
        int n = arr_s1.length;
        arr_s1[n - 1] = arr_s1[n - 1].substring(0, arr_s1[n - 1].length() - 1);
        int flag = 0;
        String res = "";
        for (int i = 0; i < n; i++) {
            if (arr_s1[i].contains("\"")) {
                flag++;
            }
            if (flag % 2 == 0) {
                for (int j = 0; j < arr_s2.length; j++) {
                    if (arr_s1[i].equalsIgnoreCase(arr_s2[j])) {
                        arr_s1[i] = String.valueOf(j);
                    }
                }
            }

            res = res + arr_s1[i] + " ";


        }
        System.out.println(res.substring(0, res.length() - 1) + ".");


    }
}
