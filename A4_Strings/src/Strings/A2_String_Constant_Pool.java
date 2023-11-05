/*
 
 
 (String or String object is same)
 
  String Constant Pool
  or  String Literal Pool is an area in heap
  memory where java stores String literal values.

  String Constant Pool is present in Heap Area  

  1) Creating String using new keyword

String s1 = new String("Hii");

Jvm has two memory parts
   
a) Stack memory is used for execution of program - 
   contains local or   reference variable
b) Heap Memory for storage - contain instance variable
  Inside Heap memory there is String Constant Pool (SCP)

 when creating String using new keyword
 Jvm will create the new object of this String in Heap Memory
 and the one String object in string constant pool
only if the String with same String object is not existed already in SCP.
 then it will create the reference variable inside stack memory
 for execution. 
so while execution reference variable will point to the heap memory
object and the heap memory object will point to the SCP 
for getting the String value

so here the question will rise that how many object of a String
created will be created
so there will be two object of String created one in heap memory
and other in SCP

 ________________________________________________________
|                                                        |
|         		    ___________________________  |
|	|             |	   |   _____________________   | |	      
|	|     s1      |	   |  |       hii           |  | |
|	|    	      |	   |  |                     |  | |
|	|	      |	   |  | String Pool (SCP)   |  | |
|	|             |    |  |_____________________|  | |
|	|	      |	   |          hii              | |
|	|             |    |                           | |
|       |_____________|    |         Heap Memory       | |
|	 Stack Memory      |___________________________| |
|        (LIFO)                                          |
|                                                        |
|                        JVM Memory                      |
|________________________________________________________|


and again if the new String using new keyword
with same value is created

String s2 = new String("hii");

so here the new variable will be created and the new object 
will also be created in the Heap Memory but it will check
in SCP if the same String object is already existing or not if it
exist then it will not create String object in SCP 
and its object in heap memory will point to the existing
value of String in SCP

so in this case 1 object is created in heap memory

 ________________________________________________________
|                                                        |
|         		    ___________________________  |
|	|	      |	   |   _____________________   | |	      
|	|     s1      |	   |  |       hii           |  | |
|       |     s2      |    |  |                     |  | |
|	|    	      |	   |  |                     |  | |
|	|	      |	   |  | String Pool (SCP)   |  | |
|	|	      |    |  |_____________________|  | |
|	|	      |	   |          hii              | |
|	|             |    |          hii              | |
|       |_____________|    |        Heap Memory        | |
|	 Stack Memory      |___________________________| |
|        (LIFO)                                          |
|                                                        |
|                        JVM Memory                      |
|________________________________________________________|




-------------------------------------------------------------------------

2) Creating String using String literal

	String s3 = "hello";

 creating String using String literal will directly create String Object
 in SCP and reference variable will be created in stack memory also.
 so here only one object will be created of String in SCP.

 ________________________________________________________
|                                                        |
|         	            ___________________________  |
|	|	      |	   |   _____________________   | |	      
|	|     s1      |	   |  |       hii           |  | |
|       |     s2      |    |  |      hello          |  | |
|	|     s3      |	   |  |                     |  | |
|	|	      |	   |  | String Pool (SCP)   |  | |
|	|	      |    |  |_____________________|  | |
|	|	      |	   |          hii              | |
|	|             |    |          hii              | |
|       |_____________|    |        Heap Memory        | |
|	 Stack Memory      |___________________________| |
|        (LIFO)                                          |
|                                                        |
|                        JVM Memory                      |
|________________________________________________________|


and if another String created using String literal
having same value
	
	String s4 = "hello";

so here new reference will be created in stack memory
and it will check if the same String is already present 
or not in SCP if it is present then it will not create new String 
in SCP and its reference which is created will point to the 
existing String value

so in this case zero no. of objects are created

 ________________________________________________________
|                                                        |
|         		    ___________________________  |
|	|	      |    |   _____________________   | |	      
|	|     s1      |	   |  |       hii           |  | |
|       |     s2      |    |  |      hello          |  | |
|	|     s3      |    |  |                     |  | |
|	|     s4      |	   |  | String Pool (SCP)   |  | |
|	|	      |    |  |_____________________|  | |
|	|	      |	   |          hii              | |
|	|             |    |          hii              | |
|       |_____________|    |         Heap Memory       | |
|	 Stack Memory      |___________________________| |
|        (LIFO)                                          |
|                                                        |
|                        JVM Memory                      |
|________________________________________________________|

-------------------------------------------------------------------------

Now creating String using literal

String s5 = "hii";

reference variable will be created in Stack memory and it will check 
if the same value of String is already present or not in SCP 
if it is present then it will not create new String in SCP 
and its reference which is created will point to the existing 
String Object

so here it has created Zero object



 ________________________________________________________
|                                                        |
|         	            ___________________________  |
|	|	      |	   |   _____________________   | |	      
|	|     s1      |	   |  |       hii           |  | |
|       |     s2      |    |  |      hello          |  | |
|	|     s3      |    |  |                     |  | |
|	|     s4      |	   |  | String Pool (SCP)   |  | |
|	|     s5      |    |  |_____________________|  | |
|	|	      |	   |          hii              | |
|	|             |    |          hii              | |
|       |_____________|    |         Heap Memory       | |
|	 Stack Memory      |___________________________| |
|        (LIFO)                                          |
|                                                        |
|                        JVM Memory                      |
|________________________________________________________|


=========================================================================
                          
							No. Of Objects Created

String s1 = new String("hii");                  2

String s2 = new String("hii");                  1

String s3 = "hello";                            0

String s4 = "hello";                            1 

String s5 = "hii";					0

Q) What is the difference between creating string using literal and new keyword?

When we create a String object using the new() keyword, it always creates a 
new object in heap memory and then in SCP. On the other hand, if we create an object using 
String using literal, it directly create String in SCP


Note: The String objects present in SCP are not applicable
      for Garbage Collection. Because a reference variable
      internally is maintained by JVM.



*/





package Strings;

public class A2_String_Constant_Pool {

}
