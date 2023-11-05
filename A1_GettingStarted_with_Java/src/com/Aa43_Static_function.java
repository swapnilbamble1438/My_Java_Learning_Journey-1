package com;
/*
Static Function are called using class name.
for calling static function we dont need to create
an object of class

<class name>.<function name>(<values need to be passed>);
*/
class Static_pr
{
	public static int add(int x, int y)
	{
		int z = x + y;
		return z;
	}
}

class Static_program_43
{
	public static void main(String args[])
	{
		System.out.println("Addition " + Static_pr.add(55,76));
	}
}