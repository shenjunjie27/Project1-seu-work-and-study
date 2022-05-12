/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-04-24 14:30:54.405-+08:00
 */


package seu.edu.cn.work.qushi;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = 0;
        StringBuilder res = new StringBuilder();
        while (i < s.length()) {
            if (s.charAt(i) == ':') {
                i++;
                res.append(s, 0, i);
                res.append("//");
                break;
            }
            i++;

        }

        i++;
        while (i < s.length()) {
            if (s.charAt(i) != '\\' && s.charAt(i) != '/') {
                res.append(s, i, s.length());
                break;
            }
            i++;
        }

        System.out.println(res);

    }
}
