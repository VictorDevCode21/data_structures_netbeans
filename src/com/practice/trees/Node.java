package com.practice.trees;

/**
 *
 * @author PC
 */
public class Node<T> {

    private Node sib;
    private Node son;
    private T data;

    public Node(T data) {
        this.data = data;
        this.sib = null;
        this.son = null;

    }

    public void addSon(Node newSon) {
        if (getSon() != null) {
            Node aux = getSon();
            Node sib = aux;

            while (aux != null) {
                sib = aux;
                aux = aux.getSib();
            }
            sib.setSib(newSon);

        } else {
            setSon(newSon);
        }

    }

    /**
     * @return the sib
     */
    public Node getSib() {
        return sib;
    }

    /**
     * @param sib the sib to set
     */
    public void setSib(Node sib) {
        this.sib = sib;
    }

    /**
     * @return the son
     */
    public Node getSon() {
        return son;
    }

    /**
     * @param son the son to set
     */
    public void setSon(Node son) {
        this.son = son;
    }

    /**
     * @return the data
     */
    public T getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(T data) {
        this.data = data;
    }

}
