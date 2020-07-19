package virus;

public class Constructor {

	public static String color;
	public static String size;
	
	Constructor(){
	//blank constructor like default	
	}
	
	Constructor(String newColor, String newSize){
		color = newColor;
		size = newSize;
	}
	public static void putOn() {
		System.out.println("Shirt is putOn");
	}
}
