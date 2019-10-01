package ProducerConsumer;

public class DemoClass {

	public static void main(String[] args) {
		Queue1 q=new Queue1();
		Producer p=new Producer(q);
		Consumer c=new Consumer(q);
		p.start();
		c.start();
	
		

	}

}
