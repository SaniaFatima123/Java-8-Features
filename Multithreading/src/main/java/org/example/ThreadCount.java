package org.example;

public class ThreadCount extends Thread{
    ThreadCount(){
        super("Overriding Thread class");
        System.out.println("new thread created"+this);
        start();
    }
    public void run(){
        try{
            for(int i=0; i<10; i++) {
                System.out.println("New Thread Created" + this);
                sleep(1500);
            }
        }
        catch (InterruptedException e){
            System.out.println("Exception occurred");
        }
        System.out.println("Thread terminating");
    }
}

class Multithreading{
    public static void main(String[] args) {
        ThreadCount count = new ThreadCount();
        try {
            if (count.isAlive()) {
                System.out.println("Main method thread will be alive until child thread is alive");
                System.out.println("************** "+Thread.currentThread().getName());
                Thread.sleep(2500);

            }
        }
        catch (InterruptedException e){
            System.out.println("Exception occurred in main method");
        }
        System.out.println("Main Method thread terminated");
    }
}
