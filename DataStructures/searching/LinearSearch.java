package searching;

/**
 * Linear Search = Iterate through a collection one element at a time
 * 
 * runtime complexity = O(n)
 * 
 * Disadvantages:
 * --------------
 * 1) Slow for large data sets
 * 
 * Advantages:
 * -----------
 * 1) Fast for searches of small to medium data sets
 * 2) Does not need to be sorted
 * 3) Useful for data structure that do not have random access (Linked List)
 * 
 * @author Navdeep
 */

public class LinearSearch {
	
	static int element = 7;
	static int [] arr = {3, 2, 7, 4, 8, 1};
	
	public static void main(String[] args) {
		
		int index = linearSearch(arr, element);
		
		if (index != -1) {
			System.out.println("Element "+element+" is present at index: "+index);
		} else {
			System.out.println("Element is not present");
		}

	}
	
	private static int linearSearch(int[] arr, int value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				return i;
			}
		}
		return -1;
		
	}

}
