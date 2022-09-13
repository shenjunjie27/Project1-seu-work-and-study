/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-09-13 15:52:38.401-+08:00
 */

package seu.edu.cn.work.meidi;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String M = sc.nextLine();
        String N = sc.nextLine();
        List<String> list = getSubString(M);
        if(!isTrue(M,N)){
            System.out.println("");
        }
        String res = M;
        for (int i = 0; i < list.size(); i++) {
            if (isTrue(list.get(i), N) && list.get(i).length() < res.length()) {
                res = list.get(i);
            }
        }
        System.out.println(res);

    }

    //M的所有字串
    public static List<String> getSubString(String M) {
        int n = M.length();
        List<String> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String s = M.substring(i, j);
                res.add(s);
            }
        }
        return res;
    }

    public static boolean isTrue(String A, String N) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < A.length(); i++) {
            map1.put(A.charAt(i), map1.getOrDefault(A.charAt(i), 0) + 1);
        }
        for (int i = 0; i < N.length(); i++) {
            map2.put(N.charAt(i), map2.getOrDefault(N.charAt(i), 0) + 1);
        }
        for (int i = 0; i < map2.keySet().size(); i++) {
            if (!map1.containsKey(map2.keySet().toArray()[i])) {
                return false;
            }
            if (map1.get(map2.keySet().toArray()[i]) < map2.get(map2.keySet().toArray()[i])) {
                return false;
            }
        }
        return true;
    }


}
