package Practice.A4_Polymorphism;

class Animal {

	public void animalSound()
	{
		System.out.println("The animal makes a sound");
	}
	
}

class Pig extends Animal {
	
	public void animalSound() {
	System.out.println("The pig says: wee wee");
	}
	
}

class Dog extends Animal {
	
	public void animalSound() {
		System.out.println("The dog says: bow bow");
	}
}

public class A1_Polymorphism {
	public static void main(String args[])
	{
		Animal animalobj = new Animal();
		Animal pigobj = new Pig();
		Animal dogobj = new Dog();
		
		animalobj.animalSound();
		pigobj.animalSound();
		dogobj.animalSound();
		
	}
}

