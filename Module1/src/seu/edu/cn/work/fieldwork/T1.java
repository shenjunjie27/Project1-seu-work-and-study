/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-04-24 14:30:54.490-+08:00
 */

package seu.edu.cn.work.fieldwork;

import java.util.Scanner;

/**
 * @author Xuyu Fu
 * @version 1.0
 * @description
 * @date 2022/3/23 18:50
 */
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(s1[i]);
        }
        int k = Integer.parseInt(sc.nextLine());
        int res = 0;
        int end = 0;
        int temp = 0;
        for(int i = 0; i<= end && end < nums.length -1; ++i) {
            temp = Math.max(temp, i + nums[i]);
            if(i == end) {
                end = temp;
                res++;
            }
        }
        if(res > k) res = -1;
        System.out.println(res);
    }
}
