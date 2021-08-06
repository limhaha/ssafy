package com.ssafy.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<String>();
		System.out.println(queue.isEmpty()+"/" + queue.size());
		
		queue.offer("이하림");
		queue.offer("안종혁");
		queue.offer("최성환");
		queue.offer("서상우");
		queue.offer("형대우");
		queue.offer("박준수");
		queue.offer("장윤석");
		
		System.out.println(queue.isEmpty()+"/" + queue.size());
		System.out.println(queue.peek());
		System.out.println(queue.isEmpty()+"/" + queue.size());
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.isEmpty() + "/" + queue.size());
	}

}
