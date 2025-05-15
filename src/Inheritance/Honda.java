package Inheritance;

public class Honda extends Bike {
	
	int mileage =60;
	
	String getColour() {
		return "Red";
		
	}

	public static void main(String[] args) {
		
		Honda obj = new Honda();
		obj.getColour();
		obj.applyBrake();
		boolean disc = obj.hasDisc();
		System.out.println(disc);
		obj.horn();
		obj.tyre();
		System.out.println(obj.mileage);
		

	}

}
