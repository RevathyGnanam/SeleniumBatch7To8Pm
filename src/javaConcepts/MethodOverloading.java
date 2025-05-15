package javaConcepts;

public class MethodOverloading {
	
	public void createDocuments() {
		System.out.println("Created documents");
	}
	public void createDocuments(int i) {
		System.out.println("Created 2nd documents");
	}
	

	public static void main(String[] args) {
		MethodOverloading obj =new MethodOverloading();
		obj.createDocuments();
		obj.createDocuments(10);
		
		

	}

}
