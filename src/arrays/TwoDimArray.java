package arrays;

public class TwoDimArray {

    public static void main(String[] args) {
        int[][] a = {{10, 20, 30}, {40, 50}};

        System.out.println(a); // [[I@1b6d3586
        System.out.println(a[0]); // [I@4554617c
        System.out.println(a.length); // 2
        System.out.println(a[0].length); // 3

        printArrayUsingForLoop(a);
        printArrayUsingForEach(a);

    }

    static void printArrayUsingForLoop(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }

    static void printArrayUsingForEach(int[][] arr) {
        for (int[] i : arr) {
            for (int j: i) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
