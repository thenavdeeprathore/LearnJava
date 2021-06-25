package arrays;

public class OneDimArray {

    public static void main(String[] args) {
        int[] a = {10, 20, 30};

        System.out.println(a); // [I@1b6d3586
        System.out.println(a.length); // 3

        // Print Array through 4 ways
        printArrayUsingForLoop(a);
        printArrayUsingForEach(a);
        printArrayUsingWhileLoop(a);
        printArrayUsingDoWhileLoop(a);
    }

    static void printArrayUsingForLoop(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void printArrayUsingForEach(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    static void printArrayUsingWhileLoop(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            System.out.println(arr[i]);
            i++;
        }
    }

    static void printArrayUsingDoWhileLoop(int[] arr) {
        int i = 0;
        do {
            System.out.println(arr[i]);
            i++;
        } while (i < arr.length);
    }
}
