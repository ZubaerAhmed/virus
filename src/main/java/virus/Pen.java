package virus;

public class Pen {

	static String type = "Gel";
	static String type2 = "Ball";
	String type3 = "Ink";
	static String[] type4 = {"Gel", "Ball", "Ink"};
	
	static boolean clicked = false;
	
	public static void click() {
		clicked = true;
	}
	
	public static void penType() {
		if(clicked) {
			System.out.println("Pen is: "+ type4[0]);
		}else {
			System.out.println("Pen is: "+ type);
		}
		Pen p = new Pen();
		System.out.println("Pen is: "+ p.type3);
	} 
	
}
