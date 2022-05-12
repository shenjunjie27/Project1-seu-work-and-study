/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-05-01 20:23:32.043-+08:00
 */

package seu.edu.cn.year2022.month05;

public class T1 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        System.out.println(t1.myAtoi("words and 987"));
    }

    public int myAtoi(String s) {
        String t = "";
        int i = 0;
        while (i < s.length() && s.charAt(i) != ' ') {
            if (s.charAt(i) == '-' &&
                    (s.charAt(i + 1) <= '9' && s.charAt(i + 1) >= '0')) {
                t += String.valueOf(s.charAt(i));

            }
            else if (s.charAt(i) <= '9' && s.charAt(i) >= '0') {
                t += String.valueOf(s.charAt(i));
            }

            i++;
        }
        return Integer.valueOf(t);
    }
}
