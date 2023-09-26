package main.java.hash;

public class MyLinkedHashTable<K, V> implements IHashTable<K, V> {


    @Override
    public void put(K key, V value) {

    }

    @Override
    public V get(K key) {
        return null;
    }

    @Override
    public boolean delete(K key) {
        return false;
    }

    @Override
    public boolean contains(K key) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    private class Node {
        K key;
        V data;

        Node(K key, V data) {
            this.key = key;
            this.data = data;
        }
    }
}
