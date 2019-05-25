package com.sda.algorytmy;

public interface MyList<E> {
    int size();
    boolean add(E e);
    boolean remove (int index);
    void ensureCapacity();
}
