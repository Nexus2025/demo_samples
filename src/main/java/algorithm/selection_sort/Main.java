package algorithm.selection_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 7, 1, 4, 11, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /*
        Алгоритм сортировки выбором - O(n^2)
        Метод сортирует входной массив
     */
    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int pos = i;
            int min = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    pos = j;
                    min = arr[j];
                }
            }

            arr[pos] = arr[i];
            arr[i] = min;
        }
    }
}
