package arrays.programs;

public class Array_04_MaxAndMin {

    static int[] arr = {40, 30, 10, 50, 20};

    public static void main(String[] args) {
        maxArray(arr);
        minArray(arr);
    }

    private static void maxArray(int[] a) {
        int max = a[0];

        for (int i = 1; i < a.length ; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Max element is: "+max);
    }

    private static void minArray(int[] a) {
        int min = a[0];

        for (int i = 1; i < a.length ; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Min element is: "+min);
    }
}
