package chapter5_2;

public class Dog extends Animal {
	
	public Dog() {
		this();
	}
	
    public String moveLegs() {
        return "Dog move";
    }

    public void actionDog() {
        System.out.println("dog " + moveLegs());
    }

}
