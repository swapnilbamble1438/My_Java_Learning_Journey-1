package com;
class Complexx
{
	int x,y;
	Complexx(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	void show()
	{
		System.out.println(this.x + "and" + this.y);
	}
	
	static Complexx add(Complexx n1, Complexx n2)
	{
		Complexx p1 = new Complexx(0,0);
		p1.x= n1.x + n2.x;
		p1.y = n1.y + n2.y;
		return p1;
	}

	
	public static void main(String args[])
	{
		Complexx c1 = new Complexx(4,5);	
		
		System.out.println("first :");
		c1.show();
		
		Complexx c2 =new Complexx(7,8);
		System.out.println("second : ");
		c2.show();
		
		Complexx p1 = add(c1,c2);
		System.out.println("add is ");
		p1.show();
		
		
		}
}