package seu.edu.cn.year2022.month04;

import java.util.Scanner;

public class T8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (--t != 0) {
            String[] s = sc.nextLine().split(" ");
            int[] nums = new int[s.length];
            for (int i = 0; i < s.length; i++) {
                nums[i] = Integer.parseInt(s[i]);
            }

        }
    }
}
