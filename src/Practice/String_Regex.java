package Practice;

public class String_Regex {

	public static void main(String[] args) {
		
		String str="This method reads text from a, character-input stream. It does buffering for efficient reading of characters, arrays, and lines.";
		String str1[]=str.split("[,[ ].]");
		for(int i=0;i<str1.length;i++)
		{
			//str1[i]=str1[i].trim();
			System.out.print(str1[i].trim()+" ");
		}
		

	}

}
