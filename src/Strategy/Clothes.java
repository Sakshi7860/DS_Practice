package Strategy;

public class Clothes extends Product {
	public void get()
	{
		tax=new  Under10Slab();
		tax.taxSlab();
	}
}
