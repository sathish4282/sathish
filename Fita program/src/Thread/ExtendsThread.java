package Thread;

public class ExtendsThread extends Thread {

	public static void main(String[] args) {
		ExtendsThread mul = new ExtendsThread();
		ExtendsThread mul1 = new ExtendsThread();
		mul.start();
		mul1.start();
	}
	
	public void run() {
		System.out.println("Running");

	}

}
