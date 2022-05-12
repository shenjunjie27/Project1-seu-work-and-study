package seu.edu.cn.year2022.month04;

import java.util.Scanner;

public class T12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            int a = in.nextInt();
            if (a == 0) {
                break;
            }
            System.out.println(dp(a));

        }
    }

    public static int dp(int a) {
        int b = a / 2;
        return b;
    }

}
