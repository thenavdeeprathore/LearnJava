package dynamicArray;

import java.util.ArrayList;

public class ArrayListTutorial {

	public static void main(String[] args) {
		
		DynamicArray dynamicArray = new DynamicArray();
		
		dynamicArray.add("A");
		dynamicArray.add("B");
		dynamicArray.add("C");
		
		System.out.println(dynamicArray);
		System.out.println("size: " + dynamicArray.size);
		System.out.println("capacity: " + dynamicArray.capacity);
		System.out.println("empty: " + dynamicArray.isEmpty());
		
		System.out.println(dynamicArray.get(0));
		dynamicArray.insert(0, "X");
		System.out.println(dynamicArray);
		dynamicArray.delete("A");
		System.out.println(dynamicArray);
		System.out.println("size: " + dynamicArray.size);
		System.out.println("capacity: " + dynamicArray.capacity);
		System.out.println(dynamicArray.search("C"));
		
		ArrayList<String> al = new ArrayList<>();
		System.out.println(al.isEmpty());
		System.out.println(al);
		System.out.println(al.size());

	}

}
