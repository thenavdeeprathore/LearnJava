package arrays.programs;

public class Array_01_PrintOriginal {

    public static void main(String[] args) {
        int[] a = {10, 20, 30};

        // Print Array through 4 ways
        printArrayUsingForLoop(a);
        printArrayUsingForEach(a);
        printArrayUsingWhileLoop(a);
        printArrayUsingDoWhileLoop(a);
    }

    private static void printArrayUsingForLoop(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void printArrayUsingForEach(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void printArrayUsingWhileLoop(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            System.out.println(arr[i]);
            i++;
        }
    }

    private static void printArrayUsingDoWhileLoop(int[] arr) {
        int i = 0;
        do {
            System.out.println(arr[i]);
            i++;
        } while (i < arr.length);
    }
}
