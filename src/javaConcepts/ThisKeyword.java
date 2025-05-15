package javaConcepts;

public class ThisKeyword {
	
	int c=10; //instance variable
	
	public ThisKeyword(int c) {
		this.c =c;
	}

	

	public static void main(String[] args) {
		ThisKeyword obj = new ThisKeyword(5);
		ThisKeyword obj1 = new ThisKeyword(20);
		System.out.println("Value of c "+obj.c);
		System.out.println("Value of c "+obj1.c);
		
		

	}

}
