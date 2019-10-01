package Practice;

import java.util.ArrayList;
import java.util.List;

public class collect {
	private static final List<Integer> rules = new ArrayList<Integer>();
	
	private List<Integer>  loadRule()
	{
		rules.add(10);
		rules.add(20);
		return rules;
	}
	private List<Integer> getRule()
	{
		if(rules.isEmpty())
			return loadRule();
		else
		{
			System.out.println("else part");
			return rules;
		}
			
	}

	public static void main(String[] args) {
		collect c=new collect();
		System.out.println(c.getRule());
		System.out.println(c.getRule());
		
	}
	
		
		

}
