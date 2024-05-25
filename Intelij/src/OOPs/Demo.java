package OOPs;

public class Demo {

    public static void main(String[]args){


    Student s3 = new Student();
    Student s4 = new Student();
    s3.sName="pawan";
    s3.studentId= 9;
    s3.sCity="dili";

    s4.sName="rinku";

//    s3.study();
//    s4.study();

    Cars s1= new Cars();

    s1.cPrice = 20000;
    s1.cModel = 2011;
    s1.cColor = "Red";
    s1.cName = "Swift";

//    s1.detail();
//    s1.price();

        Cars c1=new Cars();

        c1.insert(10000,"maruti","pink",2010);
        c1.print();

    }
}
