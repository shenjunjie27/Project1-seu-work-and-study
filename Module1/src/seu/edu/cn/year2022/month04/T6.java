package seu.edu.cn.year2022.month04;

public class T6 {
    public static void main(String[] args) {
        System.out.println(e(10));


    }

    public static int e(int n) {
        boolean[] isPrime = new boolean[n];//false代表素数
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!isPrime[i]) {
                count++;
                for (int j = i * i; j < n; j = i + j) {
                    isPrime[j] = true;
                }
            }
        }
        for (boolean i : isPrime
        ) {
            System.out.println(i);

        }

        return count;

    }


}
