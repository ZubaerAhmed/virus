package virus;

abstract class Color {
	public void colorSet() {
		System.out.println("Color class" );
	}
//abstract method-no body, it has idea but don't know what to do
//abstract class has both method unimplemented-implemented
//interface does not has body(unimplemented)
//for interface we use implements but for abstract we use extends
	public abstract void colorGet();
}
//Class is blueprint of object. 
//Class has variable/attribute and methods
//Object is what we do things in real world
//we can make multiple object of same class if we need
//--------------------------------------------
class Flower extends Color{
	@Override
	public void colorGet() {
		System.out.println("Flower class");		
	}	
}
//--------------------------------------------
public class AbstractClass {
	public static void main(String[] args) {
		Flower f = new Flower();
		f.colorSet();
		f.colorGet();
	}
}

