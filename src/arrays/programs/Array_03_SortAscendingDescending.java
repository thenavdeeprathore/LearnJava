package arrays.programs;

import java.util.Arrays;
import java.util.Collections;

public class Array_03_SortAscendingDescending {

    static int[] arr = {40, 30, 10, 50, 20};
    static Integer[] reverse_order_arr = {40, 30, 10, 50, 20};

    public static void main(String[] args) {

        arraySortAscending(arr);
        arraySortDescending(reverse_order_arr);
        sortingAlgorithm(arr);
    }

    private static void arraySortAscending(int[] a) {
        Arrays.sort(a);
        System.out.println(Arrays.toString(a)); // [10, 20, 30, 40, 50]
    }

    private static void arraySortDescending(Integer[] a) {
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println(Arrays.toString(a)); // [50, 40, 30, 20, 10]
    }

    private static void sortingAlgorithm(int[] a) {
        int temp;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("Sort Array in Ascending Order");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }

        System.out.println();

        System.out.println("Sort Array in Descending Order");
        for (int i = a.length-1; i >= 0; i--) {
            System.out.print(a[i]+ " ");
        }
    }
}
