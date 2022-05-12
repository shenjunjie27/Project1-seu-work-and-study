/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-04-24 14:30:54.477-+08:00
 */

package seu.edu.cn.work.rongyao;

import java.util.Scanner;
import java.util.Stack;

public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split(" ");
        int n = Integer.parseInt(str[0]);
        String s1 = sc.nextLine();
        int k = 0;
        String res = "";
        while (k != n) {

            if (s1.charAt(0 + 9 * k) == '0') {
                Stack<Character> stack = new Stack<>();
                for (int i = 0 + 9 * k + 1; i <= 0 + 9 * k + 8; i++) {
                    stack.push(s1.charAt(i));
                }

                for (int i = 0 + 9 * k + 1; i <= 0 + 9 * k + 8; i++) {
                    res += stack.pop();
                }
                res += " ";


            } else {
                for (int i = 0 + 9 * k + 1; i <= 0 + 9 * k + 8; i++) {
                    res += s1.charAt(i);
                }
                res += " ";

            }
            k++;
        }
        System.out.println(res);
    }
}
