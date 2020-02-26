package payground;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class ArrayListHacker {
	static public void getfunction(Scanner in) {
		Scanner sc = in;
		int n = Integer.parseInt(sc.nextLine());
		List<Integer> list = new LinkedList<Integer>();
		String[] arr = sc.nextLine().split(" ");
		for (int i = 0; i < arr.length; i++) {
			list.add(Integer.parseInt(arr[i]));
		}

		int q = Integer.parseInt(sc.nextLine());
		while (q > 0) {
			String command = sc.nextLine();
			String[] arrq = sc.nextLine().split(" ");
			if (command.equalsIgnoreCase("insert")) {
				list.add(Integer.parseInt(arrq[0]), Integer.parseInt(arrq[1]));
			}
			if (command.equalsIgnoreCase("delete")) {
				list.remove(Integer.parseInt(arrq[0]));
			}

			q--;
		}
		for (int i : list) {
			System.out.print(i + " ");
		}
	}
}
