/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-04-24 14:30:54.493-+08:00
 */

package seu.edu.cn.work.rongyao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split(" ");
        int l = Integer.parseInt(str[0]);
        int h = Integer.parseInt(str[1]);
        List<Integer> list_res = printPrime(l, h);
        if (list_res.size() == 0) {
            System.out.println("0");
        } else {
            int n_ge = 0;
            int n_shi = 0;
            for (int i = 0; i < list_res.size(); i++) {
                String res = String.valueOf(list_res.get(i));
                n_ge += Integer.parseInt(String.valueOf(res.charAt(res.length() - 1)));
                int n_shi_temp = 0;
                if (list_res.get(i) >= 10) {
                    n_shi_temp = Integer.parseInt(String.valueOf(res.charAt(res.length() - 2)));
                }
                n_shi += n_shi_temp;
            }
            int res = n_ge < n_shi ? n_ge : n_shi;
            System.out.println(res);
        }

    }

    public static List<Integer> printPrime(int l, int h) {
        List<Integer> list = new ArrayList<>();
        for (int i = l; i < h; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        return list;
    }


    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


}
