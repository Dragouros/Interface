package Interface;

import java.util.*;

public class SortNumbers2 implements MyInterface {
	
	public int SmallestNumber(ArrayList<Integer> Numbers) {
		
		int Smallest = Numbers.get(0);
		for(int j = 1; j < Numbers.size(); j++) {
			if(Numbers.get(j) < Smallest) {
				Smallest = Numbers.get(j);
			}
		}
		return Smallest;
	}
	
	public ArrayList<Integer> Sort(ArrayList<Integer> List) {
		ArrayList<Integer> OrderList = new ArrayList<Integer>();
	    SortNumbers2 MyAnalyze = new SortNumbers2();
	    while(List.size() > 0) {
	    	OrderList.add(MyAnalyze.SmallestNumber(List));
	    	List.remove(OrderList.get(OrderList.size()-1));
	    }
	    return OrderList;
	}
}
