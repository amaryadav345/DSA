package org.example;


public class LinkList {
    Node head;
   static   class Node{
        int data;
        Node next;

        Node(int d){
            data=d;
            next=null;
        }
    }

    public  LinkList insert (LinkList list,int n){

        Node x=new Node(n);
        if(list.head==null) {
            list.head = x;
            return list;
        }
         Node temp=list.head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=x;

        return list;
    }
    public static void printList(LinkList list){
        Node t=list.head;
        System.out.println("Link list output: ");
        while(t!=null){
            System.out.print(t.data+"->");
            t=t.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        LinkList ll=new LinkList();
        ll.insert(ll,1);
        ll.insert(ll,2);
        ll.insert(ll,3);

       printList(ll);
    }
}
