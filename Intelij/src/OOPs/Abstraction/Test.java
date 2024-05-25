package OOPs.Abstraction;

//import OOPs.Accessmodifiers.Default;

public class Test {

    public static void main(String[] args) {

//        MyClass m1=  new MyChild();
//        m1.launchRocket(); // it will call method body from child class
//        m1.call();         // its body is in myClass

        MyChild m2 = new MyChild();
        m2.call();          //it will call this function through inerheritence
        m2.launchRocket();  // it is in child class body

//  checking default access specifier
//        Default d= new Default();
//        d.msg();



    }
}
