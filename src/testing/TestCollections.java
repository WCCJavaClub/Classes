package testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import org.junit.Test;

/**
 * A class to test my collections implementations.
 * @author Jonathan Lovelace
 */
public class TestCollections {
	/**
	 * Test my Queue implementation.
	 */
	@Test
	public void testQueue() {
//		final Queue<String> queue = new MyLinkedQueue<>();
		final Queue<String> queue = new LinkedList<>();
		assertEquals("A queue is initially empty", 0, queue.size());
		assertTrue("A queue is initially empty", queue.isEmpty());
		assertFalse("An empty queue does not contain an element", queue.contains("string"));
		queue.offer("string");
		assertEquals("After adding one element, a queue has size 1", 1, queue.size());
		assertFalse("After adding ane element, a queue is no longer empty", queue.isEmpty());
		int count = 0;
		for (String string : queue) {
			assertEquals("A queue's iterator contains the element we added", "string", string);
			count++;
		}
		assertEquals("A queue's iterator goes over the queue's contents once", 1, count);
		assertEquals("The item we added is at the head of the queue", "string", queue.peek());
		assertEquals("The item we added was at the head of the queue", "string", queue.remove());
		assertNull("After remove(), the queue is empty again", queue.peek());
		assertTrue("After remove(), the queue is empty again", queue.isEmpty());
	}
	/**
	 * Test my Map implementation.
	 */
	@Test
	public void testMap() {
//		final Map<String, String> map = new MyHashMap<>();
		final Map<String, String> map = new HashMap<>();
		assertEquals("A Map starts out empty", 0, map.size());
		assertTrue("A Map starts out empty", map.isEmpty());
	}
}
