package ExceptionsConcept;

public class UncheckedException {

	public static void main(String[] args) {
		
		try {
			int a[] = {1,2,3,4,5};
			System.out.println(a[8]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Exception Thrown: "+e);
			
		}
				
		finally {
			System.out.println("Out of bound");

		}
	
	}

}
