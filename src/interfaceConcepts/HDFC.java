package interfaceConcepts;

public abstract class HDFC implements RBI{
	int gpayLimit =10000;

	
	public void aadharCardMandatory() {
		System.out.println("added");
	}
	public void aadharCardMandatory(boolean a) {
		System.out.println(a);
	}

}
