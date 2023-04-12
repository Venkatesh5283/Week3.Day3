package week3.Day3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ClassRoomActivities2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String companyName="google";
 
		   char c[]=companyName.toCharArray();
		   Set<Character> set=new LinkedHashSet<Character>();
		   for (Character ch : c) {
			set.add(ch);
			
			
		}
		 String  result=set.toString().replaceAll("\\,|\\[|\\]|\\s", "");
		   System.out.println(result);
	}

}
