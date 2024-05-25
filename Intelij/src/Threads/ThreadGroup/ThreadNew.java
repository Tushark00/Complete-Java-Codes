package Threads.ThreadGroup;

public class ThreadNew extends Thread{

    ThreadNew(String tname,ThreadGroup tgrp){
        super(tgrp,tname);
        start();
    }

    @Override
    public void run() {

        for (int i=0; i<1000;i++){
            try {
                Thread.sleep(5);
//                System.out.println("heelo");
            }catch (Exception e){
                System.out.println("the exception has been encoutered "+e);

            }
        }
    }
}
class ActiveCountEx{
    public static void main(String[] args) {

        ThreadGroup tg =new ThreadGroup("The Parent Group");

        ThreadGroup tg1 = new ThreadGroup(tg,"Child group");

        ThreadNew th1=new ThreadNew("first",tg);
        System.out.println("starting the first");

        ThreadNew th2=new ThreadNew("second",tg);
        System.out.println("starting the second");

//        try{
//
//        th1.join();
//        th2.join();
//        }catch (Exception e){}

//        tg1.destroy();
//        System.out.println( tg1.getName()+" is destroyed");

//        tg.destroy();
//        System.out.println(tg.getName()+" is destroyed");
       //active thread count
        System.out.println("the total num of active threads are "+ tg.activeCount());

        //active group
        System.out.println("total active groups are "+tg.activeGroupCount());


        // enumeration
//        Thread[] grp = new Thread[tg.activeCount()];
//        int count = tg.enumerate(grp);
//        for(int j=0;j<count;j++){
//            System.out.println("Thread "+ grp[j].getName()+" is found. ");
//        }

        //max priority
//        int priority=tg.getMaxPriority();
//        System.out.println("the max priority is: "+ priority);

        //threadgroup get parent

        System.out.println("the parent of :"+tg.getName()+" is "+tg.getParent().getName());
        System.out.println("the parent of :"+tg1.getName()+" is "+tg1.getParent().getName());


        //interrupt
//        tg.interrupt();     //exception caught


        //  isdeamon method
//        if(tg.isDaemon()==true){
//            System.out.println("the group is deamon");
//        }else{
//
//            System.out.println("the group is  not deamon");
//        }

        // destroyed

//        if(tg.isDestroyed()==true){
//            System.out.println("the group has been destroyed");
//        }
//          else  System.out.println("the group has not been destroyed");
    }
}

