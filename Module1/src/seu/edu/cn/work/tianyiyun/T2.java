/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-04-24 14:30:54.309-+08:00
 */

package seu.edu.cn.work.tianyiyun;

public class T2 {
    public int getOddNum(int min, int max) {

        // write code here
        int count = 0;
        for (int i = min; i <= max; i++) {
            if (i % 2 == 1) {
                count++;
            }
        }
        return count;
    }
}
