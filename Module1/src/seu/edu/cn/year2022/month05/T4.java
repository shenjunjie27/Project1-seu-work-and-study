/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-05-09 20:36:25.738-+08:00
 */

package seu.edu.cn.year2022.month05;

import java.util.HashSet;
import java.util.Set;

public class T4 {
    public static void main(String[] args) {
        Set<int[]> set = new HashSet<>();
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        set.add(a);
        set.add(b);
        System.out.println(set.size());
    }
}
