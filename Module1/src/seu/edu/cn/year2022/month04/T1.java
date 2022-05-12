package seu.edu.cn.year2022.month04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author ShenJunjie
 * @version 1.0
 * @file T1.java
 * @email shenjunjie27@126.com
 * @date 2022/3/26
 * @time 15:17
 */
public class T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> result = new ArrayList<>();
        do {
            String[] s = scanner.nextLine().split(" ");
            int[] nums = new int[2];
            for (int i = 0; i < 2; i++) {
                nums[i] = Integer.parseInt(s[i]);
            }
            int n = nums[0];
            int[] chengji = new int[n];
            String[] s1 = scanner.nextLine().split(" ");
            for (int i = 0; i < n; i++) {
                chengji[i] = Integer.parseInt(s1[i]);
            }

            int count_number = 0;
            while (scanner.hasNextLine()) {
                String[] tmp = scanner.nextLine().split(" ");
                if (tmp[0].equals("Q")) {
                    int l = Integer.parseInt(tmp[1]);
                    int r = Integer.parseInt(tmp[2]);
                    if (l > r) {
                        int t = l;
                        l = r;
                        r = t;
                    }
                    int ans = chengji[l - 1];
                    for (int i = l - 1; i <= r - 2; i++) {
                        if (chengji[i] < chengji[i + 1])
                            ans = chengji[i + 1];
                    }
//               System.out.println(ans);
                    result.add(ans);
                } else {
                    int ID = Integer.parseInt(tmp[1]);
                    int value = Integer.parseInt(tmp[2]);
                    chengji[ID - 1] = value;
                }
                count_number++;
                if (count_number == nums[1]) {

                    break;
                }


            }


        }
        while (scanner.hasNextLine());
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));

        }
        scanner.close();
    }


}

