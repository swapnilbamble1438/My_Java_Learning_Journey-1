package com;
/*
	Multi-level Inheritance
	In Multi-level Inheritance, a class is derived from a class which is also 
	derived from another class is called multi-level inheritance. In simple
	words we can say that a class has more than one parent class is called
	multi-level inheritance. 
 
 */


class Students
{
	int reg_no;
	void getReg_no(int rgno)
	{
		reg_no = rgno;
		
	}
	void putReg_no()
	{
		System.out.println("Registration Number: " + reg_no);
	}
}

class Marks extends Students
{
	int marks;
	void getMarks(int mks)
	{
		marks = mks;
	}
	void putMarks()
	{
		System.out.println("Marks: " + marks);
	}
}

class Sports extends Marks
{
	int score;
	void getScore(int scr)
	{
		score = scr;
	}
	void putScore()
	{
		System.out.println("score: " + score);
	}
	
}

public class Aa58_Multilevel_Inheritance 
{
	public static void main(String args[])
	{
		Sports ob = new Sports();
		
		ob.getReg_no(1234);
		ob.putReg_no();
		
		ob.getMarks(80);
		ob.putMarks();
		
		ob.getScore(74);
		ob.putScore();
		
	}
}
