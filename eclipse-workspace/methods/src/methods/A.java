package methods;

public class A {

	public static void main(String[] args) {
	System.out.println("A main()");
	m1();
	
	}
	public static void m1() {
		System.out.println("A main()");
		main(new String[0]);
		
	}
	
}

