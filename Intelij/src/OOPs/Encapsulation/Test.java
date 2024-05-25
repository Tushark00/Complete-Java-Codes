package OOPs.Encapsulation;

public class Test {

    public static void main(String[] args) {

        Bank p1= new Bank();

        p1.setAccNo(001);
        p1.setName("Pawan");
        p1.setEmail("Pawan@gmail.com");
        p1.setAmount(900.0f);

        System.out.println(p1.getAccNo()+" Accno");
        System.out.println(p1.getAmount()+" amount");
    }
}
