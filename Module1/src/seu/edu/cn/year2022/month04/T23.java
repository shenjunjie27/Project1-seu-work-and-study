package seu.edu.cn.year2022.month04;

public class T23 {
    public static void main(String[] args) {

        int[] arr = bubbleSort(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //Bubble Sort
    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
