package virus;

public class Rcursion {

	public static void main(String[] args) {

		recursionMethod(3);
	}
	
	public static void recursionMethod(int n) {
		//Need Base case
		if(n==0) {
		System.out.println("Done");
		}else {
			System.out.println(n);
			n--;
			recursionMethod(n);
		}
	}

}
