package com.mycompany.binarysearchtree;

import java.util.Stack;

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
    private class Node<T> {

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

        Node<T> newNode = new Node<>(addMe);

        Node<T> traverseTree = root;
        Node<T> trail = traverseTree;

        //case 1, the tree is empty
        if (root == null) {
            root = newNode;
            return true;
        }

        //case 2, the tree has data in it, just add a node to the tree
        while (traverseTree != null) {
            trail = traverseTree;

            if (traverseTree.nodeData.compareTo(addMe) == 0) {//No duplicates allowed in the tree
                return false;
            }
            if (traverseTree.nodeData.compareTo(addMe) < 0) {
                traverseTree = traverseTree.r;
            } else {
                traverseTree = traverseTree.l;
            }
        }

        if (trail.nodeData.compareTo(newNode.nodeData) < 0) {
            trail.r = newNode;
        } else {
            trail.l = newNode;
        }

        return false;
    }
    
    public void prefixTraversal(){
        prefixTraversal(root);
    } 
    
    private void prefixTraversal(Node<T> node){
        
        if(node != null){
            
            prefixTraversal(node.l);
            System.out.println(node.nodeData + " ");
            prefixTraversal(node.r);
            
            
        }
        
        
    }
    

    public Node<T> findLast(Node<T> n) {
        Node<T> findLast = n;
        findLast = findLast.r;

        Node<T> trail = findLast;

        while (trail != null) {
            findLast = trail;
            trail = trail.l;

        }
        return findLast;
    }
    
    public String toString(){
        
        Node<T> temp = root;
        Stack<Node<T>> s = new Stack<>();
        
        while(temp != null || !s.isEmpty()){
            
            if(temp != null){
                s.add(temp);
                temp = temp.l;
            } else {
                temp = s.pop();
                System.out.println(temp.nodeData + " ");
                temp = temp.r;
            }
            
            
            
        }
        return "";
    }

}
