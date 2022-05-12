package seu.edu.cn.year2022.month03;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        Solution solution = new Test4().new Solution();
        System.out.println(solution.solution("dBacaAA", "caBdaaA"));
        // TO TEST
    }

    class Solution {
        public int solution(String A, String B) {
            if (A == "")
                return 0;
            // write your code in Java SE 11
            int res = 0;

            char[] s1 = A.toCharArray();
            char[] s2 = B.toCharArray();

            for (int i = 0; i < s1.length; i++) {
                for (int j = i; j < s1.length; j++) {
                    res = res + cal(s1, s2, i, j);

                }

            }

            return res;

        }

        public int cal(char[] s1, char[] s2, int l, int r) {
            int ans = 1;
            char[] s1_new = new char[r - l + 1];
            char[] s2_new = new char[r - l + 1];

            for (int i = 0; i < r - l + 1; i++) {
                s1_new[i] = s1[i + l];
                s2_new[i] = s2[i + l];

            }
            Arrays.sort(s1_new);
            Arrays.sort(s2_new);
            for (int i = 0; i < s1_new.length; i++) {
                if (s1_new[i] != s2_new[i]) {
                    ans = 0;
                    break;
                }
            }
            return ans;
        }


    }

}
