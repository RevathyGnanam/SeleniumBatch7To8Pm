package javaConcepts;

public class MethodCalling {

	public static void main(String[] args) {
		MethodConcepts obj = new MethodConcepts();
		obj.createDocument();
		String shared = obj.shareDocument();
		System.out.println(shared);

	}

}
