package seu.edu.cn.year2022.month01;

import java.util.ArrayList;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(new Random().nextInt(15) + 1);
            //System.out.print("请输入第"+(i+1)+"个数:");
            //arr.add(new Scanner(System.in).nextInt());
        }
        System.out.print("快排之前的集合为:" + arr + "\n");

        quickSort(arr, 0, arr.size() - 1);
        System.out.println("快排之后的集合为:" + arr + "\n");
//        int[] nums = {1, 3, 4, 9, 8, 0, -9};
//        quickSort(nums, 0, nums.length - 1);
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i] + " ");
//        }
    }

    //快排 集合实现 ArrayList
    public static void quickSort(ArrayList<Integer> arr, int low, int high) {
        int i, j, key, t;
        if (low > high) {
            return;
        }
        i = low;
        j = high;
        key = arr.get(low);
        while (i < j) {
            while (key <= arr.get(j) && i < j) {
                j--;//从右边找起，找到某值大于等于key
            }
            while (key >= arr.get(i) && i < j) {
                i++;//从左边找起，找到某值小于等于key
            }
            if (i < j) {
                t = arr.get(j);
                arr.set(j, arr.get(i));
                arr.set(i, t);//arr.get(i) arr.get(j)交换值
            }
        }
        arr.set(low, arr.get(i));
        arr.set(i, key);//key放到中间

        quickSort(arr, low, i - 1);
        quickSort(arr, i + 1, high);
    }

}