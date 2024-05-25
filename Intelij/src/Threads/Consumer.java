package Threads;

public class Consumer extends Thread{

    Company c;

    Consumer(Company c){
        this.c=c;
    }

    @Override
    public void run() {
        while(true){
            try {
                this.c.consumeItem();
            } catch (Exception e) {

            }
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
    }
}
