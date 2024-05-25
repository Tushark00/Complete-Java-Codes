package OOPs.Polymorphism;

public class Overloading {

    public void read(){
        System.out.println("method without argument");
        System.out.println("reading");
    }
//    overloading happen when name is same but argument is diff
    public void read(String r){
        System.out.println("##### method with argument");
        System.out.println("reading: "+r);

    }

}

