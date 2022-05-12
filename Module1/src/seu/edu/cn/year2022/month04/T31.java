package seu.edu.cn.year2022.month04;

import java.util.*;

public class T31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] ss = s.split(" ");
            int a = Integer.parseInt(ss[0]);
            int b = Integer.parseInt(ss[1]);
            System.out.println(a + b);
        }

    }
}