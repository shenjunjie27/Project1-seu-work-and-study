/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-04-26 19:10:28.164-+08:00
 */

package seu.edu.cn.work.tengxunmusic;

public class T1 {
    public static void main(String[] args) {
        int a = 1221;
        int b = 12233111;
        int c = 0;
        int d = 1;
        int e = 12321;
        System.out.println(isHui(a));
        System.out.println(isHui(b));
        System.out.println(isHui(c));
        System.out.println(isHui(d));
        System.out.println(isHui(e));
    }

    public static boolean isHui(int x) {
        String s = String.valueOf(x);
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }
}
