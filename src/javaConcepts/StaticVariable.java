package javaConcepts;

public class StaticVariable {
	public static String students ="Welcome to java class";

	public static void main(String[] args) {
		StaticVariable obj = new StaticVariable();
		System.out.println(obj.students);
		System.out.println(StaticVariable.students);

	}

}
