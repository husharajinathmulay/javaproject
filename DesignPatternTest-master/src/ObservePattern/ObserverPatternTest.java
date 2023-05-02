
package ObservePattern;

public class ObserverPatternTest {

	public static void main(String[] args) {
		//create subject
		MyTopic topic = new MyTopic();
		
		//create observers
		Observer obj1 = new MyTopicSubscriber("Shubham");
		Observer obj2 = new MyTopicSubscriber("Chetan");
		Observer obj3 = new MyTopicSubscriber("a");
		
		//register observers to the subject
		topic.register(obj1);
		topic.register(obj2);
		topic.register(obj3);
		//topic.register(obj3);
		
		//attach observer to subject
		obj1.setSubject(topic);
		obj2.setSubject(topic);
		obj3.setSubject(topic);
		//obj3.setSubject(topic);
		
		//check if any update is available
		obj1.update();
		obj2.update();
		//now send message to subject
		topic.postMessage("New Message");
		topic.postMessage("Good morning");
		obj1.update();
		obj2.update();
		topic.postMessage("helll000 every 1");
		obj1.update();
	}

}
