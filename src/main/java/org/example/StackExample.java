package org.example;


public class StackExample {
    public static void main(String[] args) {
        Stackk stk=new Stackk();
        stk.push(10);
        stk.push(20);
        stk.push(30);
        if(!stk.isEmpty())
            stk.pop();
        System.out.println("TOP is: "+stk.top());

        stk.printStack();
        System.out.println();

        //Own implementation of stack loop;
        ListNode x=stk.head;
        for(int i=0;i<stk.size();i++){
                System.out.print(x.val+" ");
                x=x.next;
        }
    }

    static class ListNode{
        int val;
        ListNode next;

        ListNode(int data){
            val=data;
            next=null;
        }
    }

    static  class Stackk{
        ListNode head=null;

        void push(int x){
            ListNode nn=new ListNode(x);
            nn.next=head;
            head=nn;
        }
        void pop(){
            head=head.next;
        }
        boolean isEmpty(){

            return head==null;
        }

        int top(){
            return head.val;
        }
        int size(){
            ListNode t=head;
            int c=0;
            while(t!=null){
                c++;
                t=t.next;
            }
            return c;
        }
        void printStack(){
            ListNode t=head;

            while(t!=null){
                System.out.print(t.val+" ");
                t=t.next;
            }

        }
    }
}
