/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-04-24 14:30:54.379-+08:00
 */

package seu.edu.cn.work.huawei;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] c = s.split(" ");
        int n = Integer.parseInt(c[0]);
        int m = Integer.parseInt(c[1]);
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map = new HashMap<>();
        while (m != 0) {
            String[] t = sc.nextLine().split(" ");
            String[] p = sc.nextLine().split(" ");
            for (int i = 0; i < t.length; i++) {
                if (!map.containsKey(t[i])) {
                    map.put(t[i], 3);
                } else {
                    map.put(t[i], map.get(t[i]) + 3);

                }
            }
            for (int i = 0; i < t.length; i++) {
                if (!map1.containsKey(t[i])) {
                    map1.put(t[i], 3);
                } else {
                    map1.put(t[i], map1.get(t[i]) + 3);

                }
            }

            for (int i = 0; i < p.length; i++) {
                if (!map.containsKey(p[i])) {
                    map.put(p[i], 1);
                } else {
                    map.put(p[i], map.get(p[i]) + 1);
                }
            }

            m--;
        }
        Integer[] v = map.values().toArray(new Integer[0]);
        String[] k = map.keySet().toArray(new String[0]);
        List<Integer> list_v = java.util.Arrays.asList(v);
        List<String> list_k = java.util.Arrays.asList(k);







    }
}
