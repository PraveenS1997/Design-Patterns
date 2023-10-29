package PrototypeAndRegistry.Registry;

public interface Registry<K, V> {
    V getPrototype(K key);
    void setPrototype(K key, V value);
}