package payground;


import java.util.Scanner;


public class Xml1 {
	public static void get(Scanner in) {

		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String line = in.nextLine();
			String starter = "", ended = "";
			String text = "";
			int textcounter = 0;
			boolean isHave = false;

			for (int start = 0; start < line.length() - 1; start++) {
				if ((line.charAt(start) == '<') && (line.charAt(start + 1) != '/')) {
					for (int end = start; end < line.length(); end++) {
						starter = starter + line.charAt(end);
						if ((line.charAt(end) == '>')) {
							for (int i = end; i < line.length() - 1; i++) {
								textcounter = 0;
								if ((line.charAt(i + 1) == '<')) {
									textcounter = i + 1;
									break;
								}
								if ((line.charAt(i + 1) != '<')
										&& (line.charAt(i + 1) != '>'))
									text = text + line.charAt(i + 1);
							}
							for (int i = textcounter; i < line.length(); i++) {
								ended = ended + line.charAt(i);
								if ((line.charAt(i) == '>'))
									break;
							}
							if (ended.length() > 1)
								ended = ended.substring(0, 1) + ended.substring(2, ended.length());
							if (ended.equals(starter) && text.length() != 0 && starter.length() > 2) {
								isHave = true;
								System.out.println(text);
							}
							starter = "";
							ended = "";
							text = "";

							break;
						}

					}

				}
			}
			if (!isHave)
				System.out.println("None");

			testCases--;
		}
	}
}
