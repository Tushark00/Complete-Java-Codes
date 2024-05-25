package OOPs.Accessmodifiers;

public class Private {
    private int data= 40;

    private Private(){
        //def constructor
    }
    private void msg(){
        System.out.println("message");
    }

}

class Test{
    public static void main(String[] args) {
//        Private obj= new Private();
//        obj.msg();
}
}
