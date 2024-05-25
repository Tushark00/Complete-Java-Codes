package Threads;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadPool implements Runnable{

   private String taskName;

   public ThreadPool(String str){  //constructor
       taskName=str;
   }

    @Override
    public void run() {         //run method
        try {
            for (int i =0;i<=5;i++){
//                    System.out.println("loop number :"+i);
                if (i==0){
                    Date dt =new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("hh : mm : ss");

                    System.out.println("initialize time for task: "+taskName+" = "+sdf.format(dt));
                }
                else {
                    Date dt =new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("hh : mm : ss");
                    System.out.println("time for execution for the task: "+taskName+" = "+sdf.format(dt));

                }
                Thread.sleep(1000);
            }
            System.out.println(taskName+" is completed...");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class ThreadPoolEx {
    static final int MAX_TH=3;               // maximum thread can be 3 in thpool

    public static void main(String[] args) { // i am creating 5 thread to check
        Runnable r1 =new ThreadPool("task 1");
        Runnable r2 =new ThreadPool("task 2");
        Runnable r3 =new ThreadPool("task 3");
        Runnable r4 =new ThreadPool("task 4");
        Runnable r5 =new ThreadPool("task 5");

        //creating threadpool of max_th size
        ExecutorService p = Executors.newFixedThreadPool(MAX_TH);

        //passing task obj to the pool to execute
        p.execute(r1);
        p.execute(r2);
        p.execute(r3);
        p.execute(r4);
        p.execute(r5);

        //pool is shut down
        p.shutdown();
    }
}