package AbstractionExample;

public interface myInterfaceOne {

	int a=10;

//1...no static variable	
//	int static b=20;
	
//2...non static methods	
//public void nsm () {
//		
//		System.out.println("this is non static from abstract class");
//	}

//3...multiple static methods	
	public static void sm() {
		
		System.out.println("this is static method from interface one");

	}
public static void sm2() {
		
		System.out.println("this is static method2 from interface");

	}



//4...multiple default methods	
public default void defaultMethod() {
	
	System.out.println("this is default method from interface one");

}

public default void defaultMethod2() {
	
	System.out.println("this is default method2 from interface one");

}

//5...no static default method
//public static default void defaultMethod2() {
//	
//	System.out.println("this is default method2 from interface one");
//
// }



//5...no final methods in interface
//Illegal modifier for the interface method finalMethod;
//only public, private, abstract, default, static and strictfp are permitted	

//  final void finalMethod() {
//		
//		System.out.println("this is final from abstract class");
//
//	}



void m1();



public static void main(String[] args) {

// can not instantiate interface		
	
//	myInterfaceOne instance =new myInterfaceOne();
	
	System.out.println(myInterfaceOne.a);
	myInterfaceOne.sm();
	
	
	
	
}
	
	
}
