package Threads;

class MyThread implements Runnable {

    public void run(){

        for (int i=0;i<=10;i++) {
            System.out.println("value of i : " + i);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public static void main(String[] args) {

        MyThread t1=new MyThread();

        Thread th1= new Thread(t1);

        th1.start();

        MyNewThread t2=new MyNewThread();
        t2.start();
    }
}
