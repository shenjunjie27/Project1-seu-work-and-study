/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-08-25 11:45:04.182-+08:00
 */

package seu.edu.cn.year2022.month08;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 31;
        List<List<String>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] str = s.split(" ");
            List<String> l = new ArrayList<>();
            for (int j = 0; j < str.length; j++) {
                if (str[j] != null && !str[j].equals("")) {
                    l.add(str[j]);
                }
            }
            list.add(l);

        }
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            double t0 = Double.parseDouble(list.get(i).get(6));
            double t1 = Double.parseDouble(list.get(i).get(5));
            if (max < t0) {
                max = (int) t0;
            }
            if (min > t1) {
                min = (int) t1;
            }
        }
        List<Double> temp = new ArrayList<>();
        for (int i = min; i < max; i++) {
            for (int j = 1; j < n; j++) {
                double t0 = Double.parseDouble(list.get(j).get(6));
                double t1 = Double.parseDouble(list.get(j).get(5));
                Set<String> set = new HashSet<>();
                if (t0 > i && t1 < i) {
                    set.add(list.get(j).get(3));
                }
                int t = set.size();
                double a = t * 0.125;
                double b = 0.5 / 8 * 5;
                double c = 0.1 * t;
                double res = (3 * (a * a + b * b + c * c) + (a + b + c) * (a + b + c)) / 9;
//                System.out.println(res);
                temp.add(res);

            }


        }
        double sum = 0;
        for (int k = 0; k < temp.size(); k++) {
            sum += temp.get(k);
        }
        double r = sum / temp.size();
        r = (double) Math.round(r * 10000) / 10000;
        System.out.println(r);
    }
}
