package org.example.queue;

public class Queue {
    Node head = null;
    Node rear = null;

    void enqueue(int x) {
        Node nn = new Node(x);
        if (head == null) {
            head = nn;
            rear = nn;
        } else {
            rear.next = nn;
        }
        rear = nn;
    }

    void dequeue() {
        if (head == null)
            throw new NullPointerException("Queue is empty");
        else {
            head = head.next;
        }
    }

    int front() {
        if (head == null)
            throw new NullPointerException("Queue is empty");
        else return head.value;
    }

    int rear() {
        if (rear == null) throw new NullPointerException("Queue is empty");
        else return rear.value;
    }
}
