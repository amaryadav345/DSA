package org.example.Synchronization.AddSubSynchronize;

public class Substractor implements Runnable{

    private Count count;

     Substractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=1;i<=100000;i++) {
            synchronized (count)
            {
                count.value -= i;
            }
        }
    }
}
