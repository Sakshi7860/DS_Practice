package Practice;

import java.util.ArrayList;
import java.util.List;

public class Siem_Pr {
	public static void addMoreElements(List<String> list1)
	
	{
		list1.add("C");
		list1.add("D");
		list1=null;
	}
	

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		list.add("A");
		list.add("B");
		addMoreElements(list);
		for(String s:list)
			System.out.println(s);
	}

}
