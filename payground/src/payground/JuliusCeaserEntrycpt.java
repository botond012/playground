package payground;


public class JuliusCeaserEntrycpt {

	public static String decode(String code) {
		char[] ch = code.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			{
				if (ch[i] >= 'u')
					ch[i] -= 'z'-'a'+1;
				ch[i] += 5;
			}
		}

		String codeS = new String(ch);
		return codeS;

	}

}
