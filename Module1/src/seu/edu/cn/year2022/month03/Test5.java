package seu.edu.cn.year2022.month03;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        Solution solution = new Test5().new Solution();
//        System.out.println(solution.solution("dBacaAA", "caBdaaA"));
        // TO TEST
    }

    class Solution {
        public int solution(int[] A) {
            // write your code in Java SE 11
//            Arrays.sort(A);
//            return A[0] + A[1];
            int n = A.length;
            int ans1 = A[0];
            int ans2 = A[0];
            for (int i = 1; i < n; i++) {
                if (A[i] < ans1) {
                    ans1 = A[i];
                }
            }
            for (int i = 1; i < n; i++) {
                if (A[i] < ans2 && A[i] != ans1) {
                    ans2 = A[i];
                }
            }
            return ans1+ans2;

        }


    }

}
