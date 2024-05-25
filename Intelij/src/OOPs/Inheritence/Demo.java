package OOPs.Inheritence;

public class Demo {

    public static void main(String[] args) {

//        single inheritence
        Dog d1 = new Dog();
        System.out.println("######single inheritence");
        d1.eat();
        d1.bark();

//        multilevel inheritence
        Puppy p1 =new Puppy();
        System.out.println("########this is multilevel inheritence");
        p1.eat();
        p1.bark();
        p1.poop();

//         hierarchical inheritence
        Cat c1=new Cat();
        Dog d2=new Dog();
        System.out.println("######hierarchical inheritence");

        c1.eat();
        c1.meow();
        d2.eat();
        d2.bark();

    }
}
