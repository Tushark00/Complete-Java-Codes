package OOPs.Aggregation;

public class Demo {

    public static void main(String[] args) {

//        we are useing aggregation in this as a1 in emp e1
        Address a1= new Address("gzb","UP","india");
        Emp e1 =new Emp(1,"pawan",a1);

        e1.disp();

    }
}
