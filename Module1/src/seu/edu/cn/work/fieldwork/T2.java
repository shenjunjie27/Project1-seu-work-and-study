/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-04-24 14:30:54.505-+08:00
 */

package seu.edu.cn.work.fieldwork;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Xuyu Fu
 * @version 1.0
 * @description
 * @date 2022/3/23 18:50
 */
public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(sc.nextLine());
        }
        Map<Integer,int[]> map = new HashMap<>();
        int flag = 0;
        while (s.length() != 0) {
            String tag = s.substring(0,2);
            int tagNum = HexToDec(tag);
            int len = HexToDec(s.substring(2,4));
            if(s.length() < 2*  len)
                break;
            map.put(tagNum, new int[]{len, flag +2});
            flag = flag +2 +len;
            s = s.substring(4+len *2);
        }
        for(int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                int[] ints = map.get(nums[i]);
                int a = ints[0];
                int b = ints[1];
                System.out.println(a + " " + b);
            }else {
                System.out.println(0+" "+0);
            }
        }
    }
    private static int HexToDec(String s) {
        int n = s.length();
        int res = 0;
        for(int i = 0; i < n; i++) {
            int temp = 0;
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                temp = s.charAt(i) - '0';
            } else {
                temp = s.charAt(i) - 'A' + 10;
            }
            res = res * 16 + temp;
        }
        return res;
    }

}
