package inheritance;

class Fish {
	protected int size = 1;
	private int age;
	public int length=1000;
	
	private String name = "Fish"; //if you call this, this would only be accessible within this class and
								  // if you are able to call it, it will be call depending on the reference type
	public Fish(int age) {		  //because it has a duplicate in the Shark class (child class)
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	
	public static void go() {
		System.out.println("stoooop");
	}
	
	public void displaySharkDetails() {
		System.out.print("Shark with age: " + getAge());
		System.out.println(" and " + size + " meters long");
		//System.out.print(" with " + numberOfFins + " fins");
	}
	
	public static void main(String[] args) {
		Shark fish = new Shark(-1);//as long as the constructor is Shark, Shark methods are being called
		System.out.println(fish.size);// but static methods are coming regarding the reference type.
		System.out.println(fish.getAge());// so if reference is Fish, go method from Fish class is coming
		fish.displaySharkDetails();//if reference is Shark, go method from Shark is coming
		fish.go();
		//fish.method();//cannot access Shark methods
		//System.out.println(fish.eyes);//cannot access Shark fields
		Shark fish2 = (Shark) fish;//casting back to Fish reference, opposite wouldn't work, object created by
		fish2.method();//using Shark constructor wouldn't be casted to Fish reference!
		System.out.println(fish.name);
	}

}
