package Practice;

public class test12 {
	public static void main(String[] args) {
		
		String result = getResult(null);
		StringBuffer s=new StringBuffer();
		String str="Sakshi";
		String str1=str.concat('r'+"");
		String s1=str.replace('a', 'o');
		System.out.println(s1);
	}

	private static String getResult(Object object) {
		// TODO Auto-generated method stub
		try {
			object.hashCode();
		}catch(NullPointerException e) {
			System.out.println();
			return null;
		}finally{
			return "Finally";
		}
	}
	
}
