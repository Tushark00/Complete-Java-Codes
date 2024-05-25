public class Base {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        typecasting
//        int a=9;
//        System.out.println("a:"+a);
//        double d=a;
//        System.out.println("d:" +d);

//        if else
        int m = 10;

        if (m > 90) {
            System.out.println("grade A");
        } else if (m > 80 && m <= 90) {
            System.out.println("grade B");
        } else {
            System.out.println("failed");
        }

//        nested if

        int mu=140;

        if(mu>0){
            if (mu%2==0){
                System.out.println("odd and greater than 0");
            }
        }

//        switch ()\
        String day="0";
        switch (day){
            case "m":
                System.out.println("monday");
                break;
            case "t":
                System.out.println("tuesday");
                break;
            default:
                System.out.println("nothing");
        }

//        foreach loop
        int a[]={1,2,3,4,5};

        for(int b:a){
            System.out.print(b+" ");
        }

    }
}