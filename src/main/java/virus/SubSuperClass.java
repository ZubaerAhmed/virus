package virus;

class Shoe{
	public final String brand;
	public final double size;
	Shoe(String brand, double size){
		this.brand = brand;
		this.size = size;
	}
}
//--------------------------------------------
class Walking extends Shoe{
	public final boolean goreTex;
	Walking(boolean goreTex, String brand, double size){
		super(brand, size);
		this.goreTex = goreTex;
	}
}
//--------------------------------------------
class Running extends Shoe{
	public final double weight;
	Running(double weight, String brand, double size){
		super(brand, size);
		this.weight = weight;
	}
}
//--------------------------------------------
public class SubSuperClass {
	public static void main(String[] args) {
		Shoe s = new Shoe("Nike", 10);
		System.out.println(s.brand);
		Walking w = new Walking(true,"Nike",9);
		System.out.println(w.goreTex +"-"+w.size);
		Running r = new Running(20, "Bata", 8);
		System.out.println(r.weight+"-"+r.size);
		
	}

}
