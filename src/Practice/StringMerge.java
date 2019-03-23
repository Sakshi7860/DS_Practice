package Practice;

public class StringMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Sakshi";
		String str2="Guptal2";
		int size;
		String str3="";
		if(str1.length()< str2.length())
			size=str1.length();
		else
			size=str2.length();
		for(int i=0;i<size;i++)
			str3+=str1.charAt(i)+""+str2.charAt(i);
		for(int j= size;j<str1.length();j++)
			str3+=str1.charAt(j);
		for(int j= size;j<str2.length();j++)
			str3+=str2.charAt(j);
		System.out.println(str3);
		
		

	}

}
