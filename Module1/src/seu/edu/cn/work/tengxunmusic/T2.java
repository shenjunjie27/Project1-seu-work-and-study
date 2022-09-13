/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-09-08 19:01:33.457-+08:00
 */

package seu.edu.cn.work.tengxunmusic;

import java.util.HashMap;
import java.util.Map;

public class T2 {
    public int minOperations(String str) {
        // write code here
        int n = str.length();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        int res = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int t = entry.getValue() / 2;
            int t2 = entry.getValue() % 2;
            if (t2 == 1) {
                res += t + 2;
            } else {
                res += t;
            }

        }
        return res;

    }
}
