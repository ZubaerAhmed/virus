package virus;

//Mutator method is a method used to control changes to a variable. 
//They are also widely known as setter methods.
class Student {
	private String name;
	//private int age;
//-------------------------------------------
	Student(String name){
		this.name = name;
	}
//OR	
//	public void setName(String name) {
//		this.name = name;
//	}
//--------------------------------------------
	public String getName() {
		return name;
	}
	public String printName() {
		String s = getName();//getName()+getAge()+GetAddress();
		return s;
	}
}

public class Encapsulaton {

	public static void main(String[] args) {
		Student s = new Student("Zubaer");
		//s.setName("Zubaer");
			System.out.println(s.getName()); 
			System.out.println(s.printName());
	} 

}
 