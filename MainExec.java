package Interface;

import java.util.*;

public class MainExec {

	public static void main(String[] args) {
		ArrayList<Integer> Count = new ArrayList<Integer>() {{
		add(36);
		add(22);
		add(1);
		add(37);
		add(12);
		add(13);
		add(29);
		add(17);
		add(27);
		add(10);
		add(20);
		add(30);
		add(7);
		add(9);
		add(17);
		add(31);
		add(33);
		add(38);
		add(23);
		add(24);
		add(15);
		}};
		MyInterface Sort1 = new SortNumbers();
		System.out.println(Sort1.Sort(Count));
		MyInterface Sort2 = new SortNumbers2();
		System.out.println(Sort2.Sort(Count));
	}
}
