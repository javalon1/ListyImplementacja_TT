package com.sda.algorytmy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ListImpl<E> implements MyList<E> {

    private int size = 0;
    private int DEFAULT_CAPACITY = 10;
    private  Object elementData[];

    public ListImpl(){
        elementData = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean add(E e) {
        if(size<DEFAULT_CAPACITY)
        {elementData[size++]=e;}
        else
        {
            ensureCapacity();
            elementData[size++]=e;
        }
        return false;
    }

    @Override
    public boolean remove(int index) {
        for(int i = index; i<elementData.length-1; i++ ){
            elementData[i]=elementData[i+1];
        }
        elementData[elementData.length-1]=null;

        return false;
    }

    @Override
    public void ensureCapacity() {
        DEFAULT_CAPACITY=this.DEFAULT_CAPACITY*2;
        elementData= Arrays.copyOf(elementData,DEFAULT_CAPACITY);
    }
}
