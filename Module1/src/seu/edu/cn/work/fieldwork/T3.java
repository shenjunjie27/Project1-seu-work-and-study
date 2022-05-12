/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-04-24 14:30:54.468-+08:00
 */

package seu.edu.cn.work.fieldwork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Xuyu Fu
 * @version 1.0
 * @description
 * @date 2022/3/23 18:50
 */
public class T3 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int M = 0,N = 0,x = 0;
        for (int i = 0; i < s.length; i++) {
            M = Integer.parseInt(s[0]);
            N = Integer.parseInt(s[1]);
            x = Integer.parseInt(s[2]);
        }
        List<List<String>> mianshiguan = new ArrayList<>();
        List<List<String>> mianshizhe = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String[] s1 = sc.nextLine().split(" ");
            List<String> temp = new ArrayList<>();
            for (int j = 0; j < s1.length; j++) {
                temp.add(s1[j]);
            }
            mianshiguan.add(new ArrayList<>(temp));
        }
        for (int i = 0; i < N; i++) {
            String[] s1 = sc.nextLine().split(" ");
            List<String> temp = new ArrayList<>();
            for (int j = 0; j < s1.length; j++) {
                temp.add(s1[j]);
            }
            mianshizhe.add(new ArrayList<>(temp));
        }


        System.out.println("false");
    }
}
