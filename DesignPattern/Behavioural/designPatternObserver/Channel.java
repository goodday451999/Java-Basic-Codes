package designPatternObserver;

import java.util.ArrayList;
import java.util.List;

public class Channel {
	private List<Subscriber> subscribersList = new ArrayList<>();
	public String videoTitle;
	public void doSubscribe(Subscriber sub) {
		subscribersList.add(sub);
	}
	public void doUnsubscribe(Subscriber sub) {
		subscribersList.remove(sub);
	}
	public void notifySubscriber() {
		for(Subscriber s : subscribersList) {
			s.getUpdate();
		}
	}
	public void upload(String videoTitle) {
		this.videoTitle = videoTitle;
		notifySubscriber();
	}
}
