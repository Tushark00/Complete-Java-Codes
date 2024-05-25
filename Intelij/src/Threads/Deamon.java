package Threads;

public class Deamon extends Thread{

    @Override
    public void run() {
//        super.run();
        System.out.println("me hu : "+currentThread().getName());
        if(currentThread().isDaemon()){
            System.out.println("deamon works");
        }
    }
}
class test1{
    public static void main(String[] args) {

    Deamon ob1=new Deamon();
    Deamon ob2=new Deamon();

    ob1.setDaemon(true);
    ob1.setPriority(10);
    ob1.start();
    ob2.start();


    }

}
