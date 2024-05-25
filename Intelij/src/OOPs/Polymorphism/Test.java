package OOPs.Polymorphism;

public class Test {

    public static void main(String[] args) {

//    Overloading ob1 = new Overloading();
//    ob1.read();
//    ob1.read("hindi ki book");
//    ob1.read("maths ki book");

//        Overriding ob2 = new Overriding();
//        ob2.details();

//        here at runtime poly  decision is based on  #new Child();
//        from where the obj is called form
        Overriding ob3 = new Child();
        ob3.details();
    }


}
