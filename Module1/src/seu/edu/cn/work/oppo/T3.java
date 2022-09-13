/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-09-02 20:54:32.940-+08:00
 */

package seu.edu.cn.work.oppo;

public class T3 {
    public int findStr(String str, String mod) {
        // write code here
        //反转字符串
        String str1 = new StringBuffer(str).reverse().toString();
        String mod1 = new StringBuffer(mod).reverse().toString();
        int res = -1;
        res = kmp(str, mod1);
        if (res == -1) {
            return res;
        }
        return res + mod1.length() - 1;
    }

    //kmp算法 返回字符串str中第一次出现字符串mod的位置
    public int kmp(String str, String mod) {
        int[] next = getNext(mod);
        int i = 0;
        int j = 0;
        while (i < str.length() && j < mod.length()) {
            if (j == -1 || str.charAt(i) == mod.charAt(j) || mod.charAt(j) == '*') {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        if (j == mod.length()) {
            return i - j;
        } else {
            return -1;
        }
    }

    //获取next数组
    public int[] getNext(String mod) {
        int[] next = new int[mod.length()];
        next[0] = -1;
        int i = 0;
        int j = -1;
        while (i < mod.length() - 1) {
            if (j == -1 || mod.charAt(i) == mod.charAt(j) || mod.charAt(j) == '*') {
                i++;
                j++;
                next[i] = j;
            } else {
                j = next[j];
            }
        }
        return next;
    }


}
