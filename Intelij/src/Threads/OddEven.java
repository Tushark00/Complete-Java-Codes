package Threads;

public class OddEven {
    int contr =1;
    static int NUM;

    public void DispEven(){
        synchronized (this){
            while (contr<NUM){
                while (contr%2==0){
                    try {
                        wait(1000);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
                System.out.print(contr+" "); //printing num
                contr+=1;
                notify();
            }
        }
    }

    public void DispOdd(){
        synchronized (this){
            while (contr<NUM){
                while (contr%2!=0){
                    try{
                        wait(1000);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
                System.out.print(contr+" ");
                contr+=1;
                notify();
            }
        }
    }

    public static void main(String[] args) {
        NUM=20;
        OddEven oe = new OddEven();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                oe.DispEven();
            }
        });
        Thread t2= new Thread(new Runnable() {
            @Override
            public void run() {
                oe.DispOdd();
            }
        });

        t1.start();
        t2.start();
    }

}
