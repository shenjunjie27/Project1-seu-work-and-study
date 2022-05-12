/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-05-01 20:39:08.058-+08:00
 */

package seu.edu.cn.year2022.month05;

import java.util.Map;

public class T2 {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new java.util.HashMap<>();
        int i = 0;
        int res = 0;
        while (i < nums.length) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                res = entry.getKey();
            }
        }
        return res;
    }
}
