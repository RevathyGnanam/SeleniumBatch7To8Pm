package fitaInterview;

public class Customer {

	public static void main(String[] args) {
		Axis mybank = new Axis();
		mybank.aadharCardMandatory();
		boolean pancard = mybank.panCardMandatory();
		System.out.println(pancard);
		mybank.interestLoan();
		System.out.println(Axis.amount);
		

	}

}
