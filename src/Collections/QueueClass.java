package Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueClass {
	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>();
		queue.add("a");
		queue.add("aa");
		queue.add("x");
		queue.add("v");
		queue.add("m");
		System.out.println(queue);
		
		Deque<String> dq = new LinkedList<>();
		dq.add("a");
		dq.addFirst("aa");
		dq.add("a");
		dq.addLast("aaa");
		dq.add("xx");
//		dq.add("v");
		
		
		System.out.println(dq);
		
		
		//Blocking Queue Interface (Thread safe)
		
		BlockingQueue<String> bq = new LinkedBlockingQueue<>();
		bq.add("Karthikeya");
		bq.add("Vaidhee");
		
		System.out.println(bq);
	}
}
