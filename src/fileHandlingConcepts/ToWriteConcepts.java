package fileHandlingConcepts;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ToWriteConcepts {

	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("Output1.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Hello Java");
			bw.newLine();
			bw.write("java");
			bw.close();
			System.out.println("Success");
		} catch (Exception e) {
			System.out.println("Not Success");
			e.printStackTrace();
			
		}
	}

}
