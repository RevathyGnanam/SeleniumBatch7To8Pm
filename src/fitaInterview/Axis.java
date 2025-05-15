package fitaInterview;

public class Axis implements RBI {
	
	public void interestLoan() {
		//RBI.amount =1;
		System.out.println("Interest loan");
	}

	@Override
	public void aadharCardMandatory() {
		System.out.println("aadharCardMandatory");
		
	}

	@Override
	public boolean panCardMandatory() {
		System.out.println("panCardMandatory");
		return true;
	}

}
