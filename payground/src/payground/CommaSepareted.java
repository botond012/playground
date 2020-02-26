package payground;

import java.util.List;
import java.util.stream.Collectors;

public class CommaSepareted {

	public static String getString(List<Integer> list) {
		String str = list.stream()
				.map(i -> i%2!=0 ? "o"+i: "e"+i)
				.collect(Collectors.joining(","));
		return str;
	}
}
