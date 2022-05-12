package seu.edu.cn.year2022.month04;

import java.util.Scanner;

public class T21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            String[] sx = sc.nextLine().split(" ");
            String[] sy = sc.nextLine().split(" ");
            int[] x = new int[n];
            int[] y = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = Integer.parseInt(sx[i]);
            }
            for (int i = 0; i < n; i++) {
                y[i] = Integer.parseInt(sy[i]);
            }

        }
    }
}
