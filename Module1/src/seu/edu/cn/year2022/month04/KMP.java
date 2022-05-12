package seu.edu.cn.year2022.month04;

import java.util.Scanner;

public class KMP {
    public static void main(String[] args) {
        System.out.println(kmp("ss", "a"));

    }

    // KMP算法
    public static int kmp(String s, String p) {
        int[] next = getNext(p);
        int i = 0, j = 0;
        while (i < s.length() && j < p.length()) {
            if (j == -1 || s.charAt(i) == p.charAt(j)) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        if (j == p.length()) {
            return i - j;
        }
        return -1;
    }

    // 获取next数组
    public static int[] getNext(String p) {
        int[] next = new int[p.length()];
        next[0] = -1;
        int k = -1, j = 0;
        while (j < p.length() - 1) {
            if (k == -1 || p.charAt(j) == p.charAt(k)) {
                k++;
                j++;
                if (p.charAt(j) != p.charAt(k)) {
                    next[j] = k;
                } else {
                    next[j] = next[k];
                }
            } else {
                k = next[k];
            }
        }
        return next;
    }
}
