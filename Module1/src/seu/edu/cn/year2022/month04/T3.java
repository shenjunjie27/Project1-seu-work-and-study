package seu.edu.cn.year2022.month04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        while (sc1.hasNextLine()) {
            String s = sc1.nextLine();
            if (s.equals(""))
                break;
            list.add(s);
        }
        int count_number = 0;
        List<Integer> list_index = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).charAt(0) != 'Q' && list.get(i).charAt(0) != 'U') {
                list_index.add(i);
                count_number++;
                i++;
            }
        }
        for (int i = 0; i < count_number; i++) {
            round(list, list_index.get(i));
        }

    }

    public static int round(List<String> list, int k) {
        List<Integer> result = new ArrayList<>();
        String[] ss = list.get(k).split(" ");
        int[] nums = new int[2];
        for (int i = 0; i < 2; i++) {
            nums[i] = Integer.parseInt(ss[i]);
        }
        int index = k + nums[1];

        int n = nums[0];
        int[] chengji = new int[n];
        String[] s1 = list.get(1 + k).split(" ");
        for (int i = 0; i < n; i++) {
            chengji[i] = Integer.parseInt(s1[i]);
        }
        for (int i = 0; i < nums[1]; i++) {
            String[] tmp = list.get(i + 2 + k).split(" ");
            if (tmp[0].equals("Q")) {
                int l = Integer.parseInt(tmp[1]);
                int r = Integer.parseInt(tmp[2]);
                if (l > r) {
                    int t = l;
                    l = r;
                    r = t;
                }
                int ans = chengji[l - 1];
                for (int j = l - 1; j <= r - 2; j++) {
                    if (chengji[j] < chengji[j + 1])
                        ans = chengji[j + 1];
                }
//               System.out.println(ans);
                result.add(ans);
            } else {
                int ID = Integer.parseInt(tmp[1]);
                int value = Integer.parseInt(tmp[2]);
                chengji[ID - 1] = value;
            }

        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));

        }
        return index;

    }
}
