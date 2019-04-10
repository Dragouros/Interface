package Interface;

import java.util.*;

public class SortNumbers implements MyInterface {

	public ArrayList<Integer> Sort(ArrayList<Integer> Numbers) {
	
		for(int i = 0; i < Numbers.size(); i++) { //Check each element of the array
			for(int j = 0; j < Numbers.size() - 1 - i; j++) { //Check each element of the array except for himself
				if(Numbers.get(j) > Numbers.get(j + 1)){ //Check if the first element is bigger than the next element
					int Temp = Numbers.get(j); //Lines 15, 16 and 17 swap the elements
					Numbers.set(j, Numbers.get(j + 1));
					Numbers.set(j + 1, Temp);
				}
			}
		}
		return Numbers;
	}
}