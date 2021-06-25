package arrays.programs;

public class Array_05_SecondLargest {

    static int[] arr = {40, 30, 10, 50, 20};

    public static void main(String[] args) {
        secondLargestElement(arr);
    }

    private static void secondLargestElement(int[] a) {
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Second Largest Element is: "+a[1]);
    }
}
