package seu.edu.cn.year2022.month02;

import java.util.ArrayList;
import java.util.Random;

public class BubbleSortDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(new Random().nextInt(20));//

        }
        System.out.print("Before: ");
        for (int i :
                arrayList
        ) {
            System.out.print(i + " ");
        }
        System.out.println();
        bubbleSort(arrayList, arrayList.size() - 1);
        System.out.print("After: ");
        for (int i :
                arrayList
        ) {
            System.out.print(i + " ");
        }
    }

    public static void bubbleSort(ArrayList<Integer> arrayList, int right) {
        for (int i = 0; i < right; i++) {
            if (arrayList.get(i) > arrayList.get(i + 1)) {
//                int t = arrayList.get(i);
//                arrayList.set(i, arrayList.get(i + 1));
//                arrayList.set(i + 1, t);
                swap(arrayList, i, i + 1);
            }
        }
        right = right - 1;
        if (0 < right) {
            bubbleSort(arrayList, right);
        }

    }

    public static void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }

    public static void swap(ArrayList<Integer> arrayList, int i, int j) {
        int temp = arrayList.get(i);
        arrayList.set(i, arrayList.get(j));
        arrayList.set(j, temp);
    }
}


