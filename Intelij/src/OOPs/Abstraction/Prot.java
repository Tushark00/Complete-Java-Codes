package OOPs.Abstraction;
import OOPs.Accessmodifiers.Protected;
public class Prot extends Protected{
    public static void main(String[] args) {
//        Protected p = new Protected();
//        p.msg()
//testing protected class from outside package
        Prot p1 = new Prot();
        p1.msg();
    }

}
