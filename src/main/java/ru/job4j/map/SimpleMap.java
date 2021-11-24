package ru.job4j.map;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SimpleMap<K, V> implements Map<K, V> {

    private static final float LOAD_FACTOR = 0.75f;
    private int capacity = 8;
    private int count = 0;
    private int modCount = 0;

    private MapEntry<K, V>[] table = new MapEntry[capacity];

    @Override
    public boolean put(K key, V value) {
       if (count >= capacity * LOAD_FACTOR) {
           expand();
       }
        int index = indexFor((hash((key.hashCode()))));
       if (table[index] == null) {
           table[index] = new MapEntry<>(key, value);
           count++;
           modCount++;
           return true;
       }
       return false;
    }

    private int hash(int hashCode) {
        return hashCode * 16 ^ hashCode >> 13;
    }

    private int indexFor(int hash) {
        return hash & (capacity - 1);
    }

    private void expand() {
        capacity *= 2;
        MapEntry<K, V>[] temp = table;
        table = new MapEntry[capacity];
        for (int i = 0; i < capacity; i++) {
            if (temp[i] != null) {
                table[indexFor(hash(temp[i].key.hashCode()))] = temp[i];
            }
        }


    }

    @Override
    public V get(K key) {
        int index = indexFor((hash((key.hashCode()))));
        return table[index] != null && table[index].key.equals(key) ? table[index].value : null;
    }

    @Override
    public boolean remove(K key) {
        int index = indexFor((hash((key.hashCode()))));
        if (table[index] != null && table[index].key.equals(key)) {
            table[index] = null;
            count--;
            modCount++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Iterator iterator() {
        return new Iterator<>() {
            private int index = 0;
            private int iteratorPoint = 0;
            private final int expectedCountMod = modCount;

            @Override
            public boolean hasNext() {
                return iteratorPoint < count;
            }

            @Override
            public MapEntry<K, V> next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("Element no found!");
                }
                if (expectedCountMod != modCount) {
                    throw new ConcurrentModificationException("Wait, and try again!");
                }
                while (index < table.length && table[index] == null) {
                    index++;
                }
                iteratorPoint++;
                return table[index++];
            }
        };
    }

    private static class MapEntry<K, V> {

        K key;
        V value;

        public MapEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

    }

}