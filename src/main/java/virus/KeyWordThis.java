package virus;

public class KeyWordThis {

	static int a;
	static int b;
	
    //	no static
	public void setData(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public KeyWordThis(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public static void main(String[] args) {
		
		KeyWordThis k = new KeyWordThis(5, 6);
		System.out.println(k.a + " + " + k.b);

		k.setData(3, 4);
		System.out.println(a +" + "+ b);
	}

}
