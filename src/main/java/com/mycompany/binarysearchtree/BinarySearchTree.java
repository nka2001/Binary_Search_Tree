package com.mycompany.binarysearchtree;

/**
 *
 * @author nicka
 */
public class BinarySearchTree {

    public static void main(String[] args) {

        BinarySearchTreeDS bst = new BinarySearchTreeDS();
        bst.add("30");
        bst.add("50");
        bst.add("15");
        bst.add("20");
        bst.add("10");
        bst.add("40");
        bst.add("60");
        

        bst.toString();//will print out the tree in order
        System.out.println("-------------------------------");
       
        bst.prefixTraversal();
        
        System.out.println("-------------------------------");
        
        bst.add("5");
        bst.add("12");
        
        bst.prefixTraversal();


    }
}
