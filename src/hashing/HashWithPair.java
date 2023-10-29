package hashing;

import java.util.*;

public class HashWithPair {
    public static void main(String[] args) {
//        Pair<Integer, Integer> p = new Pair<>(1, 2);
        Map<Integer, ArrayList<Integer>> hm = new HashMap<>();
        ArrayList<Integer> l = null;
        l = new ArrayList<>();
        l.add(2);
        hm.put(1, l);

    }
}

class Pair<K, V>{
    final K key;
    final V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(key, pair.key) && Objects.equals(value, pair.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }


}