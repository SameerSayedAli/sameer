public class StringClass {
	public static void main(String args[]) {
		StringBuffer str1 = new StringBuffer("madaam");
		StringBuffer str3 = new StringBuffer(str1);
		System.out.println(str1);
		StringBuffer str2 = new StringBuffer(str1.reverse());
		System.out.println(str2);
		str1.reverse();

		String ab = str1.toString();
		if (ab.contentEquals(str3))

			System.out.println("It is palindrome");
		else {
			System.out.println("Its not palindrome");
		}

	}
}
