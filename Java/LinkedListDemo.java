import java.util.*;

class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("A");
		ll.add("B");
		ll.add("C");
		
		System.out.println("Printing the LL so far: "+ ll);
		
		ll.remove("B");
		System.out.println("Printing the LL After remove: "+ ll);
		System.out.println(ll.contains("A"));

	}

}