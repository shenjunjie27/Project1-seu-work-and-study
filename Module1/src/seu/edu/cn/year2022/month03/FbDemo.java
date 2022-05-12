package seu.edu.cn.year2022.month03;

public class FbDemo {
    public static void main(String[] args) {
        System.out.println(fb(4));

    }

    public static int fb(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        int[] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 2;
        for (int i = 0; i <= n; i++) {

            if (i > 2) {
                nums[i] = nums[i - 1] + nums[i - 2];
            }

        }
        return nums[n];
    }
}
