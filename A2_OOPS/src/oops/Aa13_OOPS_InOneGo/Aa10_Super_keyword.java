/*

Super Keyword is a reference variable 
which is used to refer immediate parent 
class object

e.g:
class A
{

}
class B extends A
{
	super // refers to A class object
}

super keyword is a reference which refers
to the object of parent class


          this                    |       super
----------------------------------|------------------------------------- 
1. this keyword is the reference  |   1. super keyword is also the 
   variable that refers to the    |      reference variable that
   current class object or        |      refers to the parent class
   variable                       |      object
                                  |
                                  
    E.g:
    
    class A
    {
    	int a = 10;
    }
    class B extends A
    {
    	int a = 20;
    
    	void show(int a)
    	{
    		System.out.println(a);
    		System.out.println(this.a):
    		System.out.println(super.a); //
    	}
    	
    		
        public static void main(String[] args)
        {
        
        	B objb = new B();
        	objb.show(30);	
        		 		
    	}	
    }
	
	output: 30
		20
		10
	








*/
package oops.Aa13_OOPS_InOneGo;

public class Aa10_Super_keyword {

}
