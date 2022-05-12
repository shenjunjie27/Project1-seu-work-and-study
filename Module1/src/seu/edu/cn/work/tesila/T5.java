/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-04-24 14:30:54.311-+08:00
 */

package seu.edu.cn.work.tesila;

public class T5 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 4, 2};
        int[] arr1 = {1, 2, 3, 2};
        System.out.println(new T5().getLongestSlice1(arr));
        System.out.println(new T5().getLongestSlice1(arr1));
    }

    // 最长双值切片


    public int getLongestSlice1(int[] arr) {
        int a = -1;
        int b = -1;
        int res = 0;
        int count = 0;
        int count_new = 0;
        for (int i = 0; i < arr.length; i++) {
            int c = arr[i];
            if (c == a || c == b) {
                count++;
            } else {
                count = count_new + 1;
            }

            if (c == a) {
                count_new++;
            } else {
                count_new = 1;
                b = a;
                a = c;
            }
            res = res > count ? res : count;
        }
        return res;
    }

}
