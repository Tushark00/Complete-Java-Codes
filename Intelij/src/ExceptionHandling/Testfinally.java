public class Testfinally {
    
    public static void main(String[] args) {
        
        try{
            System.out.println("inside the try block");
            int a=40/0;
            System.out.println(a);

        }catch(NullPointerException e){
            System.out.println(e);

        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("finally hamesha chalega ");

        }
        System.out.println("rest of the code");
    }
}
