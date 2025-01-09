package com.practice.trees;

/**
 *
 * @author PC
 */
public class Tree<T> {
    
    private Node root;
    
    public Tree() {
        
        this.root = null;
    }
    
    public boolean isEmpty() {
        return getRoot() == null;
    }
    
    public void create(T data) {
        Node newNode = new Node(data);
        setRoot(newNode);
    }
    
    public void insert(T data, Node parent) {
        Node newNode = new Node(data);
        if (!isEmpty()) {
            parent.addSon(newNode);
        }
    }

    /**
     * @return the root
     */
    public Node getRoot() {
        return root;
    }

    /**
     * @param root the root to set
     */
    public void setRoot(Node root) {
        this.root = root;
    }
    
}
