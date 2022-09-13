/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-08-31 20:37:44.799-+08:00
 */

package seu.edu.cn.work.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s0 = sc.nextLine();
        int D = Integer.parseInt(s0);
        String s1 = sc.nextLine();
        int N = Integer.parseInt(s1);
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int[] temp = new int[2];
            String st = sc.nextLine();
            String[] arr_st = st.split(" ");
            temp[0] = Integer.parseInt(arr_st[0]);
            temp[1] = Integer.parseInt(arr_st[1]);
            list.add(temp);
        }
        int res = 0;
        if (D <= 1000) {
            res = D / 100;

        } else if (N >= 2) {
            for (int i = 0; i < N - 1; i++) {
                if ((list.get(i + 1)[0] - list.get(i)[0]) > 1000) {
                    res = -1;
                }

            }
        } else {
            res = D / 100 + 1;
        }
        System.out.println(res);
    }
}
