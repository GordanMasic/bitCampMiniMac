import java.util.LinkedList;

public class QueueUtils {

	public static void enqueueString(LinkedList<String> queue, String el) {
		queue.add(0, el);
	}
	
	public static String enqueueString(LinkedList<String> queue){
		return queue.remove(queue.size()-1);
	}
}
