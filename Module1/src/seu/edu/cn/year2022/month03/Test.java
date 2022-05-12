package seu.edu.cn.year2022.month03;


import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
//        Map<Integer, Integer> map = new HashMap<>();
//        map.put(1, 2);
//        map.put(3, 5);
//        System.out.println(map.get(1));
//        System.out.println(map.get(3));
//        String s = "AAA1";
//        System.out.println(s.length());
//        System.out.println(s.charAt(3));
        int[] nums = {2,5};
        int target = 0;

        System.out.println(searchIndex(nums, target, 0, nums.length - 1));

    }

    public static int searchIndex(int[] nums, int target, int left, int right) {
        if (nums.length == 0) return -1;

        int n = right - left + 1;
        int k = -1;

        if (n % 2 == 0) {
            k = n / 2 - 1 + left;

        } else {
            k = (n - 1) / 2 + left;
        }
        while (n != 1) {
            if (nums[k] == target)
                break;
            while (nums[k] != target) {
                if (nums[k] < target) {
                    left = k + 1;
                    return searchIndex(nums, target, left, right);
                } else if (nums[k] > target) {
                    right = k;
                    return searchIndex(nums, target, left, right);
                }

            }
        }
//        System.out.println(k);
        if (nums[k] != target) {
            k = -1;
        }
        return k;
    }


}
