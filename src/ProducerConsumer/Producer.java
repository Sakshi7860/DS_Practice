package ProducerConsumer;

public class Producer extends Thread{
	Queue1 queue;
	public Producer(Queue1 queue) {
		this.queue=queue;
		
	}
	public void run()
	{
		int number=0;
		while(true)
		{
			try {
				queue.put(number++);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
