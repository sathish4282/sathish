package Variables;

public class LocalVariable {

	public static void main(String[] args) {
		LocalVariable loc = new LocalVariable();
		int num = loc.display();
		int mark = 35;
		System.out.println(mark);
	}
	
	 protected int displayProtected() {
		int value = 100;
		System.out.println(value);
		return value;
	}
	 
	  public int display() {
			int value = 100;
			System.out.println(value);
			return value;

	}

}
