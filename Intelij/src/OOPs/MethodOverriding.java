package OOPs;

public class MethodOverriding {

//    method overridden as it is changed in child class
//    so will be called as overridden
    public void m1(){
        System.out.println("m1");
    }
    public static void main(String[] args) {
        Child c1 =new Child();
        c1.m1();
    }
}

class Child extends MethodOverriding {
    public void m1(){
//        here method overriding  is happen as we
//   have change the same method we made in child but redifined as per our need
        System.out.println("iam m1 of child");
    }

}
