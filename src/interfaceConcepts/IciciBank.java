package interfaceConcepts;

public class IciciBank implements RBI{
	
	public void jewelLoan() {
		
		System.out.println("jewel Loan is credited");
		
	}

	
	public void aadharCardMandatory() {
		System.out.println("submit aadhar card");
		
	}

	@Override
	public boolean panCardMandatory() {
		System.out.println("submit pan card");
		return true;
	}


	@Override
	public void aadharCardMandatory(boolean a) {
		System.out.println("submit aadhar card1");
		
	}
	
	

}
