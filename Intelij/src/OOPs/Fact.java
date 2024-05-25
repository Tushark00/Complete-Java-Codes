package OOPs;

public class Fact {

//in this program we are using anonymous object *********************

    void fac(int f){

        int n=1;

        for(int i=1;i<=f;i++){
            n*=i;

        }
        System.out.println("factorial is " + n);
    }
    public static void main (String[]args){
        new Fact().fac(5);
    }
}
