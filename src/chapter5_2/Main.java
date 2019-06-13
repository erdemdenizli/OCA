package chapter5_2;

public class Main {

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.actionAnimal(); //In this example, the moveLegs() method is overridden, not hidden, in the child class.
		dog1.actionDog();	 //Therefore, it is replaced at runtime in the parent class with the call to the child class’s method.
		
		
//At runtime the child version of an overridden method is always executed for an instance regardless of
//whether the method call is defined in a parent or child class method. In this manner, the parent method is 
//never used unless an explicit call to the parent method is referenced, using the syntax ParentClassName.method().
//Alternatively, at runtime the parent version of a hidden method is always executed if the call to the method is 
//defined in the parent class. 
		
		
		Animal dog2 = new Dog();
		dog2.actionAnimal();
//		//dog2.actionDog();

	}

}
