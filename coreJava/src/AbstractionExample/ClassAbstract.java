package AbstractionExample;

public abstract class ClassAbstract {

	int a=10;
	
	static int b=20;
	
	
	public static void main(String[] args) {
		
//can call static data members and member functions
//		but.............
		System.out.println(ClassAbstract.b);
		ClassAbstract.sm();
		
// can not instantiate abstract class		
//		ClassAbstract instance=new ClassAbstract();
		
		
	}
	
	public void nsm () {
		
		System.out.println("this is non static from abstract class");
	}
	
	public static void sm() {
		
		System.out.println("this is static from abstract class");

	}
	
	
	public final void finalMethod() {
		
		System.out.println("this is final from abstract class");

	}


	
//no static,final abstract method
//no modifier - private	
	public abstract void smAbstract();
	
	public abstract void smAbstract2();
	
	
	
//default methods only in interface
	
//	public default void defaultMethod() {
//		
//	}	
	
	
}
