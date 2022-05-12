/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-04-24 14:30:54.547-+08:00
 */

package seu.edu.cn.work.pdd;

import java.util.*;

public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S1 = sc.nextLine();
        int n = Integer.parseInt(S1);

        String[] str = sc.nextLine().split(" ");
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(str[i]);
        }
        LinkedHashMap<Integer, List<Integer>> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(num[i])) {
                List<Integer> list_t = map.get(num[i]);
                list_t.add(i);
                map.put(num[i], list_t);
            } else {
                List<Integer> list_t = new ArrayList<>();
                list_t.add(i);
                map.put(num[i], list_t);
            }
        }
        List<Integer> list_key = new ArrayList<>();
        for (Integer key :
                map.keySet()) {
            List<Integer> list = map.get(key);
            if (list.size() == 1) {

                list_key.add(key);

            } else {
                int tmp = list.get(1) - list.get(0);
                if (list.size() == 2) {

                    list_key.add(key);
                }
                int falg = 1;
                for (int i = 2; i < list.size(); i++) {
                    if (list.get(i) - list.get(i - 1) != tmp) {
                        falg = 0;
                        break;
                    }
                }
                if (falg == 1 && list.size() > 2) {
                    list_key.add(key);
                }

            }

        }
        System.out.println(list_key.size());
        int[] nums_key = new int[list_key.size()];
        for (Integer key : list_key) {
            nums_key[list_key.indexOf(key)] = key;
        }
        Arrays.sort(nums_key);
        for (int i = 0; i < nums_key.length; i++) {
            String s = String.valueOf(nums_key[i]);
            if (map.get(nums_key[i]).size() == 1) {
                System.out.println(s + " 0");
            } else {
                System.out.println(s + " " + String.valueOf(map.get(nums_key[i]).get(1) - map.get(nums_key[i]).get(0)));
            }

        }

    }
}
