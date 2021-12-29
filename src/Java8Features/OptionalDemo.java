package Java8Features;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		String s=null;
		
		Optional<Object> val3= Optional.empty();
		System.out.println(val3);
		Optional<String> val=Optional.of("Sakshi");
		System.out.println(val);
	
		Optional<String> val2=Optional.ofNullable("abbbc");
		System.out.println(val2);
		System.out.println(val2.map(String::toUpperCase));
		
		
		System.out.println(val2.orElse("Hi everyone"));

	}

}
