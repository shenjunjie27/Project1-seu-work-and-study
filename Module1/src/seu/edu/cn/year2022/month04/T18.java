package seu.edu.cn.year2022.month04;

import java.util.Scanner;

public class T18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = Integer.parseInt(s);
        while (n-- > 0) {
            String s1 = sc.nextLine();
            String[] s2 = s1.split(" ");
            int a = Integer.parseInt(s2[0]);
            int b = Integer.parseInt(s2[1]);
            System.out.println(a + b);
        }

    }
}
