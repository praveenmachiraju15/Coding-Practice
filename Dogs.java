class Dogs{

String name = new String();

public void bark(){
	
	System.out.println(name +" says Woof! Woof!");
} 

public static void main(String[] args){



Dogs d1 = new Dogs();
d1.bark();
d1.name="Fred";
Dogs[] myDog = new Dogs[3];

myDog[0] = new Dogs();
myDog[0].name="Marge";
myDog[1] = new Dogs();
myDog[1].name="Jeff";
myDog[2] = d1;

for(int i=0;i<myDog.length;i++){
	
	myDog[i].bark();
}

}



}