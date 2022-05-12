package seu.edu.cn.year2022.month04;

public class T11 {
    public static void main(String[] args) {
        System.out.println(strStr("sssa","a"));
    }
    //KMP
    public static int strStr(String haystack, String needle) {
        int[] next = getNext(needle);
        int i = 0, j = 0;
        while (i < haystack.length() && j < needle.length()) {
            if (j == -1 || haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        if (j == needle.length()) {
            return i - j;
        } else {
            return -1;
        }
    }
    public static int[] getNext(String needle) {
        int[] next = new int[needle.length()];
        next[0] = -1;
        int i = 0, j = -1;
        while (i < needle.length() - 1) {
            if (j == -1 || needle.charAt(i) == needle.charAt(j)) {
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
