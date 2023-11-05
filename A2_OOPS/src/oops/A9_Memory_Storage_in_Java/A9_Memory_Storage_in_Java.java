/*
 
 
 class Test
 {
 
 	int a = 10;
 	Static int b = 20;
 	
 	void show()
 	{
 		int c = 30;
 		// other statements
 	}
 	
 	public static void main(String args[])
 	{
 		Test t = new Test();
 		t.show();
 	
 	}
 	
}

 * int a = 10 (instance variable): 
 	  It will store in Heap Area
 	  
 * static int b = 20 (static variable):
      It will store in Method Area
      
 * int c = 30 (local variable): 
     It will store in Stack Area
 
 * main():      
 	 It will store in Stack Area
 		
 * Test t = new Test() (Object):
     It will store in Heap Area
     
 * t.show() (current running method):
     It will store in Stack Area     
 
 
 
 
 
                      ______________
                     | Class Loader |
                     |______________|
                            |                 Memory Areas
  __________________________|______________________________                       
 |   ________   ______   _______   __________   ________   |              
 |  | Method | | Heap | | Stack | |    PC    | | Native |  |
 |  |  Area  | | Area | | Area  | | Register | | Method |  |      
 |  |________| |______| |_______| |__________| |  Area  |  |
 |                                             |________|  | 
 |_________________________________________________________|
       |  
   ____|______          _________________         _______________
  | Execution |------->|   Java Native   |       | Native Method |
  |  Engine   |        | Interface (JNI) |<------|   Libraries   |
  |___________|<-------|_________________|       |_______________|



 */



package oops.A9_Memory_Storage_in_Java;

public class A9_Memory_Storage_in_Java {

}
