package TestPrograms;

public class PalindromeProgram {

	public static void main(String[] args) {
		String name="madam";
		for(int i=name.length()-1;i>=0;i--){
			name=name+name.charAt(i);
		}
		System.out.println(name);
		if(name.equals(name))
			System.out.println("true");
		else System.out.println("false");

	}

}
