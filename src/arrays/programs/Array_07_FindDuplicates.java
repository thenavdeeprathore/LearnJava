package arrays.programs;

public class Array_07_FindDuplicates {

    public static void main(String[] args) {
        int[] arr = {3, 6, 4, 3, 2, 2, 1};

        // Three ways to find duplicates
        bruteForceMethod(arr);
    }

    private static void bruteForceMethod(int[] a) {
        System.out.println("Duplicate Elements are: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if ((a[i] == a[j]) && (i!=j)) {
                    System.out.print(a[j]+ " ");
                }
            }
        }
    }
}
