package payground;


import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Regex2 {
	public static void deleteDuplicate(String in) {
		// String input = "The string the String string stringing.";
		// String regex = "\\b(\\w+)(\\s+\\1\\b)+";
		// // Use compile(regex) if you want case sensitive.
		// Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		// Matcher m = p.matcher(input);
		// while (m.find()) {
		// String find=m.group();
		// String find1=m.group(1);
		// input = input.replaceAll(m.group(), m.group(1));
		// }
		// System.out.println(input);

		String s = in;// scan.nextLine();

		String[] arrOfStr = s.split("[?!,_.@]|[ ]");
		
		int i = 0;
		for (String a : arrOfStr) {
			if (!a.contentEquals("")) {

				i++;
			}
		}
		String[] arrOfStrWithoutSpaces = new String [i];
		i=0;
		for (String a : arrOfStr) {
			if (!a.contentEquals("")) {
				arrOfStrWithoutSpaces [i]=a;
				i++;
			}
		}
		System.out.println(arrOfStrWithoutSpaces.length);
		for (String a : arrOfStrWithoutSpaces) {
			System.out.println(a);
		}

	}
}
