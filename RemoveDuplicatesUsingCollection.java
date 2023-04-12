package week3.Day3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		char c[]=text.toCharArray();
		Set<Character> setstr=new LinkedHashSet<Character>();
		
		
		for (Character s : c) {
			
			setstr.add(s);
										
			}
		
		//Lean to Convert Set to List
		List<Character> listchar=new ArrayList<Character>(setstr);
	
		for(int i=0;i<listchar.size();i++)
		{
			System.out.print(" "+listchar.get(i));
		}
		//output=setstr.toString().replaceAll("\\,|\\[|\\]|\\s", " ");
			
			
	}
	

}
