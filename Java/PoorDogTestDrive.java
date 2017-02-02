class PoorDog{

private int size;
private String name = new String();

public int getSize(){
	return size;
}
public void setSize(int s){
	
	size = s;
}

public String getName(){
	return name;
}
}

public class PoorDogTestDrive{
	
	public static void main(String[] args){
		
		PoorDog pd = new PoorDog();
		
		System.out.println("The dog size is: " +pd.getSize());
		System.out.println("The dog's name is: "+ pd.getName());
	}
}