package hashmap;

public interface MyMap<K, V> {
    void put(K key, V value);

    V getValue(K key);
    
    V remove(K key);

    int getSize();
    
    boolean isEmpty();
}
