class Box{
	
	private double height,length,width;
	
	double volume(){
		
		return (height*length*width);
	}
	Box(){
		height = -1;
		length = -1;
		width = -1;
	}
	
	Box(double h, double l, double w){
		
		height = h;
		length = l;
		width = w;
	}
}

class SimpleInheritenceWithConstructor{
	
	public static void main(String[] args){
		
		Box b1 = new Box();
		/* b1.height = 10.0;
		b1.length = 10.0;
		b1.width = 10.0; */
		Box b2 = new Box(2.0,3.0,4.0); //can a constructor initialize private variables????
		System.out.println("b1's volume is: "+b1.volume());
		System.out.println("b2's volume is: "+b2.volume());
		
		
	}
}