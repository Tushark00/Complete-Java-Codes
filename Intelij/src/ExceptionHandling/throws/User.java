import javax.sound.midi.Soundbank;

class Userdef extends Exception{

    public Userdef(String eb){
        super(eb);
    } 

}

public class User {

    public static void main(String[] args) {
        
        try{

            throw new Userdef("this is made by tushar");


        }
        catch(Userdef e){
            System.out.println("caught exception");
            System.out.println(e.getMessage());
           
        }
    }
    
}
