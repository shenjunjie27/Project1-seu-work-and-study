/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-04-24 20:27:09.510-+08:00
 */

package seu.edu.cn.work.tengxun;

import java.util.ArrayList;
import java.util.List;

public class T2 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 1, 4, 5, 6};
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        while (list.size() != 1) {
            for (int i = list.size() - 1; i >= 0; i--) {
                if (!isPrime(i + 1)) {
                    list.remove(i);
                }
            }
        }
        System.out.println(list.get(0));


    }

    //判断是否质数
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
