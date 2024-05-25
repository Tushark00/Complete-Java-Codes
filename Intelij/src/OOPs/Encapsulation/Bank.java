package OOPs.Encapsulation;

public class Bank {
    private long accNo;

    private String name,email;
    private float amount;

   public void setAccNo(long accNo){
       this.accNo=accNo;
   }
   public long getAccNo(){
       return accNo;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }
}
