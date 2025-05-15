package javaConcepts;

public class ParameterizedConstructor {
	
	int x;
	int y;
	
	public ParameterizedConstructor(int x) {
		this.x =x; 
	}
	
	public ParameterizedConstructor(int x,int y) {
		this.x =x;
		this.y =y;
	}
	
	void display() {
		System.out.println("x value is "+x);
	}

	public static void main(String[] args) {
		
		ParameterizedConstructor obj = new ParameterizedConstructor(100);	
		obj.display();
		ParameterizedConstructor obj1 = new ParameterizedConstructor(1000,200);	
		obj1.display();
		

	}

}
