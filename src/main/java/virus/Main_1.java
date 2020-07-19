package virus;

public class Main_1 {

	public static void main(String[] args) {

		Pen p = new Pen();
		System.out.println("Type of pen: "+p.type);
		System.out.println("Before click: "+p.clicked);
		p.click();
		System.out.println("After click: "+p.clicked);
		 
		System.out.println("---------------------");	
		p.penType();
		
	}

}
