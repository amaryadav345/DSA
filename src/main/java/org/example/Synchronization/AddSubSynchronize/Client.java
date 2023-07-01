package org.example.Synchronization.AddSubSynchronize;

public class Client {
    public static void main(String[] args) throws Exception{
        // Synchronization issue.....gives wrong answer
        Count count=new Count();

        Adder add=new Adder(count);
        Substractor substractor=new Substractor(count);
        Thread t1=new Thread(add);
        Thread t2=new Thread(substractor);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final value is : "+count.value);
    }
}
