package org.example.queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue queue=new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println("front is "+queue.front());
        System.out.println("rear is "+queue.rear());

        System.out.println("Removing "+queue.front() );
        queue.dequeue();

        System.out.println("front is "+queue.front());
        System.out.println("rear is "+queue.rear());

        Node t=queue.head;
        System.out.print("Queue is -> ");
        while(t!=null){
            System.out.print(t.value+" ");
            t=t.next;
        }
        System.out.println("");
        System.out.println("End of queue");
    }
}
