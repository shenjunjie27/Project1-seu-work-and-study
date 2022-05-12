package seu.edu.cn.year2022.month03;

public class Test3 {
    public static void main(String[] args) {
        countBits(2);

    }

    public static int[] countBits(int n) {
        int[] bits = new int[n + 1];
        for (int i = 1; i <= n; i++) {

            bits[i] = bits[i & (i - 1)] + 1;
        }
        for (int n1 : bits
        ) {
            System.out.println(n1);

        }

        return bits;

    }
}
