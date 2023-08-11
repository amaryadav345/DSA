package org.example.tree;

public class TreeExample {
    public static void main(String[] args) {
        TreeNode t2=new TreeNode(20,null,null);
        TreeNode t3=new TreeNode(30,null,null);
        TreeNode t1=new TreeNode(10,t2,t3);
        Tree t=new Tree();
        t.printPreorder(t1);
    }
}
