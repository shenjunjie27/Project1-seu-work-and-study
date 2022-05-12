package seu.edu.cn.year2022.month04;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class T13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
                set.add(a);
        }
        Integer[] arr = set.toArray(new Integer[0]);
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}