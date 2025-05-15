package javaConcepts;

public class MethodOverridingChildClass extends MethodOverriding {
	
	void createdDocuments() {
		System.out.println("my new documents has been created");
	}

	public static void main(String[] args) {
		
		MethodOverridingChildClass obj = new MethodOverridingChildClass();
		obj.createdDocuments();

	}

}
