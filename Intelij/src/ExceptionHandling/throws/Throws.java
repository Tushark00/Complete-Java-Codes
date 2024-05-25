public class Throws {
    public static void valid(int age){
        if (age<18) {
            
            // here we use unchecked Exception
            throw new ArithmeticException("person not eligiblie for vote");


        }
        else{
            System.out.println("eligible for vote");
        }
    }
    public static void main(String[] args) {
        valid(13);
        System.out.println("rest of code");
    }
    
}
