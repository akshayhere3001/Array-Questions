import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists{
	public static void main(String[] args) {
		 
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// adding elements in Array
		list.add(0);
		list.add(4);
		list.add(16);
		list.add(2);
		
		System.out.println(list);
		
		
		// getting elements from an Array
		int element = list.get(0);
		System.out.println(element);
		
		// adding element at proper index
//		add(index, value)
		list.add(3, 34);
		System.out.println(list);
		
		// Replacing element
		// set(index, value)
		list.set(1, 23);
		System.out.println(list);
		
		
		// Delete Element
		list.remove(3);
		System.out.println(list);
		
		// Size of an Array
		int size = list.size();
		System.out.println("Size" + " " + size);
		
		// Iterate through an Array
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// Sorting an Array
		Collections.sort(list);
		System.out.println(list);
		
	}
}
