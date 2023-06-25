package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExecutor {
    public static void main(String[] args) {
        System.out.println("main class -- "+Thread.currentThread().getName());
        //ExecutorService executorService= Executors.newFixedThreadPool(10);
        ExecutorService executorService= Executors.newCachedThreadPool();
      //  long start = System.currentTimeMillis();
        for(int i=1;i<=100;i++){
            PrintNums printNums=new PrintNums(i);
            executorService.execute(printNums);
        }
        executorService.shutdown();

    }

    static class PrintNums implements Runnable{
        int number;

        public PrintNums(int number){
            this.number=number;
        }

        @Override
        public void run(){
            System.out.println(number+" -- "+Thread.currentThread().getName());
        }

    }
}
