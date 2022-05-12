/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-04-24 14:30:54.561-+08:00
 */

package seu.edu.cn.work.pdd;

import java.util.HashSet;
import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        String[] str1 = sc.nextLine().split(" ");
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(Integer.parseInt(str1[i]));
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String[] str2 = sc.nextLine().split(" ");
            int L = Integer.parseInt(str2[0]);
            int R = Integer.parseInt(str2[1]);
            if (L == R) {
                if (!set.contains(L)) {
                    System.out.println(L);
                } else {
                    System.out.println(-1);
                }
            } else {
                int flag = 0;
                for (int i = L; i <= R; i++) {
                    if (!set.contains(i)) {
                        System.out.println(i);
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    System.out.println(-1);
                }
            }
        }

    }
}
