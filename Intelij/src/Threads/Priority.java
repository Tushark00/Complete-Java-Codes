package Threads;

public class Priority extends Thread{

    @Override
    public void run() {
//        super.run();
//        System.out.println("hello" + currentThread().getName());
        System.out.println("hi "+currentThread().getName());

        try{

        Thread.sleep(1000);
            System.out.println("name: "+currentThread().getName()+" has priority "+currentThread().getPriority());
        }catch(Exception e){};


}
}
class test{
    public static void main(String[] args) {

    Priority ob1= new Priority();
    Priority ob2= new Priority();
    Priority ob3= new Priority();

    ob3.setPriority(8);
    ob3.setName("ob3");
    ob1.setName("ob1");
    ob2.setName("ob2");
    ob2.setPriority(10);
    ob1.start();
    ob2.start();
    ob3.start();

    }
}


