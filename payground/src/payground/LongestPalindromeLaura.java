package payground;


public class LongestPalindromeLaura {
	public static String findLongestPalindrome(String word) {
		char[] charword = word.toCharArray();
		boolean itis = false;
		String end = "";
		for (int windowsize = charword.length; windowsize > 0; windowsize--) {
			char[] window = new char[windowsize];
			for (int swiper = 0; swiper < charword.length - window.length + 1; swiper++) {
				for (int fillup = 0; fillup < windowsize; fillup++) {
					window[fillup] = charword[fillup + swiper];
				}
				itis = true;
				for (int windowchecker = 0; windowchecker < window.length; windowchecker++) {
					int actbegin = windowchecker;
					int actend = window.length - windowchecker - 1;

					if (actend >= actbegin) {
						char actbeginletter = window[actbegin];
						char actendletter = window[actend];
						if (actbeginletter != actendletter)
							itis = false;
					}
				}

				if (itis) {
					end = String.valueOf(window);
					break;
				}
			}
		}

		return end;

	}

}
