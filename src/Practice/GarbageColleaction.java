package Practice;

public class GarbageColleaction {

	public static void main(String[] args) throws Exception {
		String str="abc";
		str=null;
		System.gc();
		Thread.sleep(1000);
		System.out.println("end");
		

	}
	protected void finalize()
	{
		System.out.println("finalize");
	}

}
