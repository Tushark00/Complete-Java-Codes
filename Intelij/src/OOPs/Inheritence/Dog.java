package OOPs.Inheritence;

public class Dog extends Animal {

    public Dog(){
        super(20);
    }
    void bark(){
//        using super keyword
        System.out.println("color is from class a: "+super.color);
        System.out.println("barking from class b");
    }

}
