package Strategy;

public class Main {

	public static void main(String[] args) {
		Clothes c=new Clothes();
		Tax t=new Under10Slab();
		c.tax=t;
		c.tax.taxSlab();
		
	}

}
