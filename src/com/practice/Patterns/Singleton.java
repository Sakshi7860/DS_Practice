package com.practice.Patterns;

 class Singleton {
	private static Singleton instance=null;
	public String s;
	private Singleton()
	{
		s="Sakshi";
		System.out.println("Inside Singleton Constructor");
	}
	public static Singleton getInstance()
	{
		if(instance==null)
			instance=new Singleton();
		
		return instance;
		
	}

	public static void main(String[] args) {
		Singleton x=Singleton.getInstance();
		Singleton y=Singleton.getInstance();
		x.s=(x.s).toUpperCase();
		System.out.println(x.s);
		System.out.println(y.s);
		//System.out.println(Singleton.getInstance().hashCode());
		

	}

}
