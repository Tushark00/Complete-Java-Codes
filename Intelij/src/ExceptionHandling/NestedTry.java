// package RevisionCoreJAVA.Intelij.src.ExceptionHandling;

public class NestedTry {
 
    public static void main(String[] args) {
        
        try{
            int C;            
            int b []= new int[3];
            
            try{
                b[3]=10; 
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("wrong index input t2");
                System.out.println(e.getMessage());
            }

            try{
                int a = 50/0;
            }
            catch(ArithmeticException e){
                System.out.println("wrong input t3");
                System.out.println(e.getMessage());
            }
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("t1");
        }
        System.out.println("normal flow of program ");
    }
}
