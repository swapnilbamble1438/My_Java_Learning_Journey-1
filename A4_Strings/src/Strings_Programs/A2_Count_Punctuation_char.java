package Strings_Programs;

public class A2_Count_Punctuation_char {

	public static void main(String args[])
	{
		String str = "He said, 'The mailman loves you.' I heard it with my own ears.";
	
		int count = 0;
		
		for(int i = 0 ; i < str.length(); i ++)
		{
			if(str.charAt(i) == '!' || str.charAt(i) == ',' || 
			str.charAt(i) == ';'  || str.charAt(i) == '.'   || 
			str.charAt(i) == '?'  || str.charAt(i) == '-'   ||
			str.charAt(i) == '\'' || str.charAt(i) == '\"'  || 
			str.charAt(i) == ':') 
				count ++;
		}
		System.out.println("Total number of punctuations are: " + count);
	
	
	
	
	
	}
}
