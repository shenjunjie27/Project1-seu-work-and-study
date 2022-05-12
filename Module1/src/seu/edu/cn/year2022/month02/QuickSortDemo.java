package seu.edu.cn.year2022.month02;


import java.util.ArrayList;
import java.util.Random;

public class QuickSortDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            arrayList.add(new Random().nextInt(20));//

        }
        System.out.print("Before: " + arrayList + "\n" );

        quickSort(arrayList, 0, arrayList.size() - 1);
        System.out.print("After: " + arrayList + "\n" );


    }

    public static void quickSort(ArrayList<Integer> arrayList, int left, int right) {
        if (left > right)
            return;

        int key = arrayList.get(left);
        int i = left;
        int j = right;
        while (i < j) {
            while (i < j && key <= arrayList.get(j)) {
                j--;
            }
            while (i < j && key >= arrayList.get(i)) {
                i++;
            }
            if (i < j) {
                int temp = arrayList.get(j);
                arrayList.set(j, arrayList.get(i));
                arrayList.set(i, temp);
            }
        }
        arrayList.set(left, arrayList.get(i));
        arrayList.set(i, key);
        quickSort(arrayList, left, i - 1);
        quickSort(arrayList, i + 1, right);


    }
}
