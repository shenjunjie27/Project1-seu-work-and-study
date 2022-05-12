package seu.edu.cn.year2022.month04;

import java.util.Scanner;

public class T27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String[] s = scanner.nextLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            double sum = 0;
            double n1=n;
            while (m > 0) {
                sum += n1;
                n1 = (double) Math.sqrt(n1);
                m--;
            }
            //输出精度保留两位小数

            System.out.printf("%.2f\n", sum);


        }
    }
}
