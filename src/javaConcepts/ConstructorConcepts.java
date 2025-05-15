package javaConcepts;

public class ConstructorConcepts {
 
	int x;
	String name;
	
	public ConstructorConcepts() {
		this.x = 1000;
		this.name="Revathy";
		
	}
	void display() {
		System.out.println(x + "=====" + name);
	}
	
	public static void main(String[] args) {
		
		ConstructorConcepts obj = new ConstructorConcepts();
		obj.display();

	}

}
