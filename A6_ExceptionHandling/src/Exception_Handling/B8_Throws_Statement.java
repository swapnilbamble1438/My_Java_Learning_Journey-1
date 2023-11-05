package Exception_Handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B8_Throws_Statement {
	
	public static void main(String[] args) throws IOException {
		
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(isr);
		
		String s = br.readLine();
		
		System.out.println(s);
		
		
	}

}
