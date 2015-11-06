package collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
/**
 * An example implementation of the Queue interface, that just delegates to a LinkedList.
 * @author Jonathan Lovelace
 *
 * @param <E> the type of elements in the queue.
 */
public class MyLinkedQueue<E> implements Queue<E> {
	/**
	 * The queue we delegate to.
	 */
	private final Queue<E> impl = new LinkedList<E>();
	/**
	 * @return the number of items in the queue
	 */
	@Override
	public int size() {
		// return impl.size();
		// TODO Auto-generated method stub
		return 0;
	}
	/**
	 * @return whether there are no items in the queue
	 */
	@Override
	public boolean isEmpty() {
		// return impl.isEmpty();
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * @param obj an object
	 * @return whether it (or an object it equals()) is in the queue
	 */
	@Override
	public boolean contains(final Object obj) {
		// return impl.contains(obj);
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * @return an iterator over the items in the queue
	 */
	@Override
	public Iterator<E> iterator() {
		// return impl.iterator();
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * @return an array containing the elements in the queue
	 */
	@Override
	public Object[] toArray() {
		// return impl.toArray();
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param arr an array
	 * @return it, or another array of the same type, containing the contents of the queue
	 */
	@Override
	public <T> T[] toArray(final T[] arr) {
		// return impl.toArray(arr);
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * @param item an object to remove from the queue
	 * @return true if the queue contained it
	 */
	@Override
	public boolean remove(final Object item) {
		// return impl.remove(item);
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * @param collection a collection of some kind of objects
	 * @return whether this queue contains everything in that collection
	 */
	@Override
	public boolean containsAll(final Collection<?> collection) {
		// return impl.containsAll(collection);
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * @param collection a collection of items to add to the queue
	 * @return true if the collection was nonempty
	 */
	@Override
	public boolean addAll(final Collection<? extends E> collection) {
		// return impl.addAll(collection);
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * @param collection of objects to remove from the queue
	 * @return whether any of them were present in the queue
	 */
	@Override
	public boolean removeAll(final Collection<?> collection) {
		// return impl.removeAll(collection);
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * Remove everything from the queue that is not in the specified collection.
	 * @param collection a collection of some kind of objects
	 * @return true if any items were removed from the queue
	 */
	@Override
	public boolean retainAll(final Collection<?> collection) {
		// return impl.retainAll(collection);
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * Remove all items from the queue.
	 */
	@Override
	public void clear() {
		// return impl.clear();
		// TODO Auto-generated method stub
	}
	/**
	 * @param item an item to add to the queue
	 * @return true
	 */
	@Override
	public boolean add(final E item) {
		// return impl.add(item);
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * If there isn't space in a Queue implementation for another item at the
	 * moment, add() throws an exception, but this just returns false.
	 *
	 * @param item
	 *            An item to try to add to the queue
	 * @return true if the item was successfully added; false otherwise
	 */
	@Override
	public boolean offer(final E item) {
		// return impl.offer(item);
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * If there is no item at the head of the queue, this throws an exception.
	 * @return the item that was at the head of the queue, after removing it.
	 */
	@Override
	public E remove() {
		// return impl.remove();
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * @return the item at the head of the queue, after removing it, or null if there was nothing there
	 */
	@Override
	public E poll() {
		// return impl.poll();
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * Throws an exception if the queue is empty.
	 * @return the element at the head of the queue, without removing it
	 */
	@Override
	public E element() {
		// return impl.element();
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * @return the element at the head of the queue, without removing it, or null if the queue is empty
	 */
	@Override
	public E peek() {
		// return impl.peek();
		// TODO Auto-generated method stub
		return null;
	}

}
