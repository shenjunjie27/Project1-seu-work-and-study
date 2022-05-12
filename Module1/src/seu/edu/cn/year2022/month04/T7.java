package seu.edu.cn.year2022.month04;

import java.util.Scanner;

public class T7 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String s = sc1.nextLine();
        sc1.close();
        String[] strings = s.split(" ");
        int count = 0;
        for (int i = 0; i < strings.length; i++) {
            count = strings[i].length() + count;
        }
        double c = strings.length;
        double ans = count / c;
        System.out.println(String.format("%.2f", ans));

    }
}
