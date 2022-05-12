/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-04-24 20:03:55.603-+08:00
 */

package seu.edu.cn.work.tengxun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n =Integer.parseInt(s);
        List<String> list = new ArrayList<>();
        while (n-- > 0) {
           String str = sc.nextLine();
           list.add(str);
        }
        int m =list.get(0).length();
        int[] res = new int[m];
        for (int j = 0; j < m; j++) {

            StringBuilder sb = new StringBuilder();
            for (String value : list) {
                sb.append(value.charAt(j));
            }
            int num = Integer.parseInt(sb.toString());
            res[j] = num;

        }
        Arrays.sort(res);
        for (int re : res) {
            System.out.print(re);
            System.out.print(" ");
        }
    }
}
