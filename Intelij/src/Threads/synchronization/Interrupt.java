package Threads.synchronization;

public class Interrupt extends Thread{
    @Override
    public void run() {
//        super.run();
        try {
            Thread.sleep(1000);
            System.out.println("task");
        }catch (InterruptedException e){
//            throw new RuntimeException("thread interrupted ...."+e);
            System.out.println("exp handled "+ e);
        }
        System.out.println("thread is running");
    }

    public static void main(String[] args) {
        Interrupt obj =new Interrupt();

        obj.start();
        try {
            obj.interrupt();
        }catch (Exception e){
            System.out.println("Excp handled"+e);
        }
    }
}
