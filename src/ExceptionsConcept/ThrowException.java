package ExceptionsConcept;

public class ThrowException {

	public void demo() throws IllegalAccessException {
		System.out.println("Welcome Java");
		throw new IllegalAccessException("Illegal error");
	}
	public static void main(String[] args) {
		
		ThrowException obj = new ThrowException();
		try {
			obj.demo();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

} 
