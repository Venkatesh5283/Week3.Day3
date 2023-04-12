package week3.Day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWordsUsingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String text = "We learn java basics as part of java sessions in java week1";
		String splt[]=text.split(" ");
		Set<String> setstr=new LinkedHashSet<String>();
		String output="";
		for (String s : splt) {
			
			setstr.add(s);
			
			}
		output=setstr.toString().replaceAll("\\,|\\[|\\]|\\s", " ");
			System.out.println(output);
			
	}

}
