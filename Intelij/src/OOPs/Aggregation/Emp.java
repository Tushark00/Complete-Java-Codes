package OOPs.Aggregation;

public class Emp {

    int id;
    String name;
    Address address;

    public Emp(int id,String name,Address address){
        this.id=id;
        this.name=name;
        this.address=address;

    }

    void disp(){
        System.out.println("id: "+id);
        System.out.println("name: "+name);
        System.out.println("add: "+address.city+","+address.state+","+address.country);
    }
}
