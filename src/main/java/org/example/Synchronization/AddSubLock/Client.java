package org.example.Synchronization.AddSubLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws Exception{
        //After applying lock this is giving correct value
        Count count=new Count();
        Lock lock=new ReentrantLock();
        Adder add=new Adder(count,lock);
        Substractor substractor=new Substractor(count,lock);
        Thread t1=new Thread(add);
        Thread t2=new Thread(substractor);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final value is : "+count.value);
    }
}
