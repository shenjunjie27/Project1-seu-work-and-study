package seu.edu.cn.year2022.month04;

import java.util.Arrays;
import java.util.Scanner;

public class T32 {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        String[] ss=s.split(" ");
        Arrays.sort(ss);
        for (String value : ss) {
            System.out.print(value + " ");
        }

    }
}
