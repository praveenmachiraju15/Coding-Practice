import java.util.*;

class Car{

void PrintSpeed(){

System.out.println("Car Speed is 10");

}

}

class Porshe extends Car{
	
/*void PrintSpeed(){
	
	super.PrintSpeed();
	System.out.println("Porshe speed is 90");
}*/
}

class Ferrari extends Car{
	
	void printSpeed(){
		System.out.println("Ferrari Speed is 234");
	}
}

class CarTestDrive{
	
	public static void main(String[] args){
		
		Car c1 = new Car();
		c1.PrintSpeed();
		
		Car c2 = new Porshe();
		c2.PrintSpeed();
		
		Porshe p1 = new Porshe();
		p1.PrintSpeed();
	
	}
	
}