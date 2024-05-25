package OOPs;

public class Cars {
    //Data

    String cName;
    String cColor;
    int cModel;
    int cPrice;

//    methods


    public void price(){
        System.out.println("price of "+ cName +" is "+cPrice);
    }

    public void detail(){
        System.out.println(cName+" is "+cModel+" model of color "+cColor +" And price is "+cPrice);
    }

//    initializing obj by methods
        void insert(int p ,String n,String c,int m){
        cPrice=p;
        cName=n;
        cColor=c;
        cModel=m;
        }
        void print(){
        System.out.println(cName+" is "+cModel+" model of color "+cColor +" And price is "+cPrice);
        }
}
