/*
Immutability means non-changeable
	OR
 The thing which cannot be change
 
 Immutability concept is used for "String Objects"
 i.e. String objects are immutable. It means once 
 String Object is created; its data or state can't
 be changed but a new String object is created.

E.g:
 if we create String 
String s = new String("hii");

so two object will be created in heap and SCP
memory.


 ________________________________________________________
|                                                        |
|         	        ___________________________      |
|   |             |    |   _____________________   |     |	      
|   |     s       |    |  |       hii           |  |     |
|   |    	  |    |  |                     |  |     |
|   |	          |    |  | String Pool (SCP)   |  |     |
|   |             |    |  |_____________________|  |     |
|   |	          |    |          hii              |     |
|   |             |    |                           |     |
|   |_____________|    |         Heap Memory       |     |
|    Stack Memory      |___________________________|     |
|        (LIFO)                                          |
|                                                        |
|                        JVM Memory                      |
|________________________________________________________|




if we do 
	s.concat(" bro");

so it will not change the existing String object
of hii in heap and also in SCP, But it will create new String object 
hii bro in heap and in SCP only if String hii bro is not exist already
in SCP

and when we print s we will not get hii bro
we will get hii only
	
	System.out.println(s);
	output: hii
	 
	Because s still is pointing to old String hii
	
	But if we do
	 s =  s.concat(" bro"); 	
	
	then s will point to the new String object with
	hii bro value
	and now if we print s
	
		System.out.println(s);
		output: hii bro
		
		so here we notice that the old string object hii
		is now of not any use but still it is
		present in our heap and SCP and consuming memory

 ________________________________________________________
|                                                        |
|         	        ___________________________      |
|   |	          |    |   _____________________   |     |	      
|   |     s       |    |  |       hii           |  |     |
|   |             |    |  |       hii bro       |  |     |
|   |    	  |    |  |                     |  |     |
|   |	          |    |  | String Pool (SCP)   |  |     |
|   |	          |    |  |_____________________|  |     |
|   |	          |    |          hii              |     |
|   |             |    |          hii bro          |     |
|   |_____________|    |        Heap Memory        |     |
|    Stack Memory      |___________________________|     |
|        (LIFO)                                          |
|                                                        |
|                        JVM Memory                      |
|________________________________________________________|


----------------------------------------------------------------

Now creating with literal 

	String s1 = "hii";
	
	now it will create String hii in SCP
	and thus one ojbect will be created
	
	and again if we create String with
	same value
	
	String s2 = "hii";
	String s3 = "hii";
	then it will not create String with hii
	in SCP because it is already exist in SCP
	and the s2 will refer to the existing
	String and no new String or object is
	created in SCP
	
	

	so here s1, s2,s3 both refers to the same
	String in SCP
	
	so less object means project will be fast
	
	
 ________________________________________________________
|                                                        |
|         	        ___________________________      |
|   |             |    |   _____________________   |     |	      
|   |     s1      |    |  |       hii           |  |     |
|   |     s2      |    |  |                     |  |     |
|   |	  s3      |    |  | String Pool (SCP)   |  |     |
|   |             |    |  |_____________________|  |     |
|   |	          |    |                           |     |
|   |             |    |                           |     |
|   |_____________|    |         Heap Memory       |     |
|    Stack Memory      |___________________________|     |
|        (LIFO)                                          |
|                                                        |
|                        JVM Memory                      |
|________________________________________________________|


if we change s3
	s3 = "hello";
		
		then it will not change the old String hii
		in SCP Because s1 and s2 are already
		refering to hii
		so here new String hello will be created
		in SCP only if hello is not already present
		in SCP
		and now s3 will point to new String object
		hello in SCP
		
 ________________________________________________________
|                                                        |
|         	        ___________________________      |
|   |             |    |   _____________________   |     |	      
|   |     s1      |    |  |       hii           |  |     |
|   |     s2      |    |  |       hello         |  |     |
|   |	  s3      |    |  | String Pool (SCP)   |  |     |
|   |             |    |  |_____________________|  |     |
|   |	          |    |                           |     |
|   |             |    |                           |     |
|   |_____________|    |         Heap Memory       |     |
|    Stack Memory      |___________________________|     |
|        (LIFO)                                          |
|                                                        |
|                        JVM Memory                      |
|________________________________________________________|


Q) Why String objects are immmutable in Java?
   String are Immutable in Java 
   Because String objects are cached in String pool.
   Since cached String literals are shared between
   multiple reference/variable e.g:s1,s2,s3 there is always a risk,
   where one variable action would affect all another 
   variable.
   For e.g: if one reference variable changes its value from
   "hii" to "hello", all other reference variables will
   also get affected
   ( so to not affect other reference variables
   String are immutable )


*/
package Strings;

public class A3_String_Immutability {

}
