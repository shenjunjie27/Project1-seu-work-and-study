/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-08-20 21:31:36.827-+08:00
 */

package seu.edu.cn.work.kedaxunfei;
import java.util.ArrayList;
import java.util.List;

public class T1 {
    public static void main(String[] args) {
        System.out.println(new T1().seqSum(1));
    }

    public float seqSum(int n) {
        // write code here
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list2.add(2);
        for (int i = 1; i < n; i++) {
            list1.add(list2.get(i - 1));
            list2.add(list1.get(i - 1) + list2.get(i - 1));
        }
        float res = 0;
        for (int i = 0; i < n; i++) {
            res += (float)list1.get(i) / (float) list2.get(i);

        }
        //保留两位小数
        res = (float) (Math.round(res * 100)) / 100;
        return res;
    }

   
}