public class StringClass3 {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("This is a StringBuffer");
		s1.append(" This is a sample program");
		System.out.println(s1);
		s1.reverse();
		System.out.println(s1);
		String str = s1.toString();
		StringBuilder s2 = new StringBuilder(str);
		System.out.println("Using string Builder " + s2);

	}

}
