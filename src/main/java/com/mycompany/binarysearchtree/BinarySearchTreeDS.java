package com.mycompany.binarysearchtree;

/**
 *
 * @author nicka
 * @param <T>
 */
public class BinarySearchTreeDS<T extends Comparable<T>> {

    /**
     * anonymous inner class, it makes the node that is added to the BST
     *
     * @param <T>
     */
    class Node<T> {

        T nodeData;//actual data in the node
        Node<T> l;//left pointer
        Node<T> r;//right pointer

        public Node(T nodeData) {
            this.nodeData = nodeData;//set the data
            l = null;//point l and r to null
            r = null;
        }

    }

    private Node<T> root;//the tree will always have a root, no matter what

    /**
     * default constructor, will initialize the root to null (the tree is
     * initially empty).
     */
    public BinarySearchTreeDS() {
        root = null;
    }

    /**
     * add method, will add addMe into the BST, checks if addMe is greater or
     * less than the current node to traverse the tree to find its place
     *
     * @param addMe
     * @return
     */
    public boolean add(T addMe) {
        return false;
    }
    
    public Node<T> findLast(T findMe){
        
    }

}
