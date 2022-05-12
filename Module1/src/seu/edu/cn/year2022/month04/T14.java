package seu.edu.cn.year2022.month04;

import java.util.Scanner;

public class T14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(hexToDec(s));
    }

    //十六进制转十进制
    public static int hexToDec(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                sum = sum * 16 + (c - '0');
            } else if (c >= 'a' && c <= 'f') {
                sum = sum * 16 + (c - 'a' + 10);
            } else if (c >= 'A' && c <= 'F') {
                sum = sum * 16 + (c - 'A' + 10);
            }
        }
        return sum;
    }

}
