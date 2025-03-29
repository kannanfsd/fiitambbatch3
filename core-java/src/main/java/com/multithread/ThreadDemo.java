package com.multithread;

class Customer extends Thread {
    public Customer(String name){
        setName(name);
        System.out.println(getName()+" thread is activated.");
    }
    public void run() {
        System.out.println(getName()+" thread is running.");
        for(int i=0;i<5;i++) {
            try {
                System.out.println(getName()+" thread is printing. "+(i+1)+" time/sec.");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(getName()+" thread is finished.");
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println("Main Thread is started.");
        Thread t = Thread.currentThread();
        t.setName("CSK");
        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t.isAlive());
        System.out.println("Name: "+t.getName());
        System.out.println("Priority: "+t.getPriority());
        Customer obj1 = new Customer("Stanford");
        obj1.start();
        Customer obj2 = new Customer("Ohio");
        obj2.start();
        System.out.println("Main Thread is finished.");
    }
}
