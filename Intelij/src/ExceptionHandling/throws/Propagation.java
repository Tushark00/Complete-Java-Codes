import java.io.IOException;
// using throws


public class Propagation {
    // using throws in method m #######
    void m() throws IOException{ 
        throw new IOException("device error");// checked exception
    }
    
    // using throws in method n ######
    void n() throws IOException {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("exception handeled");
        }
    }

    public static void main(String args[]) {
        Propagation obj = new Propagation();
        obj.p();
        System.out.println("normal flow");
    }
}
