package com.multithread;

class Product implements Runnable{
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName()+" Product is running.");
        try{
            for(int i=0;i<5;i++) {
                System.out.println(t.getName()+" Product is printing. "+(i+1)+" time/sec.");
            }
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.getName()+" Product is finished.");
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        t.setName("RCB");
        System.out.println(t.getName()+" Main Thread is started.");
        Product p1 = new Product();
        Product p2 = new Product();
        Thread t1 = new Thread(p1, "Dell");
        Thread t2 = new Thread(p2, "Hp");
        t1.start();
        t2.start();
        try{
           t1.join();
           t2.join();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.getName()+" Main Thread is finished.");
    }
}
