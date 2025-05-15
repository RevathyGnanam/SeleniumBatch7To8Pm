package interfaceConcepts;

public class Customer {

	public static void main(String[] args) {
		IciciBank mybank = new IciciBank();
		mybank.aadharCardMandatory();
		mybank.aadharCardMandatory(true);
		boolean pancard = mybank.panCardMandatory();
		System.out.println("pan card is attached "+ pancard);
		mybank.jewelLoan();
		System.out.println(IciciBank.gpayLimit);
//		RBI rbi = new IciciBank();
//		rbi.aadharCardMandatory();
//		rbi.panCardMandatory();

	}

}
