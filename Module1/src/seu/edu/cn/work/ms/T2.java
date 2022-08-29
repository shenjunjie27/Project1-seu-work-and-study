/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-08-25 19:17:09.846-+08:00
 */

package seu.edu.cn.work.ms;

import java.util.HashMap;
import java.util.Map;

public class T2 {
    public static void main(String[] args) {
        new T2().solution(new int[]{2, -2, 3, 0, 4, -7});
        int[] t = new int[100000];
        new T2().solution(t);

    }


    public int solution(int[] A) {
        // write your code in Java 11 (Java SE 11)
        int res = 0, pre = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);
        for (int i = 0; i < A.length; i++) {
            pre += A[i];
            if (mp.containsKey(pre)) {
                res += mp.get(pre);
            }
            mp.put(pre, mp.getOrDefault(pre, 0) + 1);
        }

        if (res > 1000000000) {
            res = -1;
        }
        System.out.println(res);
        return res;
    }


}
