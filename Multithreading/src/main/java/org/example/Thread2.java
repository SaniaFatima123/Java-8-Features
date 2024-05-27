package org.example;

public class Thread2 extends Thread{
    Thread2(String threadName){
        super(threadName);
    }
    public void run(){
        try{
            for (int i = 0; i < 5; i++) {
                System.out.println("Inside thread 2 " + getName()+" "+ isDaemon());
                sleep(2000);
            }
        }
        catch (InterruptedException e){
            System.out.println("exception occurred inside Thread 2");
        }
    }
}
