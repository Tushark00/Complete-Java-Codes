package Threads.ShutDownHook;

public class ShutDownHook extends Thread {

    @Override
    public void run() {
//        super.run();
        System.out.println("shut down hook task is completed....");
    }

}

class rest {
    public static void main(String[] args) {

        Runtime r= Runtime.getRuntime();       // class used for shutdown hook
        r.addShutdownHook(new ShutDownHook()); // my thread

        System.out.println("Now main sleep Press ctrl + c to exit");
        try {
            Thread.sleep(2000);

        }catch (Exception e){

        }
    }
}
