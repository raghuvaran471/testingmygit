package pattern;

public class Eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len=2;
		for(int i=0; i<=5; i++) {
		for(int j=0; j<5; j++) {
			if(len==j) {
			System.out.println("*");
			
			}else if(len==i) {
				System.out.println("*");
				
			}
		}
		System.out.println();
	}

}
}
	
