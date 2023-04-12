package week3.Day3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateInList {

	public static void main(String[] args) {
		String str="PayPal India";
		char ch[]=str.toCharArray();
		List<Character> listname=new ArrayList<Character>();
		for (Character c : ch) {
			listname.add(c);
						
		}
		Set<Character> setname=new LinkedHashSet<Character>(listname);
		List<Character> listname1=new ArrayList<Character>(setname);
		for(int i=0;i<listname1.size();i++)
		{
			System.out.print(" "+listname1.get(i));
		}
		
		
	}

}
