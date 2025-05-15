package ExceptionsConcept;

public class ThrowsException {
	public void code() throws InterruptedException {
		System.out.println("Hello Jaava");
		Thread.sleep(5000);
		System.out.println("Welcome to java");
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		ThrowsException obj = new ThrowsException();
		obj.code();
	}

}
