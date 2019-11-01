package Practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionEmployee {

	public static void main(String[] args) throws ClassNotFoundException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		
		
		
		//Class Details
		
		Object o=Class.forName("Practice.Employee").newInstance();
		System.out.println("Object Created"+o.getClass().getName());
		Class c=Class.forName("Practice.Employee");
		System.out.println("Name Of class is "+c.getName());
		System.out.println(c.getSuperclass());
		System.out.println("Name os Super Class is "+c.getSuperclass().getName());
		Class c1[]=c.getInterfaces();
		System.out.println("length is:"+c1.length);
		for(Class c2:c1)
		{
			System.out.println(c2.getName());
		}
//		int i=c.getModifiers();
//		System.out.println("Modifiers are "+ Modifier.toString(i));
//		Field[] f=c.getFields();
//		for(Field f1:f)
//		{
//			System.out.println("Field name "+f1.getName()+" "+ "Field type is "+f1.getType());
//		}
	  // Field Details
		Field[] f2=c.getDeclaredFields();
		for(Field f1:f2)
		{
			System.out.println("Field name "+f1.getName()+" "+"Field type is "+f1.getType().getName());
			int i1=f1.getModifiers();
			System.out.println(Modifier.toString(i1));
			//System.out.println(f1.get(f1));
		}
		
		// Method Details
		Method[] method=c.getDeclaredMethods();
		for(Method m:method)
		{
			System.out.println("Method name "+m.getName());
			System.out.println("Method Type "+m.getReturnType().getName());
			int i=m.getModifiers();
			System.out.println(Modifier.toString(i));
			System.out.println(m.getParameterCount());
			Class[] c2=m.getParameterTypes();
			for(Class cq:c2)
			{
				System.out.println("Parameter Type "+cq.getName());
			}
			System.out.println("");
			
		}
		
		//Constructor Details
		Constructor[] cons=c.getDeclaredConstructors();
		for(Constructor co:cons)
			
		{
			System.out.println("Construcor name "+co.getName());
			System.out.println("Consrtuctor Count "+co.getParameterCount());
			int i=co.getModifiers();
			System.out.println("Modifier is "+Modifier.toString(i));
			System.out.println("");
					
		}
		
		

	}


}
