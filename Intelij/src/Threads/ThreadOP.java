package Threads;

import java.util.SortedMap;

public class ThreadOP extends Thread{

    @Override
    public void run() {
//        super.run();
        System.out.println("this is user defined thread.");
    }
}

class ThreadFunc{

    public static void main(String[] args) {
        System.out.println("threads are starting....");
        int x=20+30;
        System.out.println("val of x:"+x);

       Thread t =Thread.currentThread();
       String tname=t.getName();
        System.out.println("name of currThread : "+tname);
//        or
//        System.out.println(Thread.currentThread().getName());

//        set new name thread
        t.setName("new thread");
        System.out.println(t.getName());

//        sleep method
        try {

        Thread.sleep(4000);
        }
        catch(Exception e){

        }

//        id method
        System.out.println(t.getId());



        System.out.println("thread are ending....");
//        user def thread
        ThreadOP t2 = new ThreadOP();
        t2.start();
    }
}

//setname
//getname
//sleep
//user def thread
//getid
//start

