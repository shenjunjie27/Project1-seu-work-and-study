/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-09-02 21:15:27.997-+08:00
 */

package seu.edu.cn.work.oppo;

public class T2 {

    public int findStr (String str, String mod) {
        // write code here
        str = new StringBuilder(str).reverse().toString();

        int n = str.length();
        int m = mod.length();
        int i = 0;
        int j = 0;
        int res = -1;
        while (i < n && j < m) {
            if (str.charAt(i) == mod.charAt(j)|| mod.charAt(j) == '*') {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
            if (j == m) {
                res = i - j;
                j = 0;
            }
        }
        if(res == -1){
            return res;
        }
        return str.length() - res -1;


    }
}
