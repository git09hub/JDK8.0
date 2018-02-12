package defaultNstaticIninterfaces;

public class ImplementingClass1 implements Interface1,Interface2 {

	public void ImplementigClass1() {
		System.out.println("constructor: ImplementigClass1");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementingClass1 implc1 = new ImplementingClass1();
		implc1.method1("taraq...");
		//statc method would be called wih the interface name only
		Interface1.print("pring data--");
	}

	@Override
	public void method1(String str) {
		// TODO Auto-generated method stub
		System.out.println("method impl1: ImplementigClass1  :   "+str);

	}

	//must be overrided if you want to use same default methods in two interfaces
	@Override
	public void log(String str) {
		// TODO Auto-generated method stub
		Interface1.super.log(str);
	}

	
}
