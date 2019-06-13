package polymorphism_inheritance;

public interface HasTail {
	
	static void add() {
		
	}
	default void remove() {
		isTailStriped();
	}
	
	public boolean isTailStriped();
	
}
