package week3.Day3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ClassRoomActivities {

	public static void main(String[] args) {
		int num[]= {3,5,7,2,5,7,9,2,1,54,8,4,6,4,8};
		Set<Integer> set=new HashSet<Integer>();
		
		for (Integer i : num) {
			
			set.add(i);
			
		}
        System.out.println(set);
	}

}
