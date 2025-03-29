package com.multithread;

class Table {
    public void printTable(int n) {
        synchronized (this) {
            for(int i=1;i<=5;i++) {
                System.out.println(n+" * "+i+" = "+n*i);
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
class MyTable1 extends Thread {
    Table t;
    MyTable1(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(5);
    }
}

class MyTable2 extends Thread {
    Table t;
    MyTable2(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(7);
    }
}

public class SynchronizedDemo {
    public static void main(String[] args) {
        Table obj = new Table();
        MyTable1 t1 = new MyTable1(obj);
        MyTable2 t2 = new MyTable2(obj);
        t1.start();
        t2.start();
    }
}
