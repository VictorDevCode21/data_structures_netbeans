package com.practice.queues;

import com.practice.nodes.LinkedList;
import com.practice.lists.Person;

/**
 *
 * @author PC
 */


/**
 * A generic Queue implementation using a LinkedList.
 *
 * @param <T> the type of elements in the queue
 */

public class Queue<T> {
    private LinkedList<T> linkedList;

    /**
     * Constructs an empty Queue.
     */
    public Queue() {
        this.linkedList = new LinkedList<>();
    }

    /**
     * Adds an element to the end of the queue.
     *
     * @param value the element to add
     */
    public void enqueue(T value) {
        linkedList.add(value);
    }

    /**
     * Removes and returns the element at the front of the queue.
     *
     * @return the element removed
     * @throws IllegalStateException if the queue is empty
     */
    public T dequeue() {
        return linkedList.removeFirst();
    }

    /**
     * Returns the element at the front of the queue without removing it.
     *
     * @return the front element
     * @throws IllegalStateException if the queue is empty
     */
    public T peek() {
        return linkedList.getFirst();
    }

    /**
     * Returns true if the queue is empty, false otherwise.
     *
     * @return true if the queue is empty; false otherwise
     */
    public boolean isEmpty() {
        return linkedList.getSize() == 0;
    }

    /**
     * Returns the number of elements in the queue.
     *
     * @return the size of the queue
     */
    public int size() {
        return linkedList.getSize();
    }

    /**
     * Prints the contents of the queue from front to back.
     */
    public void printQueue() {
        linkedList.print();
    }

}
