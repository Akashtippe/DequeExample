package deque1;

import java.util.ArrayDeque;


public class SimpleStageArrayDeque {
	private final ArrayDeque<Item> queue;

	
	public SimpleStageArrayDeque() {
		this.queue = new ArrayDeque<>();
	}

	public void addItem(Item item) {
		queue.add(item);
	}

	
	public Item pollItem() {
		return queue.poll();
	}

	
	public boolean isEmpty() {
		return queue.isEmpty();
	}
}
