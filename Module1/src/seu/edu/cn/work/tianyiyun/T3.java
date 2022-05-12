/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-04-24 14:30:54.323-+08:00
 */

package seu.edu.cn.work.tianyiyun;

import java.util.Deque;
import java.util.LinkedList;

public class T3 {
    public String geMinNum(String num, int n) {
        // write code here
        Deque<Character> deque = new LinkedList<Character>();
        int len = num.length();
        for (int i = 0; i < len; i++) {
            char c = num.charAt(i);
            while (!deque.isEmpty() && n > 0 && deque.peekLast() > c) {
                deque.pollLast();
                n--;

            }
            deque.offerLast(c);
        }
        for (int i = 0; i < n; i++) {
            deque.pollLast();
        }
        StringBuilder res = new StringBuilder();
        boolean flag = true;
        while (!deque.isEmpty()) {
            char d = deque.pollFirst();
            if (flag && d == '0') {
                continue;
            }
            flag = false;
            res.append(d);
        }
        if (res.length() == 0) {
            return "0";
        } else {
            return res.toString();
        }
    }

}
