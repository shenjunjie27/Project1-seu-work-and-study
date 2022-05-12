/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-04-24 14:30:54.381-+08:00
 */

package seu.edu.cn.work.guanglianda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split(" ");
        int n = Integer.parseInt(str[0]);
        int n_res = n;
        List<List<Integer>> list = new ArrayList<>();
        while (n-- != 0) {
            String[] str1 = sc.nextLine().split(" ");
            int a = Integer.parseInt(str1[0]);
            int b = Integer.parseInt(str1[1]);
            int c = Integer.parseInt(str1[2]);
            int d = Integer.parseInt(str1[3]);
            List<Integer> list1 = new ArrayList<>();
            list1.add(a);
            list1.add(b);
            list1.add(c);
            list1.add(d);
            list.add(list1);
        }
        System.out.println(dfs(list, n_res, 0, 0, 0));


    }

    public static int dfs(List<List<Integer>> list, int n, int red, int green, int cur) {
        if (cur == n)
            return 0;
        int red_baofu = list.get(cur).get(0) * red + list.get(cur).get(1) * green;
        int green_baofu = list.get(cur).get(2) * red + list.get(cur).get(3) * green;
//        return Math.max(dfs(list, n, red + 1, green, cur + 1) + red_baofu,
//                dfs(list, n, red, green + 1, cur + 1) + green_baofu);
        int a = dfs(list, n, red + 1, green, cur + 1) + red_baofu;
        int b = dfs(list, n, red, green + 1, cur + 1) + green_baofu;
        return a > b ? a : b;


    }
}
