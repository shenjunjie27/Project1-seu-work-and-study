/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-04-29 19:10:03.480-+08:00
 */

package seu.edu.cn.year2022.month04;


public class T35 {
    public static void main(String[] args) {
        System.out.println(isHuiwen(123));
        System.out.println(isHuiwen(121));
    }

    public static boolean isHuiwen(int n){
        String s = String.valueOf(n);
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
}
