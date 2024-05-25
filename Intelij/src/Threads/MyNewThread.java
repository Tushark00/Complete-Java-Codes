package Threads;

public class MyNewThread extends Thread{

    @Override
    public void run() {

    for(int i=10;i>=0;i--){
        System.out.println("value of i is :"+i);

        try {
            Thread.sleep(1500);
        }catch (Exception e){
            System.out.println("hahahah");
        }
    }

    }

}
