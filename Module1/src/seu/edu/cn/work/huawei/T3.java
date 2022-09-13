/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-08-31 16:02:55.390-+08:00
 */

package seu.edu.cn.work.huawei;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.*;

public class T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split(" ");
        int[] arr = new int[str.length];
        float res = 0;
        for (int i = 0; i < str.length; i++) {
            arr[i] = str[i].length();
            res += arr[i];
        }
        res = res / str.length;
        //四舍五入保留两位小数
        res = (float) (Math.round(res * 100)) / 100;
        DecimalFormat df = new DecimalFormat("#.00"); // 借助DecimalFormat保留两位小数的做法
        String format = df.format(res);
        System.out.println(format);
        System.out.println(res);

    }
}
