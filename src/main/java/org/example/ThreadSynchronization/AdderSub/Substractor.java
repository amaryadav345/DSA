package org.example.ThreadSynchronization.AdderSub;

public class Substractor implements Runnable{

    private Count count;

     Substractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=1;i<=100000;i++)
            count.value-=i;
    }
}
