package inheritance;

public class Shark extends Fish {
	private int numberOfFins = 8;
	protected int size;// if you declare one of the fields from the parent class in the child class,
						// that fields now are seperate, and parent one is called by parent reference,
						// and child one is called by child reference
	public int length=5;
	public int eyes;
	
	public String name = "Shark";

	public Shark(int age) {
		super(age);
		this.size = 4;
	}
	
	public static void go() {
		System.out.println("gooo");
	}
	
	public void method() {
		System.out.println("hello");
	}

	public void displaySharkDetails() {
		System.out.print("Shark with age: " + getAge());
		System.out.print(" and " + size + " meters long");
		System.out.println(" with " + numberOfFins + " fins");
	}

	public static void main(String[] args) {
		Fish fish = new Shark(-1);
		System.out.println(fish.size);
		System.out.println(fish.getAge());
		fish.displaySharkDetails();
		fish.go();
		System.out.println(fish.length);
		System.out.println(fish.name);//not visible because it is calling from parent class
	}
}
