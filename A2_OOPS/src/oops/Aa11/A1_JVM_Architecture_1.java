/*
 
 * When we write a program we save the program with .java extension
*Basically, javac is the compiler that compiles the java code.
 javac compiler compiles the java code into Bytecode. which is also a .class file
* Now JVM which is an interpreter that executes the byte code into
  machine code
* and thus the user gets desired output
 
     .java 
        |
        |  
     .class (bytecode)
        |
        |
        |
        |
  ______|_________________________________________________________________      
 |      |________________________                                         |                    |  
 |                         ______|_______                                 |
 |                        | Class Loader |                                |
 |                        |______________|                                |
 |                               |                 Memory Areas           | 
 |     __________________________|______________________________          |             
 |    |   ________   ______   _______   __________   ________   |         |     
 |    |  | Method | | Heap | | Stack | |    PC    | | Native |  |         |
 |    |  |  Area  | | Area | | Area  | | Register | | Method |  |         |
 |    |  |________| |______| |_______| |__________| |  Area  |  |         | 
 |    |                                             |________|  |         |
 |    |_________________________________________________________|         |
 |          |                                                             |
 |      ____|______          _________________         _______________    |
 |     | Execution |------->|   Java Native   |------>| Native Method |   |
 |     |  Engine   |        | Interface (JNI) |       |   Libraries   |   |
 |     |___________|<-------|_________________|<------|_______________|   |
 |                                                                        |
 |________________________________________________________________________|
       
       
      1) Class Loader:
         .class file goes inside Class Loader which have some properties
          and components.
          properties like Loading, Linking, Initialization.
          
      2)  Method area: 
          Class level related data:
          Then this class loader by its property allocates memory
		  to class level data in Method Area of Memory Areas.
		  class leve data  like fully qualified class name,
		  fully qualified parent class, static variable,
		  static block are store in Method Area.
		  
	  3)  Heap:
	      Objects (with data):
	      then object or object created by user will store
	      in  the Heap Area.
	      Object also contains collection, array etc. 
	      Instance variable will also stored in heap memory.
       
      4) Stack
         For local methods and Object references:
         local variables and operands are store method
         wise in Stack
         
      5) PC Registers:
         List of instructions:
         Instructions are stored in PC Registers
      	 Instructions like which step is to be execute
      	 next or which next step or instruction
      	 is to be follow
      	 
      6) Native Method Area:
         System methods (dll, so inclusions) are stored
         in Native Method Area.
       
      7) Execution Engine: 
          Execution Engine is responsible to execute
      	  java class file.
      8) Java Native Interface
      9) Native Method Libraries
      10) Execution Engine:
      	        
       
        
        
*/


package oops.Aa11;

public class A1_JVM_Architecture_1 {

}
