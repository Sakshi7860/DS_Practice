package Strategy;

public class Under10Slab implements Tax {

	@Override
	public void taxSlab() {
		System.out.println("tax will apply under 10 slab");
	}

}
