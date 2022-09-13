/*
 * Copyright (c) 2022
 * @Author:shenjunjie27@126.com
 * @LastModified:2022-09-02 20:45:11.410-+08:00
 */

package seu.edu.cn.work.oppo;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class T1 {
    public ArrayList<Integer> getWakeLockContrib(ArrayList<ArrayList<Integer>> wakeLock) {
        // write code here
        ArrayList<Integer> res = new ArrayList<>();
        int n = wakeLock.size();
        Map<Integer, Integer> map = new TreeMap<>();


        for (int i = 0; i < n; i++) {
            int m = wakeLock.get(i).size();
            for (int j = 0; j < m; j++) {
                if (j % 2 == 0) {
                    map.put(wakeLock.get(i).get(j), map.getOrDefault(wakeLock.get(i).get(j), 0) + 1);
                } else {
                    map.put(wakeLock.get(i).get(j), map.getOrDefault(wakeLock.get(i).get(j), 0) - 1);
                }
            }
        }



        for (int i = 0; i < n; i++) {
            int m = wakeLock.get(i).size();
            int temp = 0;
            for (int j = 0; j < m; j++) {
                if (j % 2 == 0) {
                    temp = map.get(wakeLock.get(i).get(j));

                } else {
                    temp = map.get(wakeLock.get(i).get(j));
                }


            }
            res.add(temp);
        }
        return res;


    }


}
