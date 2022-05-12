package seu.edu.cn.year2022.month04;

import java.util.Scanner;

public class BF {
    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("请输入子串：");
        String p = scanner.nextLine();
        BF(s, p);

    }
    //BF算法
    public static void BF(String s, String p) {
        int i = 0;
        int j = 0;
        while (i < s.length()) {
            if (s.charAt(i) == p.charAt(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
            if (j == p.length()) {
                System.out.println("字符串" + s + "中包含子串" + p);
                return;
            }
        }
        System.out.println("字符串" + s + "中不包含子串" + p);
    }
}
