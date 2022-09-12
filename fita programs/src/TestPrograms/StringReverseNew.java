package TestPrograms;

public class StringReverseNew {

	public static void main(String[] args) {
		String str = "JAVA CODING";
		char[] charArray = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = charArray.length - 1; i >= 0; i--) {
			sb.append(charArray[i]);
		}
		System.out.println("Reversed String:" + sb.toString());
	}

}
