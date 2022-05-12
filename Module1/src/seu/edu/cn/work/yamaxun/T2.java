/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-04-24 14:30:54.447-+08:00
 */

package seu.edu.cn.work.yamaxun;

import java.util.List;

public class T2 {
    public static void main(String[] args) {

    }

    public static int getMaximumGreyness(List<String> pixcels) {
        int max = 0;
        for (String pixcel : pixcels) {
            int greyness = getGreyness(pixcel);
            if (greyness > max) {
                max = greyness;
            }
        }
        return max;
    }

    public static int getGreyness(String pixcel) {
        int greyness = 0;
        for (int i = 0; i < pixcel.length(); i++) {
            if (pixcel.charAt(i) == '#') {
                greyness++;
            }
        }
        return greyness;
    }
}
