package seu.edu.cn.year2022.leetcode;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _448 {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(nums));


    }


//    public static List<Integer> findDisappearedNumbers(int[] nums) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int n = nums.length;
//        for (int i = 0; i < n; i++) {
//            if (map.get(nums[i]) == null) {
//                map.put(nums[i], i);
//            }
//
//        }
//        List<Integer> list = new ArrayList<>();
//        for (int i = 1; i <= n; i++) {
//            if (map.get(i) == null) {
//                list.add(i);
//
//
//            }
//        }
//
//        return list;


    //    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for (int num : nums) {
            int x = (num - 1) % n;
            nums[x] += n;
        }
        List<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (nums[i] <= n) {
                ret.add(i + 1);
            }
        }
        return ret;
    }
}


