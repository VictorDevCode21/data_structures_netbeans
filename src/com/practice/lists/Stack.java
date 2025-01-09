package com.practice.lists;

import com.practice.nodes.LinkedList;

/**
 *
 * @author PC
 */
public class Stack<T> {

    private LinkedList linkedList;

    public Stack() {
        this.linkedList = new LinkedList<>();
    }

    /**
     * Pushes an element onto the top of the stack.
     *
     * @param value the element to push
     */
    public void push(T value) {
        linkedList.addFirst(value);
    }

    /**
     * Removes and returns the element at the top of the stack.
     *
     * @return the element removed
     * @throws IllegalStateException if the stack is empty
     */
    public T pop() {
        return (T) linkedList.removeFirst();

    }

    /**
     * Returns the element at the top of the stack without removing it.
     *
     * @return the top element
     * @throws IllegalStateException if the stack is empty
     */
    public T peek() {
        return (T) linkedList.getFirst();
    }

    /**
     * Returns true if the stack is empty, false otherwise.
     *
     * @return true if the stack is empty; false otherwise
     */
    public boolean isEmpty() {
        return linkedList.getSize() == 0;
    }

    /**
     * Returns the number of elements in the stack.
     *
     * @return the size of the stack
     */
    public int size() {
        return linkedList.getSize();
    }

    /**
     * Prints the contents of the stack from top to bottom.
     */
    public void printStack() {
        linkedList.print();
    }

    // Practice Exercise
    public boolean isHat(Stack P, Stack Q) {
        if (P.size() > Q.size()) {
            if (P.size() == 0) {
                return true;
            }
            
            
            
            

        }

        return false;
    }

}
