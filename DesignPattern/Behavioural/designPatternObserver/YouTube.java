package designPatternObserver;

public class YouTube {
	public static void main(String args[]) {
		Channel myChannel = new Channel();
		Subscriber s1 = new Subscriber("User1");
		Subscriber s2 = new Subscriber("User2");
		Subscriber s3 = new Subscriber("User3");
		Subscriber s4 = new Subscriber("User4");
		
		myChannel.doSubscribe(s1);
		myChannel.doSubscribe(s2);
		myChannel.doSubscribe(s3);
		myChannel.doSubscribe(s4);
		
		myChannel.doUnsubscribe(s2);
		myChannel.doUnsubscribe(s1);
		
		s1.subscribeChannel(myChannel);
		s2.subscribeChannel(myChannel);
		s3.subscribeChannel(myChannel);
		s4.subscribeChannel(myChannel);
		
		myChannel.upload("My Youtube Video");
	}
}
