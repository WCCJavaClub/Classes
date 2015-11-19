package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 * An example implementation of the Map interface, that just delegates to a HashMap.
 * @author Jonathan Lovelace
 *
 * @param <K> the type of keys in the map
 * @param <V> the type of values in the map
 */
public class MyHashMap<K, V> implements Map<K, V> {
	/**
	 * The map we delegate to.
	 */
	private final Map<K, V> impl = new HashMap<>();
	/**
	 * @return how many entries (key-value pairs) are in the map
	 */
	@Override
	public int size() {
		// return impl.size();
		// TODO Auto-generated method stub
		return 0;
	}
	/**
	 * @return whether the map is empty
	 */
	@Override
	public boolean isEmpty() {
		// return impl.isEmpty();
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * @param key an object
	 * @return whether the map contains any value for that key
	 */
	@Override
	public boolean containsKey(final Object key) {
		// return impl.containsKey(key);
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * @param value
	 *            an object
	 * @return whether the any key in the map corresponds to that object (or one
	 *         it equals()) as its value
	 */
	@Override
	public boolean containsValue(final Object value) {
		// return impl.containsValue(value);
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * @param key an object to use as a key
	 * @return the value corresponding to it in the map, or null if it is not a key in the map.
	 */
	@Override
	public V get(final Object key) {
		// return impl.get(key);
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * @param key an object to use as a key
	 * @param value an object to use as its value
	 * @return the object that was previously associated with this key, or null if nothing was
	 */
	@Override
	public V put(final K key, final V value) {
		// return impl.put(key, value);
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * @param key an object to use as a key
	 * @return the object associated with it as its value, after removing that mapping from the map
	 */
	@Override
	public V remove(final Object key) {
		// return impl.remove(key);
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * @param map a map, all of the elements of which are to be inserted into this one
	 */
	@Override
	public void putAll(final Map<? extends K, ? extends V> map) {
		// impl.putAll(map);
		// TODO Auto-generated method stub
	}
	/**
	 * Remove all entries from the map.
	 */
	@Override
	public void clear() {
		// impl.clear();
		// TODO Auto-generated method stub
	}
	/**
	 * @return the set of keys in the map
	 */
	@Override
	public Set<K> keySet() {
		// return impl.keySet();
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * @return the collection of values associated with keys in the map
	 */
	@Override
	public Collection<V> values() {
		// return impl.values();
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * @return the set of key-value entries in the map
	 */
	@Override
	public Set<java.util.Map.Entry<K, V>> entrySet() {
		// return impl.entrySet();
		// TODO Auto-generated method stub
		return null;
	}
}
