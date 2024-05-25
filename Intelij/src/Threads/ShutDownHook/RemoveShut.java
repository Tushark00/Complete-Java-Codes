package Threads.ShutDownHook;


public class RemoveShut {
static class Msg extends Thread{
        @Override
    public void run() {
//        super.run();
        System.out.println("bye");

    }
}
public static void main(String[] args) {

    try {
        Msg rs =new Msg();                        //created an obj

        Runtime.getRuntime().addShutdownHook(rs); // registered the Msg class obj as the shutdown hook

        System.out.println("the prog is running");  // printing the current state

        System.out.println("waiting for 2sec");
        Thread.sleep(2000);                   // sleeping the thread

        System.out.println("the prog is ending");   // print termination
    }
    catch (Exception e){
        e.printStackTrace();
    }
}
}

