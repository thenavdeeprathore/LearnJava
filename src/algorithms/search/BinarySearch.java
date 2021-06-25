package algorithms.search;

/**
 * Binary Search is faster than Linear Search
 * Binary Search is the process of search an element from sorted array by repeatedly dividing the search interval in half
 *
 * Pre-conditions: Array must be sorted first then only we can perform Binary Search
 */
public class BinarySearch {

    static int[] arr = {1, 3, 4, 6, 7, 9, 10, 21};
    static int search_item = 10;

    static int li = 0;
    static int hi = arr.length-1;
    static int mi = (li+hi)/2;

    public static void main(String[] args) {
        binarySearchArray(search_item);
    }

    private static void binarySearchArray(int item) {
        while (li<=hi) {
            if (arr[mi] == item) {
                System.out.println("Element "+search_item+" is present at "+mi+" index position");
                break;
            } else if (arr[mi] < item) {
                li = mi + 1;
            } else {
                hi = mi - 1;
            }
            mi = (li+hi)/2;
        }
        if (li > hi) {
            System.out.println("Element "+search_item+" is not present in the array");
        }
    }

}
