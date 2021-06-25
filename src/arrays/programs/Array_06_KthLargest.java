package arrays.programs;

public class Array_06_KthLargest {

    static int[] arr = {40, 30, 10, 50, 20};

    public static void main(String[] args) {

        kLargestElement(arr);
    }

    private static void kLargestElement(int[] a) {
        // 3rd largest element
        int k = 3;
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            if (i == k-1) {
                System.out.println("Kth Largest Element is: "+a[i]);
                break;
            }
        }

    }
}
