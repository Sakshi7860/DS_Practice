package Observer;

public class Main {

	public static void main(String[] args) {
		Channel Mtv=new Channel();
		Subscriber sb=new Subscriber("Sakshi");
		Subscriber sb1=new Subscriber("Akshay");
		sb.subscribeChannel(Mtv);
		sb1.subscribeChannel(Mtv);
		Mtv.subscribe(sb);
		Mtv.subscribe(sb1);
		Mtv.videoUpload("New Video");

	}

}
