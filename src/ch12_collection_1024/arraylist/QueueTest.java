package ch12_collection_1024.arraylist;

import java.util.ArrayList;

class MyQueue{
	
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	public String deQueue() {
		int len = arrayQueue.size();
		if(len == 0 ) { 
			System.out.println("큐가 비었습니다");
			return null;
		}
		
		return(arrayQueue.remove(0));
	}
}

public class QueueTest {

	public static void main(String[] args) {

		MyQueue queue = new MyQueue();
		queue.enQueue("A"); // 1층
		queue.enQueue("B"); // 2층
		queue.enQueue("C"); // 3층
		
		System.out.println(queue.deQueue()); // 1층
		System.out.println(queue.deQueue()); // 2층
		System.out.println(queue.deQueue()); // 3층
	}
}
