package payground;


public class LongestCommonSequence {

	public static String findLongestCommonSequence(String s1, String s2) {

		char charwordbig[] = s1.length() >= s2.length() ? s1.toCharArray() : s2.toCharArray();
		char charwordsmall[] = s1.length() < s2.length() ? s1.toCharArray() : s2.toCharArray();
		String end = "";
		for (int windowsize = charwordsmall.length; windowsize > 0; windowsize--) {
			char[] window = new char[windowsize];
			for (int fillup = 0; fillup < windowsize; fillup++) {
				window[fillup] = charwordsmall[fillup];
			}
			String swindows = String.valueOf(window);
			String swordbig = String.valueOf(charwordbig);
			if (swordbig.contains(swindows)) {
				end = swindows;
				break;
			}

		}
		return end;
	}


	public static String finsdLongestCommonSequence(String s1, String s2) {
		String result = "";
		for (int length = s1.length(); length > 0; length--) {
			int startIndex = 0;
			while (startIndex + length <= s1.length()) {
				String current = s1.substring(startIndex, startIndex + length);
				if (s2.contains(current)) {
					result = current;
					break;
				}
				startIndex++;
			}
			if (result.length() != 0) {
				break;
			}
		}
		return result;
	}
}