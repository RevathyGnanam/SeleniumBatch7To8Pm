package fileHandlingConcepts;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ToReadFile {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("Output.txt");
			BufferedReader br =  new BufferedReader(fr);
			String line =br.readLine();
			while(line!=null) {
				System.out.println(line);
				line =br.readLine();
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
