package seu.edu.cn.year2022.month04;

import java.util.Scanner;

public class T19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.nextLine();
            String[] s2 = s1.split(" ");
            int a = Integer.parseInt(s2[0]);
            if (s2.length == 1 && a == 0)
                break;
            int sum = 0;
            for (int i = 1; i < s2.length; i++) {
                sum += Integer.parseInt(s2[i]);
            }
            System.out.println(sum);
        }

    }
}
