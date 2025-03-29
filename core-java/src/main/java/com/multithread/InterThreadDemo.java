package com.multithread;

class BankCustomer {
    int balance = 4000;
    synchronized void withdraw(int amount) {
        System.out.println("A person goint to withdraw amount: "+amount);
        if(balance <= amount) {
            System.out.println("Insufficient balance. Request to deposit.");
            try{
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= amount;
            System.out.println("Withdrawn amount: "+amount);
            System.out.println("Balance: "+balance);
        }
    }
    synchronized void deposit(int amount) {
        System.out.println("A person going to deposit amount: "+amount);
        balance += amount;
        System.out.println("Deposited amount: "+amount);
        System.out.println("Balance: "+balance);
        notify();
    }
}

public class InterThreadDemo {
    public static void main(String[] args) {
        BankCustomer obj = new BankCustomer();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.withdraw(5000);
            }
        }, "T1");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.deposit(2000);
            }
        }, "T2");
        t1.start();
        t2.start();
    }
}
