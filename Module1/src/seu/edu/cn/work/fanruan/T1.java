/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-05-12 15:18:26.733-+08:00
 */

package seu.edu.cn.work.fanruan;

import java.util.HashSet;
import java.util.Set;

public class T1 {
    public static void main(String[] args) {
        int[][] m = {{1, 1, 3, 3}, {3, 1, 4, 2}, {3, 2, 4, 4}, {1, 3, 2, 4}, {2, 3, 3, 4}};
        System.out.println(isRectangleCover(m)[0]);
    }

    public static int[] isRectangleCover(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return new int[]{-1, 0};
        }
        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;
        int up = Integer.MIN_VALUE;
        int down = Integer.MAX_VALUE;

//        int n = matrix.length;
        int aera = 0;
        HashSet<String> set = new HashSet<>();
        for (int[] m : matrix
        ) {
            left = Math.min(m[0], left);
            right = Math.max(m[2], right);
            up = Math.max(m[3], up);
            down = Math.min(m[1], down);

            aera += (m[2] - m[0]) * (m[3] - m[1]);
            String l_d = m[0] + "-" + m[1];
            String l_u = m[0] + "-" + m[3];
            String r_d = m[2] + "-" + m[1];
            String r_u = m[2] + "-" + m[3];
            if (!set.add(l_d)) set.remove(l_d);
            if (!set.add(l_u)) set.remove(l_u);
            if (!set.add(r_d)) set.remove(r_d);
            if (!set.add(r_u)) set.remove(r_u);

        }
        int res = (right - left) * (up - down);

        if (aera != (right - left) * (up - down)) {
            return new int[]{-1, res};
        }
        if (!set.contains(left + "-" + down) ||
                !set.contains(left + "-" + up) ||
                !set.contains(right + "-" + down) ||
                !set.contains(right + "-" + up) ||
                set.size() != 4) {
            return new int[]{-1, res};
        }
        return new int[]{1, res};


    }
}
