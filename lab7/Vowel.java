public class VowelsAndCon {

	public static void main(String[] args) {

		String s = "He said, 'The smallest dog barks the loudest.' I heard it with my own ears.";
		int vowel = 0;
		int cons = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				vowel++;

			}
			if (s.charAt(i) != 'a' || s.charAt(i) != 'e' || s.charAt(i) != 'i' || s.charAt(i) != 'o'
					|| s.charAt(i) != 'u') {
				cons++;
			}

		}
		System.out.println("The number of vowels exists in the string is: " + vowel + " and consonants are" + cons);

	}

}
