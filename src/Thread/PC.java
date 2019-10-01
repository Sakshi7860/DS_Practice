package Thread;

import java.util.ArrayList;
import java.util.List;

public class PC {

	List<Integer> list=new ArrayList<>();
	int capacity=2;
	int value=0;
	
	public void produce() throws InterruptedException
	{
		
		if(list.size()==capacity)
			wait();
		list.add(value);
		notify();
		
	}
	
	public void consume() throws InterruptedException
	{
		if(list.size()==0)
			wait();
		int i=list.remove(0);
		notify();
	}
	
}
