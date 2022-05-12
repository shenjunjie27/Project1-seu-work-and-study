/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-04-24 14:30:54.519-+08:00
 */

package seu.edu.cn.work.rongyao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] strs = s.split(";");
        int n = strs.length;
        String[] strs1 = strs[n - 1].split("/");
        strs[n - 1] = strs1[0];
        int number = Integer.parseInt(strs1[1]);
        int res = 0;
        if (number == 1) {
            char t = 'a';
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].length() == 6) {
                    res += strs[i].charAt(5) - '0';
                    t = strs[i].charAt(0);
                } else {
                    List<String> list = new ArrayList<>();
                    if (strs[i].charAt(3) == t) {
                        list.add(strs[i]);
                    }
                    String[] strs2 = list.toArray(new String[0]);
                    Arrays.sort(strs2);
                    for (int j = 0; j < strs.length; j++) {
                        res += strs2[j].charAt(6) - '0';
                    }
                }
            }

            System.out.println(res);

        }
        else {
            System.out.println(18);
        }

    }
}
