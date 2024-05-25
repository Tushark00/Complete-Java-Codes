package Threads.Garbagecollector;

public class TestGc {
//    @Override
    public void finalize()  {
        System.out.println("garbage collected");
    }

    public static void main(String[] args) {
        TestGc t1 = new TestGc();
        TestGc t2 = new TestGc();

        t1 = null;
        t2 = null;

        System.gc();
    }
}
