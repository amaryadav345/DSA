package org.example;
//using ListNode for other way of link list;
public class LLTest {

    static ListNode insert(ListNode list,int data){
        ListNode x=new ListNode(data);
        if(list==null){
            list=x;
            return  list;
        }

        ListNode ll=list;
        while(ll.next!=null){
            ll=ll.next;
        }
        ll.next=x;
        return  list;
    }
    static void printList(ListNode list){
        while(list!=null){
            System.out.print(list.data+" ");
            list=list.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode newList=new ListNode(1);
        //insert(newList,1);
        insert(newList,2);
        insert(newList,3);
        printList(newList);
    }
}
