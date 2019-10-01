package ProducerConsumer;

public class Consumer extends Thread{
	Queue1 queue;
	public Consumer(Queue1 queue) {
		this.queue=queue;
	}
	public void run() 
	{
		int number=1;
		while(true)
		{
			try {
				queue.get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}


}
