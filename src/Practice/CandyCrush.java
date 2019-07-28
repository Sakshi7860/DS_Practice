package Practice;

public class CandyCrush {

	public static void main(String[] args) {
		String s="aabbbaacccceeeddddeee";
		String s1="";
		char c[]=s.toCharArray();
		for(Character c1:c) 
		{
			String s2=Character.toString(c1);
			//System.out.println(s2+s2);
			if(s1.contains(s2+s2))
			{
				s1=s1.replaceAll(s2+s2,"");
			}
			else
			{
				s1=s1.concat(s2);
				
			}
		}
		System.out.println(s1);

	}

}
