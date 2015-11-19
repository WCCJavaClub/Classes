package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/**
 * An example implementation of the List interface, that just delegates to an ArrayList.
 * @author Jonathan Lovelace
 * @param <E> the type of elements in the list.
 */
public class MyArrayList<E> implements List<E> {
	/**
	 * The list we delegate to.
	 */
	private final List<E> impl = new ArrayList<>();
	/**
	 * @return the size of the list
	 */
	@Override
	public int size() {
		// return impl.size();
		// TODO Auto-generated method stub
		return 0;
	}
	/**
	 * @return whether the list is empty
	 */
	@Override
	public boolean isEmpty() {
		// return impl.isEmpty();
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * @param obj an object
	 * @return whether the list contains it
	 */
	@Override
	public boolean contains(final Object obj) {
		// return impl.contains(obj);
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * @return an iterator over the list
	 */
	@Override
	public Iterator<E> iterator() {
		// return impl.iterator();
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * @return an array containing the list's contents
	 */
	@Override
	public Object[] toArray() {
		// return impl.toArray();
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * @param arr an array
	 * @return it, or another array, containing the list's contents
	 * @param <T> the type of things contained in the array
	 */
	@Override
	public <T> T[] toArray(final T[] arr) {
		// return impl.toArray(arr);
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * Add an item to the list.
	 * @param item the item to add
	 * @return whether the item was successfully added to the list
	 */
	@Override
	public boolean add(final E item) {
		// return impl.add(item);
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Remove an item from the list. Returns true if the object was in the list,
	 * false otherwise.
	 *
	 * @param obj
	 *            the object to remove
	 * @return whether the item was removed from the list.
	 */
	@Override
	public boolean remove(final Object obj) {
		// return impl.remove(obj);
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * @param collection a collection of any kind of things
	 * @return whether we contain every item it contains
	 */
	@Override
	public boolean containsAll(final Collection<?> collection) {
		// return impl.containsAll(collection);
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * @param collection a collection of things to add to the list
	 * @return whether all of them were added successfully
	 */
	@Override
	public boolean addAll(final Collection<? extends E> collection) {
		// return impl.addAll(collection);
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * @param collection a collection of things to add to the list
	 * @param index the index at which to start adding them
	 * @return whether all of them were added successfully
	 */
	@Override
	public boolean addAll(final int index, final Collection<? extends E> collection) {
		// return impl.addAll(index, collection);
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * @param collection a collection of things to remove from the list
	 * @return whether all of them were in the list
	 */
	@Override
	public boolean removeAll(final Collection<?> collection) {
		// return impl.removeAll(collection);
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * Remove everything from the list that is *not* a member of the given collection.
	 * @param collection a collection of items
	 * @return true if the list was changed by this operation
	 */
	@Override
	public boolean retainAll(final Collection<?> collection) {
		// return impl.retainAll(collection);
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * Remove all items from the list.
	 */
	@Override
	public void clear() {
		// impl.clear();
		// TODO Auto-generated method stub
	}
	/**
	 * @param index an index into the list
	 * @return the item at that index
	 * @throws IndexOutOfBoundsException if the index is less than 0 or greater than or equal to the size of the list.
	 */
	@Override
	public E get(final int index) {
		// return impl.get(index);
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * @param index an index into the list (including one past the current end, but no farther)
	 * @param element an element to insert there
	 * @return the element that was there before
	 * @throws IndexOutOfBoundsException if the index is less than 0 or greater than the size of the list
	 */
	@Override
	public E set(final int index, final E element) {
		// return impl.set(index, element);
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * @param index an index into the list
	 * @param element an element to insert there, shifting everything after that index one space further
	 */
	@Override
	public void add(final int index, final E element) {
		// impl.add(index, element);
		// TODO Auto-generated method stub
	}
	/**
	 * @param index an index into the list
	 * @return the item that was at that index, after removing it
	 */
	@Override
	public E remove(final int index) {
		// return impl.remove(index);
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * @param obj an object
	 * @return its (first) location in the list, if it is in the list, or -1 if it is not
	 */
	@Override
	public int indexOf(final Object obj) {
		// return impl.indexOf(obj);
		// TODO Auto-generated method stub
		return 0;
	}
	/**
	 * @param obj an object
	 * @return its *last* location in the list, if it is in the list, or -1 if it is not
	 */
	@Override
	public int lastIndexOf(final Object obj) {
		// return impl.lastIndexOf(obj);
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * A ListIterator has several advantages over a typical Iterator: it allows
	 * you to go backward as well as forward, it keeps track of where you are in
	 * the list (the index), and it provides operations to modify the list.
	 *
	 * @return a List-specific iterator over the list
	 */
	@Override
	public ListIterator<E> listIterator() {
		// return impl.listIterator();
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * @param index an index in the list
	 * @return a ListIterator over the elements in the list starting with that index
	 */
	@Override
	public ListIterator<E> listIterator(final int index) {
		// return impl.listIterator(index);
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Note that the object returned by this function updates if items are
	 * replaced (or simply changed, but that's usual), and changes made to it
	 * affect this list. Any "structural" changes to this list may break the
	 * returned sub-list.
	 *
	 * @param fromIndex
	 *            one index into the list
	 * @param toIndex
	 *            a second index into the list
	 * @return a view of the items from (and including) fromIndex to (but not
	 *         including) toIndex
	 */
	@Override
	public List<E> subList(final int fromIndex, final int toIndex) {
		// return impl.subList(fromIndex, toIndex);
		// TODO Auto-generated method stub
		return null;
	}

}
