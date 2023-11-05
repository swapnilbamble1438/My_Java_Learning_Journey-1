package com;
//Accept two numbers and display maximum out of it
//conditional operator is ?:
//======================================================
class Aa21_Conditional_operator

{
    public static void main(String args[])
    {
	int maxno = 0;
	int no1 = Integer.parseInt(args[0]);
	int no2 = Integer.parseInt(args[1]);

      /* if(no1 > no2)
		maxno = no1;
	   else 
		 maxno = no2;

	*/

		maxno = no1 > no2 ? no1 : no2; // here if no1 is max than no2, than maxno is no1 
                                       // otherwise maxno is no2
		//  <condition>? <what if true>: <what if false>

		System.out.println("Maximum " + maxno);
    }
}