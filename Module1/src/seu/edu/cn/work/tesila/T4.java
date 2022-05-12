/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-04-24 14:30:54.326-+08:00
 */

package seu.edu.cn.work.tesila;

public class T4 {
    public static void main(String[] args) {
        int A = 3;
        int B = 7;
        long C = A * B;
        String s = tenToBinary(C);
        System.out.println(count1(s));


    }

    //十进制转二进制
    public static String tenToBinary(long num) {
        String binary = "";
        while (num != 0) {
            binary = (num % 2) + binary;
            num = num / 2;
        }
        return binary;
    }

    //判断二进制中有几个1
    public static int count1(String binary) {
        int count = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}
