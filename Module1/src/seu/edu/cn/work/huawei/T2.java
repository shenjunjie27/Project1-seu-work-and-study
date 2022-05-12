/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-04-24 14:30:54.418-+08:00
 */

package seu.edu.cn.work.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<String> list = new ArrayList<>();
        while (n != 0) {
            String s = scanner.nextLine();
            list.add(s);
        }
        for (int i = 1; i <list.get(m).length() ; i++) {
            list.get(m).split(" ");
        }


    }
}
