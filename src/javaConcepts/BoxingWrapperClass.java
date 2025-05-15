package javaConcepts;

public class BoxingWrapperClass {

	public static void main(String[] args) {
		int i= 10;//primitive
		Integer j =20;
		Integer obj = new Integer(i); //object //Boxing
		Integer obj1 =i; //auto -boxing
		System.out.println(obj);
		System.out.println(obj1);
		System.out.println(j.intValue()); //unboxing
		int a=obj;
		System.out.println(a);//auto -unboxing
		
		double d=7.78;
		Double dd =d;
		System.out.println(dd);
		
		
		

	}

}
