/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-08-30 18:02:54.993-+08:00
 */

package seu.edu.cn.year2022.month08.work01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int m = Integer.parseInt(sc.nextLine());
        List<List<Double>> list = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            List<Double> list_in = new ArrayList<>();
            String[] s1 = sc.nextLine().split(" ");
            for (int j = 0; j < s1.length; j++) {
                list_in.add(Double.parseDouble(s1[j]));
            }
            list.add(list_in);
        }
        double l = 0.7 * list.get(n).get(3);
        double r = 1.3 * list.get(n).get(3);
        System.out.println(l + " " + r);

        List<List<Integer>> list_cal = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Double> list_in = list.get(i);
            List<Integer> list_m = new ArrayList<>();
            double t1 = 0;
            double t2 = 0;
            double t3 = 0;
            if (list_in.get(3) < l || list_in.get(3) > r) {
                t1 = ((list_in.get(0) - list.get(n).get(0)) / 0.03125);
                t2 = ((list_in.get(1) - list.get(n).get(1)) / 0.03125);
                t3 = ((list_in.get(2) - list.get(n).get(2)) / 0.05);
            }

            list_m.add((int) Math.round(t1));
            list_m.add((int) Math.round(t2));
            list_m.add((int) Math.round(t3));

            list_cal.add(list_m);
        }
        System.out.println(list_cal);
        List<List<List<Integer>>> list_possible_choice = new ArrayList<>();
        for (int i = 0; i < list_cal.size(); i++) {
            int na = 0;
            int nb = 0;
            int nc = 0;
            int flag = 1;
            int n_cpu_l = 0;
            int n_cpu_r = 0;
            int n_bw_l = 0;
            int n_bw_r = 0;

            if (list_cal.get(i).get(0) < 0) {
                flag = -1;

                n_cpu_l = Math.abs(list_cal.get(i).get(0)) - 1;
                n_cpu_r = Math.abs(list_cal.get(i).get(0)) + 1;
                n_bw_l = Math.abs(list_cal.get(i).get(2)) - 1;
                n_bw_r = Math.abs(list_cal.get(i).get(2)) + 1;

            } else {

                n_cpu_l = list_cal.get(i).get(0) - 1;
                n_cpu_r = list_cal.get(i).get(0) + 1;
                n_bw_l = list_cal.get(i).get(2) - 1;
                n_bw_r = list_cal.get(i).get(2) + 1;
            }
            List<List<Integer>> list_in_1 = new ArrayList<>();
            for (int j = 0; j <= n_cpu_r; j++) {
                for (int k = 0; k <= n_cpu_r; k++) {
                    for (int q = 0; q <= n_cpu_r; q++) {
                        int temp1 = j + 2 * k + 4 * q;
                        int temp2 = j + k + q;
                        if (n_cpu_l <= temp1 && temp1 <= n_cpu_r && n_bw_l <= temp2 && temp2 <= n_bw_r) {
                            na = j;
                            nb = k;
                            nc = q;
                            List<Integer> list_in_2 = new ArrayList<>();
                            if (flag == 1) {
                                list_in_2.add(na);
                                list_in_2.add(nb);
                                list_in_2.add(nc);
                            } else {
                                list_in_2.add(-na);
                                list_in_2.add(-nb);
                                list_in_2.add(-nc);
                            }
                            list_in_1.add(list_in_2);
                        }
                    }
                }

            }
            list_possible_choice.add(list_in_1);

        }
        System.out.println(list_possible_choice);
        List<List<List<Integer>>> list_possible_choice_2 = new ArrayList<>();
        for (int i = 0; i < list_possible_choice.size(); i++) {
            for (int j = i + 1; j < list_possible_choice.size(); j++) {
                for (int k = j + 1; k < list_possible_choice.size(); k++) {
                    for (int i1 = 0; i1 < list_possible_choice.get(i).size(); i1++) {
                        for (int j1 = 0; j1 < list_possible_choice.get(j).size(); j1++) {
                            for (int k1 = 0; k1 < list_possible_choice.get(k).size(); k1++) {
                                List<Integer> l1 = list_possible_choice.get(i).get(i1);
                                List<Integer> l2 = list_possible_choice.get(j).get(j1);
                                List<Integer> l3 = list_possible_choice.get(k).get(k1);
                                if (isValid(l1, l2, l3)) {
                                    List<List<Integer>> list_in_2 = new ArrayList<>();
                                    list_in_2.add(l1);
                                    list_in_2.add(l2);
                                    list_in_2.add(l3);
                                    list_possible_choice_2.add(list_in_2);
                                }

                            }
                        }

                    }
                }

            }

        }
        System.out.println(list_possible_choice_2);



    }

    public static boolean isValid(List<Integer> l1, List<Integer> l2, List<Integer> l3) {
        int n = l1.size();
        for (int i = 0; i < n; i++) {
            if (l1.get(i) + l2.get(i) + l3.get(i) != 0) {
                return false;
            }
        }
        return true;


    }


}
