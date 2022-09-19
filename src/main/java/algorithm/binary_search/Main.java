package algorithm.binary_search;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println("Array: " + Arrays.toString(arr));

        //итеративный подход
        binarySearchIterative(arr, 2);

        //рекурсивный подход
        int result = binarySearchRecursive(arr, 0, arr.length - 1, 5);
        System.out.printf("Recursive. Index is %d", result);
    }

    /*
        Алгоритм бинарного поиска O(log(N))
        Метод выводит в out кол-во итераций и искомое число (если найдено)
        Итеративный подход
     */
    private static void binarySearchIterative(int[] arr, int number) {
        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        int count = 0;
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;

            if (arr[middleIndex] == number) {
                System.out.printf("Iterative. Number: %d, Iteration count: %d\n", arr[middleIndex], count);
                return;

            } else if (arr[middleIndex] > number) {
                lastIndex = middleIndex - 1;

            } else {
                firstIndex = middleIndex + 1;
            }

            count++;
        }

        System.out.printf("Number is not found, Iteration count: %d", count);
    }

    /*
        Алгоритм бинарного поиска O(log(N))
        Метод возвращает индекс искомого числа или -1 (если не найдено)
        Рекурсивный подход
     */
    private static int binarySearchRecursive(int[] arr, int firstElement, int lastElement, int number) {
        if (lastElement >= firstElement) {
            int mid = firstElement + (lastElement - firstElement) / 2;

            if (arr[mid] == number) {
                return mid;
            }

            if (arr[mid] > number) {
                return binarySearchRecursive(arr, firstElement, mid - 1, number);
            }

            return binarySearchRecursive(arr, mid + 1, lastElement, number);
        }

        return -1;
    }
}
