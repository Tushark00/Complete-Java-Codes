import java.io.*;

public class ThrowsCh {
    // for checked Exception
    public static void method() throws FileNotFoundException{

        FileReader file = new FileReader("C:\\Users\\Anurati\\Desktop\\abc.txt");
        BufferedReader fileinput = new BufferedReader(file);

        throw new FileNotFoundException();
    }
    
    public static void main(String[] args) {
        try{
            method();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("rest of code");
    }
    

    
}
