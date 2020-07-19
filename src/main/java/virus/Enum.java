package virus;

public class Enum {
	
	enum Color{
		RED, GREEN, BLUE;
	}

	public static void main(String[] args) {
		Color c = Color.BLUE;
		
		if(c == Color.BLUE) {
			System.out.println("It is not RED");
		}else {
			System.out.println("Quit");
		}
	//-----------------------------------------
		switch(c) {
		case BLUE:
			System.out.println("It is BLUE");
			break;
		case RED:
			System.out.println("It is RED");
			break;
		}
	//-----------------------------------------

	}

}
