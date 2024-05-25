package OOPs.Abstraction;

//parent class
public interface Shape {

    int i = 30;
    void calArea(int r);

}

//implementation abstract class
class  Circle implements Shape{

//    @Override
    public void calArea(int r) {
        System.out.println("area of circle: "+ (Math.PI * r * r) );

    }
//main func
    public static void main(String[] args) {
//        using interface class for obj
//  This line creates an object ob1 of type Shape and
//  initializes it with a new instance of the Circle class.
//  Since Circle implements the Shape interface, it can be assigned
//  to a variable of type Shape.

        Shape ob1= new Circle();
        ob1.calArea(2);
    }
}

