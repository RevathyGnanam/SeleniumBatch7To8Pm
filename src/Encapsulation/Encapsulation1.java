package Encapsulation;

public class Encapsulation1 {

	public static void main(String[] args) {
		EncapsulationConcept obj = new EncapsulationConcept();
		

		obj.setAccount_no(73648736873L);
		
		System.out.println(obj.getAccount_no());
		obj.setEmail("abc@ust.com");
		System.out.println(obj.getEmail());
		
		obj.setFeesamount(23638.98f);
		System.out.println(obj.getFeesamount());
		
		obj.setName("Revaathy");
		System.out.println(obj.getName());

	}

}
