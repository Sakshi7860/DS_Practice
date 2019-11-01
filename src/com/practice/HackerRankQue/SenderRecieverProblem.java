package com.practice.HackerRankQue;

class Data
{
	String packet;
	boolean flag=true;
	public synchronized void send(String msg) 
	{
		while(!flag)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Sending Packet"+msg);
		this.packet=msg;
		flag=false;
		notifyAll();
		
	}
	
	public synchronized String receive()
	{
		while(flag)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		flag=true;
		notifyAll();
		System.out.println("Packet Recieved"+packet);
		return packet;
	}
}

class Sender extends Thread
{
	Data d;
	Sender(Data data)
	{
		this.d=data;
	}
	public void run()
	{
		String packet= "first";
		d.send(packet);
	}
}

class Receiver extends Thread
{
	
	Data d;
	Receiver(Data data)
	{
		this.d=data;
	}
	public void run()
	{
		System.out.println(d.receive());
	}
}

public class SenderRecieverProblem {

	public static void main(String[] args) {
		Data d=new Data();
		Sender sender =new Sender(d);
		Receiver receiver=new Receiver(d);
		sender.start();
		receiver.start();

	}

}
