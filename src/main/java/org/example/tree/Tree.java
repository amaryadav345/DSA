package org.example.tree;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

public class Tree {
    TreeNode treeNode=null;

    void insert(int val,TreeNode left,TreeNode right){
        treeNode.value=val;
        treeNode.left=left;
        treeNode.right=right;
    }

    int height(TreeNode node){
        if(node==null) return 0;
        int h1=height(node.left);
        int h2=height(node.right);
        return Math.max(h1,h2);
    }

    void printPreorder(TreeNode node){
        /// DLR
        if(node==null ) return;
        System.out.println(node.value+" ");
        printPreorder(node.left);
        printPreorder(node.right);
    }
    void inOrder(TreeNode node){
        /// L D R
        if(node==null ) return;
        System.out.println(node.value+" ");
        printPreorder(node.left);
        printPreorder(node.right);
    }


}
