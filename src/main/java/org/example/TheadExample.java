package org.example;

public class TheadExample {
    public static void main(String[] args) {
        System.out.println("main class--> "+Thread.currentThread().getName());
        for(int i=1;i<=100;i++) {

        NumPrinter num=new NumPrinter(i);
        Thread t=new Thread(num);
        t.start();
        }
    }

    static class NumPrinter implements  Runnable{
        int number;
        public NumPrinter(int number){
            this.number=number;
        }
        @Override
        public void run(){
            System.out.println(number+" "+Thread.currentThread().getName());
        }

    }
}
