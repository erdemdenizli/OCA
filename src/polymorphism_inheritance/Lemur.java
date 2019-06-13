package polymorphism_inheritance;

public class Lemur extends Primate implements HasTail {
	
	public boolean isTailStriped() {
		return true;
	}
	public void method() {
		System.out.println("heeeyyy");
	}

	public int age = 10;

	public static void main(String[] args) {
		
		Lemur lemur = new Lemur();
		Lemur lemur1 = new Primate();
		
		lemur.method();
		System.out.println(lemur.age);
		System.out.println(lemur.isTailStriped());
		
		HasTail hasTail = lemur;
		hasTail.method();
		System.out.println(hasTail.age);
		System.out.println(hasTail.isTailStriped());
		
		Primate primate = lemur;
		primate.method();
		System.out.println(primate.age);
		System.out.println(primate.hasHair());
		
	}
}
