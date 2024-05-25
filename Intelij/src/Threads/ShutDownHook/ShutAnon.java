package Threads.ShutDownHook;

public class ShutAnon extends Thread{
    public static void main(String[] args) throws Exception{

        Runtime r = Runtime.getRuntime();

        r.addShutdownHook(new Thread(){
            @Override
            public void run() {
//                super.run();
                System.out.println("shutdown hoook task completed");
            }
        }
        );

        System.out.println("now main sleeping ctrl + c to exit ");
    try{Thread.sleep(2000);}catch(Exception e){}
    }
}
