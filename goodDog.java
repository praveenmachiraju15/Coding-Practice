/********************************************
*Program to practice get() and set() methods*
********************************************/

class goodDog{

private int size;

public int getSize(){
	
	return size;
}

public void setSize(int s){
	
	size = s;
}
void bark(){
	
	if(size > 60)
		System.out.println("Woof! Woof!");
	else if(size > 14)
		System.out.println("Ruff! Ruff!");
	else
		System.out.println("Yipp! Yipp!");
}
}

class goodDogTestDrive{
	
	public static void main(String[] args){
		
		goodDog g = new goodDog();
		g.setSize(70);
		goodDog d = new goodDog();
		d.setSize(8);
		
		System.out.println("Dog one: "+g.getSize());
		System.out.println("Dog two: "+d.getSize());
		
		g.bark();
		d.bark();
		
		
	}
}