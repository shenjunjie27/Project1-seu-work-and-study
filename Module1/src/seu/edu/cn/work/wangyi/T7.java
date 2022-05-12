/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-04-24 14:30:54.508-+08:00
 */

package seu.edu.cn.work.wangyi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s1 = sc.nextLine().split(" ");
        int n = Integer.parseInt(s1[0]);
        int m = Integer.parseInt(s1[1]);
        int k = m;
        List<String[]> list = new ArrayList<>();
        while (k-- > 0) {
            String[] s2 = sc.nextLine().split(" ");
            list.add(s2);
        }
        int t = list.size();
        int flag = 0;
        for (int i = 0; i < t; i++) {
            if (list.get(i)[0].equals("1")) {
                flag = 1;
                break;
            }

        }
        int flag2 = 0;
        for (int i = 0; i < t; i++) {
            if (list.get(i)[1].equals(String.valueOf(n))) {
                flag2 = 1;
                break;
            }

        }
        if (flag == 1 && flag2 == 1) {
            System.out.println(10);
        }
        else System.out.println(-1);
    }
}
