package com.practice.nodes;



public class DoubleLinkedList {
    private DoubleNode first;
    private DoubleNode last;
    private int size;

    public DoubleLinkedList() {
        first = null;
        last = null;
        size = 0;
    }

    public int getSize() {
        return this.size;
    }

    public void add(int value) {
        DoubleNode node = new DoubleNode(value);

        if (size == 0) { // Empty List
            first = node;
            last = node;
        } else { // Not Empty List
            last.setNext(node);
            node.setPrev(last);
            last = node;

        }
        size ++;
    }

    public void add(int ...values) {
        for (int value : values) {
            add(value);
        }
    }

    public void print() {
        DoubleNode node = first;
        String s = "";

        while (node != null) {
            s += "<-" + node.getValue() + "->";
            node = node.getNext();
        }

        System.out.println(s + "\b\b");

    }

}
