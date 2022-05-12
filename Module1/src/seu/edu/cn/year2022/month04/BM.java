package seu.edu.cn.year2022.month04;

public class BM {
    public static void main(String[] args) {
        System.out.println(bm("abcdefg", "cde"));

    }
    //BM算法
    public static int bm(String s, String p) {
        int i = 0;
        int j = 0;
        int[] next = getNext(p);
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
        } else {
            return -1;
        }
    }
    //获取next数组
    public static int[] getNext(String p) {
        int[] next = new int[p.length()];
        next[0] = -1;
        int j = 0;
        int k = -1;
        while (j < p.length() - 1) {
            if (k == -1 || p.charAt(j) == p.charAt(k)) {
                j++;
                k++;
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
