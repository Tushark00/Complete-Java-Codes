package packages;
//import pack.A; //this is using package.classname
//import pack.*;   // this is using packagename

class Start {
	public void disp(){
	System.out.println("hello start");

	}
	
	public static void main(String args[]){
	Start obj = new Start();
	obj.disp();
	System.out.println("hello");
	
//	A ob1 = new A();
	
//	pack.A ob1 = new pack.A(); //this is using fully quallified name
//	ob1.run();

	}


}