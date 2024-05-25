package Threads.synchronization;

class Sender{
    public void recieve(String msg){
        System.out.println("\n sending a msg "+msg);
        try {
            Thread.sleep(800);
        }catch (Exception e){
            System.out.println("thread interrupt");
        }
        System.out.println("\n"+ msg +"Sent");
    }
}

class SenderThread extends Thread{
    private String msg;
    Sender sd;

    SenderThread(String m,Sender ob){
        msg=m;
        sd=ob;

    }

    @Override
    public void run() {
//        super.run();
        synchronized (sd){
            sd.recieve(msg);
        }
    }
}

public class SyncBlock {
    public static void main(String[] args) {
        Sender s =new Sender();

        SenderThread s1 =new SenderThread("hi ",s);

        SenderThread s2 =new SenderThread("welcome to mycode ", s);

        s1.start();
        s2.start();

        try {
            s1.join();
            s2.join();
        }catch (Exception e){
            System.out.println("Interrupted");
        }
    }
}

