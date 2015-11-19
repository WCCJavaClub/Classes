package testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import org.junit.Test;

import collections.MyHashSet;

/**
 * A class to test my collections implementations.
 * @author Jonathan Lovelace
 */
public class TestCollections {
	/**
	 * Test that a queue is initially empty.
	 */
	@Test
	public void testQueueInitialEmptiness() {
//		final Queue<String> queue = new MyLinkedQueue<>();
		final Queue<String> queue = new LinkedList<>();
		assertEquals("A queue is initially empty", 0, queue.size());
		assertTrue("A queue is initially empty", queue.isEmpty());
		assertFalse("An empty queue does not contain an element", queue.contains("string"));
	}
	/**
	 * Test my Queue implementation.
	 */
	@Test
	public void testQueue() {
//		final Queue<String> queue = new MyLinkedQueue<>();
		final Queue<String> queue = new LinkedList<>();
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
	 * Test that my Map implementation is initially empty.
	 */
	@Test
	public void testMapInitialEmptiness() {
//		final Map<String, String> map = new MyHashMap<>();
		final Map<String, String> map = new HashMap<>();
		assertEquals("A Map starts out empty", 0, map.size());
		assertTrue("A Map starts out empty", map.isEmpty());
	}
	/**
	 * Test my Map implementation.
	 */
	@Test
	public void testMap() {
//		final Map<String, String> map = new MyHashMap<>();
		final Map<String, String> map = new HashMap<>();
		map.put("key", "value");
		map.put("keyTwo", "valueTwo");
		assertFalse("A Map is no longer empty after inserting items", map.isEmpty());
		assertEquals("The Map has the right number of items", 2, map.size());
		assertEquals("Returns right value for first key", "value", map.get("key"));
		assertEquals("Map returns right value for different key", "valueTwo", map.get("keyTwo"));
	}
	/**
	 * Test that a Map handles value replacement properly.
	 */
	@Test
	public void testMapValueReplacement() {
//		final Map<String, String> map = new MyHashMap<>();
		final Map<String, String> map = new HashMap<>();
		assertNull("Map returns null for a key it does not have", map.get("key"));
		map.put("key", "value");
		assertEquals("The Map has the first value once it is inserted", "value", map.get("key"));
		map.put("key", "another");
		assertEquals("The Map has the second value instead of the first after another put()", "another", map.get("key"));
	}
	/**
	 * Test that a Set is initially empty.
	 */
	@Test
	public void testSetInitialState() {
//		final Set<String> set = new MyHashSet<>();
		final Set<String> set = new HashSet<>();
		assertEquals("A Set starts out empty", 0, set.size());
		assertTrue("A Set starts out empty", set.isEmpty());
	}
	/**
	 * Test the uniqueness property of Sets.
	 */
	@Test
	public void testSetUniqueness() {
//		final Set<String> set = new MyHashSet<>();
		final Set<String> set = new HashSet<>();
		assertEquals("A Set starts out empty", 0, set.size());
		set.add("string");
		assertEquals("Size of 1 after adding the item", 1, set.size());
		set.add("string");
		assertEquals("Adding something twice to a Set doesn't change it twice", 1, set.size());
		set.add("second");
		assertEquals("A set can contain more than one item", 2, set.size());
	}
	/**
	 * Test that we can get items out of a set.
	 */
	@Test
	public void testSet() {
//		final Set<String> set = new MyHashSet<>();
		final Set<String> set = new HashSet<>();
		assertFalse("Set initially doesn't contain our data", set.contains("value"));
		set.add("value");
		assertTrue("Set contains value after adding it", set.contains("value"));
	}
}
