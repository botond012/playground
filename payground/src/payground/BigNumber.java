package payground;


public class BigNumber {
	public static String[] getBigNumbers(String[] s) {
		//BUBORÉK RENDEZÉS
		for (int i = s.length; i >=0; i--) {
			for (int j = 0; j < s.length - 1; j++) {
				Double egy = Double.parseDouble(s[j]), ketto = Double.parseDouble(s[j + 1]);
				if (egy < ketto) {
					String tmp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = tmp;
				}

			}
		}

		// Output
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

		return s;
	}

}
