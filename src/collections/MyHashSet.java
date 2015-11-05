package collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/**
 * An example implementation of the Set interface, that just delegates to a HashSet.
 * @author Jonathan Lovelace
 * @param <E> the type of elements in the set.
 */
public class MyHashSet<E> implements Set<E> {
	/**
	 * The set we delegate to.
	 */
	private final Set<E> impl = new HashSet<>();
	/**
	 * @return the number of elements in the set
	 */
	@Override
	public int size() {
		// return impl.size();
		// TODO Auto-generated method stub
		return 0;
	}
	/**
	 * @return whether the set contains no elements
	 */
	@Override
	public boolean isEmpty() {
		// return impl.isEmpty();
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * @param obj an object
	 * @return whether this set contains it (or an object it equals()
	 */
	@Override
	public boolean contains(final Object obj) {
		// return impl.contains(obj);
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * @return an iterator over the contents of the set
	 */
	@Override
	public Iterator<E> iterator() {
		// return impl.iterator();
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * @return an array containing the elements of the set
	 */
	@Override
	public Object[] toArray() {
		// return impl.toArray();
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * @param arr an array
	 * @return it, or another array of the same type, containing the contents of the set
	 */
	@Override
	public <T> T[] toArray(final T[] arr) {
		// return impl.toArray(arr);
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * @param item an item to add to the set
	 * @return false if the item was not already in the set, otherwise true
	 */
	@Override
	public boolean add(final E item) {
		// return impl.add(item);
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * @param item an item to remove from the set
	 * @return true if the set contained the item
	 */
	@Override
	public boolean remove(final Object item) {
		// return impl.remove(item);
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * @param collection a collection of some kind of objects
	 * @return whether this set contains everything in that collection
	 */
	@Override
	public boolean containsAll(final Collection<?> collection) {
		// return impl.containsAll(collection);
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * @param collection a collection of items to add to the set
	 * @return true if any of them was not already in the set
	 */
	@Override
	public boolean addAll(final Collection<? extends E> collection) {
		// return impl.addAll(collection);
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * Remove everything from the set that is not in the specified collection.
	 * @param collection a collection of some kind of objects
	 * @return true if any items were removed from the set
	 */
	@Override
	public boolean retainAll(final Collection<?> collection) {
		// return impl.retainAll(collection);
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * @param collection a collection of objects to remove from the set
	 * @return whether any of them were present in the set
	 */
	@Override
	public boolean removeAll(final Collection<?> collection) {
		// return impl.removeAll(collection);
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * Remove all items from the set.
	 */
	@Override
	public void clear() {
		// impl.clear();
		// TODO Auto-generated method stub
	}
}
