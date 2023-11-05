package com;
/*
Q) Design a class name ShowRoom with the following description:
   instance variable/Data members:
   String name - To store the name of the customer
   long mobno - To store the mobile number of the customer
   double cost - To store the cost of the items purchased
   double dis - To store the discount amount
   double amount - To store the amount to be paid after discount
   Member methods -
   ShowRoom() - default constructor to initialize data members
   void input() - To input customer name,mobile number,cost
   void calculate() - To calculate discount on the cost of
   					  purchased items,based on following criteria
   					  
         Cost 					         Discount(in percentage)
         
   Less than or equal to Rs. 10000                5%
   
   More than Rs. 10000 and                        10%
   less than or equal to Rs. 20000		  
   
   More than Rs. 20000 and                        15%
   less than or equal to Rs. 35000              
   
   More than Rs. 35000                            20%
   
   void display()- To display customer name, mobile number, amount to be 
                   paid after discount
   Write a main method to create an object of the class and call the above
   member methods.
 
 ===========================================================================*/
public class Aa69_Q_ShowRoom 
{
	String name;
	long mobno;
	double cost;
	double dis;
	double amount;
	
	Aa69_Q_ShowRoom()
	{
		name = "Swapnil";
		mobno = 12345678;
		cost = 40000;
		dis = 0;
		amount = 0;
	}
	void input(String name,long mobno, double cost, double dis,double amount)
	{
		this.name = name;
		this.mobno =mobno;
		this.cost = cost;
		this.dis= dis;
		this.amount=amount;
	}
	 void calculate()
	    {
	    	if (cost <=10000)
	    	{
	    		dis = 0.05;
	    		amount = cost -  cost * dis;
	    	}
	    	else if(cost > 10000 || cost <= 20000)
	    	{
	    		dis = 0.10;
	    		amount = cost - cost * dis;
	    	}
	    	else if(cost > 20000 || cost <= 35000)
	    	{
	    		dis = 0.15;
	    		amount = cost - cost * dis;
	    	}
	    	else if(cost > 35000)
	    	{
	    		dis = 0.20;
	    		amount = cost - cost * dis;
	    	}
	    }
    void display()
    {
    	System.out.println("Customer Name: " + name);
    	System.out.println("Mobile No.: " + mobno);
    	System.out.println("Amount to be paid after discount: " + amount);
    }
    
    public static void main(String args[])
    {
    	Aa69_Q_ShowRoom q1 = new Aa69_Q_ShowRoom();
    	q1.calculate();
    	q1.display();
    }
}
