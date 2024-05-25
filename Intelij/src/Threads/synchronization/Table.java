package Threads.synchronization;

public class Table {
//    void printtable(int n){                 //not sync
  synchronized static void printtable(int n){    // sync
        for (int i=1;i<=5;i++){
            System.out.println(n*i);
            try {
                Thread.sleep(400);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
class MyThread1 extends Thread{
    Table t;

    MyThread1(Table t){
        this.t=t;
    }

    @Override
    public void run() {
//        super.run();
        t.printtable(5);
    }
}

class MyThread2 extends Thread{
    Table t;
    MyThread2(Table t){
        this.t=t;
    }

    @Override
    public void run() {
//        super.run();
        t.printtable(100);
    }
}
class TestSync{
    public static void main(String[] args) {
        Table obj =new Table();

        MyThread1 t1 =new MyThread1(obj);
        MyThread2 t2 =new MyThread2(obj);


//        WITH ANNONYMOUS CLASS

        final Table ob2 = new Table();

        Thread t3 = new Thread(){
            @Override
              public void run() {
//                super.run();
                ob2.printtable(7);
            }
        };

        Thread t4 = new Thread(){
            @Override
             public void run() {
//                super.run();
                ob2.printtable(12);
            }
        };
//        t1.setPriority(1);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
