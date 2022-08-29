/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-08-25 19:03:28.094-+08:00
 */

package seu.edu.cn.work.ms;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class T1 {
    public static void main(String[] args) {
        new T1().solution(15958);
        new T1().solution(-5859);
        new T1().solution(-5000);
    }
    public int solution(int N) {
        // write your code in Java 11 (Java SE 11)
        String s = String.valueOf(N);
        List<Character> list_c = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list_c.add(s.charAt(i));
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '5') {
                list_c.remove(i);
                String s1 = "";
                for (int j = 0; j < list_c.size(); j++) {
                    s1 += list_c.get(j);
                }

                list.add(Integer.parseInt(s1));
                list_c.add(i, '5');
            }
        }
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.get(list.size() - 1));
        return list.get(list.size() - 1);
    }
}
