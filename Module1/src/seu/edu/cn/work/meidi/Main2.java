/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-09-13 15:41:42.763-+08:00
 */

package seu.edu.cn.work.meidi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.substring(1, s.length() - 1);
        String[] strings = s.split(",");
        int n = strings.length;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(strings[i]);
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }
        int[] res = new int[set.size()];
        Object[] objects = set.toArray();
        Arrays.sort(objects);
        for (int i = 0; i < objects.length; i++) {
            res[i] = (int) objects[i];
        }
        for (int i = 0; i < res.length; i++) {
            if (i == res.length - 1) {
                System.out.print(res[i]);
            } else {
                System.out.print(res[i] + ",");
            }
        }
    }
}
