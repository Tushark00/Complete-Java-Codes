package OOPs;

class Student
{
    //data members: instance variable
    int studentId;
    String sName;
    String sCity;

//    behavior : member methods : methods :(fuctions)

    public void study(){
        System.out.println(sName+" is studying ");
    }

    public void details(){
        System.out.println("name is "+ sName);
        System.out.println("Id is "+ studentId);
        System.out.println("city is "+ sCity);
    }

        public static void main(String[]args){
//            creating obj of student
            Student s1;
            Student s2;
            s1 = new Student();
            s2 = new Student();

//          obj1

            s1.sName= "Tushar";
            s1.studentId = 1;
            s1.sCity = "Delhi";

//            obj2
            s2.sName ="papu";
            s2.studentId = 2;
            s2.sCity = "dubai";

            s1.study();
            s2.study();
            s1.details();
            s2.details();

        }
}
