/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-08-25 20:13:43.597-+08:00
 */

package seu.edu.cn.work.ms;

public class T3 {
    public static void main(String[] args) {
        new T3().solution(new int[]{-1,1,3,3,3,2,3,2,1,0});
    }
    public int solution(int[] A) {
        // write your code in Java 11 (Java SE 11)
        int n = A.length;
        int res = 0;
        int left = 0, right = 1;
        int gap = 0;
        while (right < n) {
            gap = A[right] - A[left];
            while (right < n && A[right] - A[right - 1] == gap) {
                right++;
            }
            if (right - left > 2) {
                int t = right - left - 2;
                res += (1 + t) * t / 2;
            }
            left = right - 1;
        }
        System.out.println(res);
        return res;

    }
}
