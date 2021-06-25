package arrays.programs;

public class Array_02_PrintReverse {

    public static void main(String[] args) {
        int[] a = {10, 20, 30};

        printReverseArrayUsingForLoop(a);
    }

    private static void printReverseArrayUsingForLoop(int[] arr) {
        for (int i = arr.length-1; i>=0; i--) {
            System.out.print(arr[i]+ " ");
        }
    }
}
