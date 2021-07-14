package Assingments;

public class Stringbuff_SolvPalindrome {

	public static void main(String[] args) {
		String name="anna";
		StringBuffer buff=new StringBuffer(name);
		String revrs=buff.reverse().toString();
		if(name.equals(revrs))
			System.out.println("name is palindrome");
		else
			System.out.println("name is not palindrome");

	}

}
