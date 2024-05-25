package OOPs;

public class Bank {

//    default constructor
    Bank(){
//        System.out.println("        bank is created");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$");
    }

//    parametrized constructor
//    this keyword is used to call class bank properties with the same name local variable
//            to eliminate confusion
    public Bank(int acc,int amt,String name){
//        3) this() : to invoke current class constructor
        this();
        this.acc=acc;
        this.balance=amt;
        this.name=name;
        System.out.println("acc: "+this.acc);
        System.out.println("name: "+this.name);
        System.out.println("bal: "+this.balance);
    }

//    constructor overloading
//    Bank(){}
    public Bank(int acc,String name){
        this.acc=acc;
        this.name=name;
        System.out.println("acc: "+ acc);
        System.out.println("name: "+ name);
        System.out.println("bal: "+balance);
    }
//    copy constructor
    public Bank(Bank p1){
        this.name= p1.name;
        acc= p1.acc;
        System.out.println("###########################");
        System.out.println("this is a copy const");
        System.out.println("s3acc: "+ this.acc);
        System.out.println("s3name: "+this.name);

    }

    int acc;
    int balance;
    String name;


//    methods
    void insert(int amt,int acc,String n){
        this.acc=acc;
        name=n;
        balance+=amt;

//        2) this: to invoke current class method
        this.dis();
//        System.out.println("Bank acc opened");
//        System.out.println("AccNo: "+acc);
//        System.out.println("name: "+name);
//        System.out.println("Bal: "+balance);
//        System.out.println("*************************");

    }

    void deposit(int a){
        balance+=a;
        System.out.println("amount deposited");
//        System.out.println("bal: "+balance);
        this.dis();
        System.out.println("*************************");
    }

    void withdraw(int a){
        if (balance>a){

        balance-=a;
        System.out.println("amount withdrawn");
        System.out.println("present bal :"+balance);
        System.out.println("*************************");
        }else System.out.println("insufficient balance");
    }

    void dis(){
//        System.out.println("p4 name: "+name);
        System.out.println("*************************");
        System.out.println("Bank acc opened");
        System.out.println("AccNo: "+acc);
        System.out.println("name: "+name);
        System.out.println("Bal: "+balance);
        System.out.println("*************************");
    }

    public static void main(String[] args) {
//      parametrized constructor called
        Bank p1= new Bank(1,200,"pawan");
//        constructor overloading
//        Bank p1= new Bank(1,"pawan");

        p1.insert(1000,1,"tushar");
        p1.deposit(200);
        p1.withdraw(50);

//        def constructor called
        Bank p2= new Bank();

        p2.insert(2000,2,"papa");
        p2.deposit(3000);
        p2.withdraw(27890);

        Bank p3= new Bank(p1);
//        p3.withdraw();

        Bank p4= new Bank();
        p4.name= p2.name;
        p4.dis();
    }



}
