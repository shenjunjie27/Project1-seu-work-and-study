package seu.edu.cn.year2022.month03;



public class Test7 {
    public static void main(String[] args) {
        Solution solution = new Test7().new Solution();
        int[] V = {10,5,10,5};
        System.out.println(solution.solution("ABAB", V));
        // TO TEST
    }

    class Solution {
        public int[] solution(String R, int[] V) {
            // write your code in Java SE 11
//            Arrays.sort(A);
//            return A[0] + A[1];
            char[] r = R.toCharArray();
            int m = 0;
            int n = 0;
            int[] ans = new int[2];
            for (int i = 0; i < r.length; i++) {
                if (r[i] == 'B') {
                    m = m + V[i];
                    n = n - V[i];
                    ans[1]=Math.max(ans[1],m < 0 ? -m : 0);
                    ans[0]=Math.max(ans[0],n < 0 ? -n : 0);
                } else {
                    m = m - V[i];
                    n = n + V[i];
                    ans[1]=Math.max(ans[1],m < 0 ? -m : 0);
                    ans[0]=Math.max(ans[0],n < 0 ? -n : 0);
                }

            }
            return ans;

        }


    }

}
