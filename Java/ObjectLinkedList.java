import java.util.LinkedList;

class Person { //creating the object that is to be held inside by a list

	String firstName; // has 4 properties
	String lastName;
	int age;
	String address;

	Person(String fn, String ln, int a, String addr) { //parameterized constructor
		this.firstName = fn;
		this.lastName = ln;
		this.age = a;
		this.address = addr;
	}
	
	public String toString(){ // this method stringifies the object.
		return firstName + " " + lastName + " " + age + " " + address;
	}
}

class ObjectLinkedList { //actual linkedlist class will be here

	public static void main(String[] args) {

		LinkedList<Person> pll = new LinkedList<Person>(); // creating a ll or
															// people named: pll
		pll.add(new Person("First Name 0", "Last Name 0", 23, "Chantilly")); //adding new "People" into pll
		pll.add(new Person("First Name  1", "Last Name 1", 23, "Reston")); 

		for (Person elem : pll) {
			System.out.println(elem+ "\n");
		}

	}

}