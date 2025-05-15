package javaBasicPrograms;

public class javaPrograms {

	public static void main(String[] args) {


		//print the numbers
		for(int i=0;i<=10;i++) {
			System.out.println("Print 1 to 10:" +i);
		}

		int w=0;
		while(w<=10) {
			System.out.println("Print 1 to 10:" +w);
			w++;
		}

		//even number
		//		% -reminder
		//		/-Quotient

		int a = 11;
		if(a%2==0) {
			System.out.println("this is even number");
		}
		else {
			System.out.println("This is not even number");
		}

		//odd number
		if(a%2==1) {
			System.out.println("this is odd number");
		}

		//print the even number count from 1 to 100
		int evencount=0;
		for(int j=0;j<=100;j++) {
			if(j%2==0) {
				System.out.println("Count the even number" +j);
				evencount++;
			}

		}
		System.out.println(evencount);
		//print the odd number count from 1 to 100
		int oddcount=0;
		for(int j=0;j<=100;j++) {
			if(j%2==1) {
				//System.out.println("Count the odd number" +j);
				oddcount++;
			}

		}
		System.out.println(oddcount);

		//print the even and odd sum
		int oddsum=0;
		int evensum=0;
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
				evensum=evensum+i;
				System.out.println("Print even sum from 1 to 10"+evensum);
			}
			else {
				oddsum= oddsum+i;
				System.out.println("Print odd sum from 1 to 10"+oddsum);

			}

		}

		//reverse the number //palindrome 121 131 141
		int rev =123;  //10 power 2 10 power 1 10 power 0
		int temp =rev;
		int getReminder=0,finalStoringValue=0;

		while(rev>0) {
			getReminder = rev%10; //123%10 =3  //12%10 =2  //1%10 =1 to get reminder 321
			finalStoringValue =(finalStoringValue*10)+getReminder; //0*10+3= 3  //3*10+2 =32  //32*10+1 =320+1 =321
			rev=rev/10; //to remove decimal

		}

		System.out.println("Before reverse:"+ temp);
		System.out.println("After reverse:"+ finalStoringValue);

		//Factorial
		//5! = 5*4*3*2*1 =120

		int fact =1;
		for(int i=1;i<=5;i++) {
			fact=fact*i;
		}
		System.out.println(fact);

		//fibonacci series

		//f1 f2 f3
		//0  1  1  2  3  5  8 = 13
		//   f1 f2 f3
		//       f1 f2
		int f1=0;
		int f2=1;
		System.out.println(f1+" ");
		System.out.println(f2+" ");
		for(int i=0;i<=5;i++) {
			if(f1==5)
				break;
			int f3 = f1+f2;
			System.out.println(f3+" ");
			f1=f2;
			f2=f3;
			
		}
		
		// Armstrong 
		//370 =  3^3 =27 7^3 = 370
		
		int arms =153;
		int temp1 =arms;
		int getReminder1=0,finalStoringValue1=0;
		while(arms>0) {
			
			getReminder1 = arms%10;
			finalStoringValue1 =(getReminder1*getReminder1*getReminder1)+finalStoringValue1; 
			arms=arms/10; //to remove decimal
			
		}
		System.out.println(finalStoringValue1);
		System.out.println(temp1);
		
		//Swapping the values
		//With using 3rd variable
		int x=10;
		int y=20;
		System.out.println("Before Swapping: x="+x+" y="+y);
		int z;
		z=x; //10
		x=y;//20
		y=z;//10
		System.out.println("After Swapping: x="+x+" y="+y);
		
		//Without using 3rd variable
		int x1=10;
		int y1=20;
		System.out.println("Before Swapping: x1="+x1+" y1="+y1);
		
		x1 = x1+y1; //30
		y1= x1-y1;//10
		x1=x1-y1;//20
		System.out.println("After Swapping: x1="+x1+" y1="+y1);
		
		
	

	}

}
