import java.util.ArrayList	;

class ArrayListPractice{
public static void main(String[] args){

ArrayList<String> myList= new ArrayList<String>();
String s = new String();
String t = new String();
s="Name 1";
t="Name 2";



myList.add(s);
myList.add(t);


System.out.println(myList.contains(s));
System.out.println(myList.contains(t));
System.out.println(myList.isEmpty());
}

}