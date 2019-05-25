package com.sda.algorytmy;

public class LinkedListImpl<E> implements MyList <E> {

    private Node head;
    private int size = 0;

    public LinkedListImpl(){

    }



    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean add(E e) {
        if (size == 0){
            head = new Node(e);
        }
        else {
            Node tmp = head;
            head = new Node(e);
            head.next = tmp;
        }
        return false;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public void ensureCapacity() {
    }

    @Override
    public String toString() {
        return "LinkedListImpl{" +
                "head=" + head +
                ", size=" + size +
                '}';
    }

    class Node{
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }
        public Object getData(){
            return data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "next=" + next +
                    ", data=" + data +
                    '}';
        }
    }
}
