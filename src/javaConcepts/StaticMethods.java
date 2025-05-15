package javaConcepts;

public class StaticMethods {
	static int i=10;
	public static void createdDocuments() {
		System.out.println(i);
		System.out.println("Documents has been created");
	}

	public static void main(String[] args) {
		
		StaticMethods.createdDocuments();
		//System.out.println(StaticMethods.i);
		

	}

}
