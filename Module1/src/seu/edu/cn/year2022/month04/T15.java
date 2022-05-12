package seu.edu.cn.year2022.month04;

import java.util.Scanner;

public class T15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(cal_n(n));
    }

    public static int cal_n(int n) {
        int count = 9;
        String ans = "";
        while (count != 0) {
            if (n > count) {
                n = n - count;
                ans = String.valueOf(count) + ans;
                count--;
            } else {
                ans = String.valueOf(n) + ans;
                return Integer.parseInt(ans);
            }
        }
        return -1;

    }
}
