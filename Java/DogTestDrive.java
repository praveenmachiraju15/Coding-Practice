import java.util.*;

class DogTestDrive{
	public static void main(String[] args){
	
	Dog d = new Dog();
	d.size=10;
	d.name="Shamsky";
	d.breed="Poodle";
	d.bark();
	}
}

class Dog{

int size;
String breed;
String name;


void bark(){
	
System.out.println("Enter your Dogs age:");

	Scanner sc = new Scanner(System.in);
    size = sc.nextInt(); 
	
	System.out.println("My Name is: "+ name);
	System.out.println("My breed is: " +breed);
	System.out.println("Ny size is: "+size);
	System.out.println("Woof! Woof!");
}


}

