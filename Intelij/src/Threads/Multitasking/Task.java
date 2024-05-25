package Threads.Multitasking;

import java.util.TreeMap;

class Task extends Thread{
    @Override
    public void run() {
//        super.run();
        System.out.println("task one");
    }

}
class Task2 extends Thread{
    @Override
    public void run() {
//        super.run();
        System.out.println("task two");
    }
}

class multitask{
    public static void main(String[] args) {
        Task t1 = new Task();
        Task2 t2 = new Task2();

        t1.start();
        t2.start();

//        by using anonymous class

        Thread t3 =new Thread(){
            @Override
            public void run() {
//                super.run();
                System.out.println("taskkk 3");
            }
        };
        t3.start();


//        by using runnable
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("task 4");
            }
        };

        Thread t4 = new Thread(r1);
        t4.start();
    }
}
