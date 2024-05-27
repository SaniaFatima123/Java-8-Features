package org.example;

public class Thread1 extends Thread{
    Thread1(String threadName){
        super(threadName);
    }
    public void run(){
//       if(this.isDaemon()){
//           System.out.println("Daemon");
//       }
//       else{
//           System.out.println("user");
//       }

        try{
            for (int i = 0; i < 5; i++) {
                System.out.println("Inside thread 1 " + getName()+" "+ isDaemon());
                sleep(1000);
            }
        }
        catch (InterruptedException e){
            System.out.println("exception occurred inside Thread 1");
        }
    }
}
