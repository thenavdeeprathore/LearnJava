package algorithms.search;

/**
 * Linear Search is also known as Sequential Search
 */
public class LinearSearch {

    static int[] numbers = {1, 5, 8, 11, 6, 3, 11, 9};
    static int item = 11;
    static int count = 0;

    public static void main(String[] args) {
        linearSearchArray(item);
    }

    private static void linearSearchArray(int item) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == item) {
                System.out.println("item: " + item + " is found in the array at index: " + i);
                count = count + 1;
            }
        }
        if (count == 0) {
            System.out.println("item: " + item + " is not present in the array");
        } else {
            System.out.println("item: " + item + " is present in the array " + count + " times");
        }
    }
}
