public class AlphabetCalculator {

	public static void main(String[] args) {

		String s = "Hello Mummy";
		s = s.replaceAll("\\s", "");

		int[] counts = new int[150];

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
		    counts[ch]++;
		}

		for (int i = 0; i < counts.length; i++) {
		     if (counts[i] > 0) {
		     System.out.println((char) i + "-" + counts[i]);
		     }
		}
	}
}