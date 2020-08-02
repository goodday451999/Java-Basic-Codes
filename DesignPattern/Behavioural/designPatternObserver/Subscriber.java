package designPatternObserver;

public class Subscriber {
	private String name;
	private Channel channel = new Channel();
		
	public Subscriber(String name) {
		super();
		this.name = name;
	}
	
	public void getUpdate() {
		System.out.println("Hey " + name + ", Video Uploaded : " + channel.videoTitle);
	}
	public void subscribeChannel(Channel channel) {
		this.channel = channel; 
	}
}
