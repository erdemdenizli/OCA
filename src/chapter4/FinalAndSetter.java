package chapter4;

public class FinalAndSetter {
	
	private final Object contents;

	protected Object getContents() {
		return contents;
	}
	
//	public FinalAndSetter(Integer i) { //final fields can be set in a constructor though
//		this.contents = i;
//	}

	protected void setContents(Object contents) { //final fields cannot have setters
		this.contents = contents;
	}

	public void showPresent() {
		System.out.print("Your gift: " + contents);
	}

	public static void main(String[] treats) {
		FinalAndSetter gift = new FinalAndSetter();
		//gift.setContents(gift);
		gift.showPresent();
	}
}
