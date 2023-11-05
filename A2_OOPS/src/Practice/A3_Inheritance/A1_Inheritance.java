package Practice.A3_Inheritance;

 class Vehicle {

	 protected String brand = "Ford";
	 public void honk()
	 {
		 System.out.println("Tuut, tuut!");
	 }
	
}
 
 class Car extends Vehicle{
	 
	 public String modelName = "Mustang";
	 
 }
 
 class A1_Inheritance extends Car{
	 public static void main(String args[])
	 {
		 
		 Vehicle vobj = new Vehicle();
		 
		 Car cobj = new Car();
		 
		 cobj.honk();
		 
		 System.out.println(cobj.brand +  " " + cobj.modelName);
		 
		 
	 }
 }
