package javaConcepts;

public class InstanceVariable {
	
	public String students; //Creating instance variable

	public InstanceVariable() {
		students = "Welcome to java class";
		
	}
	public static void main(String[] args) {
		InstanceVariable obj = new InstanceVariable();
		System.out.println("Students name is " +obj.students);

	}

}
