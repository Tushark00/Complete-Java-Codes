package Threads;

public class Company {
    int n;
    boolean flag=false;
//    flag=false :chance: producer
//    flag=true :chance: consumer
    synchronized public void produceItem(int n) throws Exception{
        if (flag){
            wait();
        }
        this.n=n;
        System.out.println("produced : "+this.n);
        flag=true; //msg for consumer
        notify();
    }

    synchronized public int consumeItem() throws Exception{
        if (!flag){
            wait();
        }
        System.out.println("consumed : "+ this.n);
        flag=false; //msg for producer
        notify();
        return this.n;
    }
}

class Main{
    public static void main(String[] args) {
        Company c1= new Company();
        Producer p= new Producer(c1);
        Consumer c= new Consumer(c1);
        p.start();
        c.start();
    }
}
