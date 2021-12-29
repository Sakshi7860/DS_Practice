package DS_practice;

public class Demo {

	public static void main(String[] args) {
		System.out.println(System.getProperty("java.runtime.version"));
		String bi="1000010";
		String output="";
		for(int i=bi.length()-1;i>=0;i--)
		{
		    if(bi.charAt(i)=='0')
		    {
		        output+='1';
		    }
		    else
		    {
		        output+='0';
		    }
		        
		}
		System.out.println(output+1);
	}
}