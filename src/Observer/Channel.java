package Observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {
	private List<Subscriber> list=new ArrayList<>();
	private String title;
	public void subscribe(Subscriber s)
	{
		list.add(s);
	}
	public void unsubscribe(Subscriber s)
	{
		list.remove(s);
	}
	public void notifySubscribers()
	{
		for(Subscriber sb:list)
			sb.update();
	}
	public void videoUpload(String title)
	{
		this.title=title;
		notifySubscribers();
	}
	

}
