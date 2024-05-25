// package ExceptionHandling;

class CustomExcp  extends Exception {

    // default constructor
    CustomExcp(){
        super("invalid age!!");
    }    
    // parameterizsed constructor
CustomExcp(String msg){
    super(msg);
}

}

class Example {

    public static void main(String[] args) {
        System.out.println("Started...");
        try{

            int n1=Integer.parseInt(args[0]);
            int n2=Integer.parseInt(args[1]);
            System.out.println("we have got two number..");
            float result=n1/n2;
            System.out.println("div is "+result);
            if(n2<10){
                throw new CustomExcp("wrong age !!!");
            }
        }
        catch(CustomExcp e){
            System.out.println("invalid n2");
            System.out.println(e.getMessage());
        }
        catch(NumberFormatException e){
            System.out.println("please enter a number!!");
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println("invalid input!!");
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("Error!!!");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("this is finally block");
            System.out.println("all resouces are closing...");
        }
        System.out.println("Terminated..");
    }
}
