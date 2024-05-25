package Threads.ThreadGroup;

public class GroupDemo implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        GroupDemo runnable = new GroupDemo();
        ThreadGroup tg1 =new ThreadGroup("Parent Thread Group");

        Thread t1 = new Thread(tg1,runnable,"one");
        t1.start();
        Thread t2 = new Thread(tg1,runnable,"two");
        t2.start();
        Thread t3 = new Thread(tg1,runnable,"three");
        t3.start();

        System.out.println("Thread group Name: "+tg1.getName());
        tg1.list();
    }
}
