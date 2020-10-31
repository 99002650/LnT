package com.example.lt.observer;

public class MyTopicSubscriber implements Observer {
	
	private String name;
	private PostOffice topic;
	
	public MyTopicSubscriber(String nm){
		this.name=nm;
	}
	@Override
	public void update() {
		String msg = (String) topic.getUpdate(this);
		if(msg == null){
			System.out.println(name+":: No new message");
		}else
		System.out.println(name+":: Consuming message::"+msg);
	}

	@Override
	public void setSubject(PostOffice sub) {
		this.topic=sub;
	}

}