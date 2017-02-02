import java.util.ArrayList;
import java.util.*;

class cat{

private String name = new String();
private int size;

public int getSize(){
	
	return size;
}

public void setSize(){
	
	System.out.println("Enter a number: ");
	Scanner scanner = new Scanner(System.in);
	size = scanner.nextInt();
}

public String getName(){
	
	return name;
}

public void setName(){
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enther the name:");
	name = scanner.next();
	
}
}

class catTestDrive{
	
	public static void main(String[] args){
		
		ArrayList<cat> catList = new ArrayList<cat>();
		
		cat c1 = new cat();
		cat c2 = new cat();
		c1.setSize();
		c1.setName();
		c2.setSize();
		c2.setName();

		//c1.getSize();
		System.out.println("The cat size is: "+c1.getSize());
		System.out.println("The cat's name is: "+c1.getName());
	
		catList.add(c1);
		catList.add(c2);
		
		System.out.println("The Cat ArrayList<> is Empty?: "+ catList.isEmpty());	
		System.out.println(catList.toString());
		
		/*for(cat c: catList)
			System.out.println(c);
		*/ //this is printing the address of the ArrayList?
		
	}
}