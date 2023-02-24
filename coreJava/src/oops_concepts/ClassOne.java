package oops_concepts;

public class ClassOne {

	int a = 10;

	static int b = 20;

	final int c = 100;

	public void nsm() {

		System.out.println("this is ClassOne non static method");
	}

	public void sm() {

		System.out.println("this is ClassOne static method");
	}

	public final void fm() {

		System.out.println("this is ClassOne final method");
	}

//	Default methods are allowed only in interfaces.
//	
//	public default void dm () {
//		
//		System.out.println("this is ClassOne default method");
//	}

	public static void main (String [] args)
	{
		
		ClassOne obj1= new ClassOne ();
		
	System.out.println(	obj1.a+"- non static variable");
	System.out.println(	obj1.b+"- static variable by obj");
	System.out.println(	b+"- static variable by instance");
	System.out.println(	ClassOne.b+"- static variable by class name");
	System.out.println(	obj1.c+"- final variable");
	
	obj1.nsm();
	obj1.sm();
	obj1.fm();

	
//compile time error - nm cannot be resolved or is not a field
//	System.out.println(	obj1.nm);	
		
	
//compile time error -Syntax error on token ";", invalid AssignmentOperator
//	obj1.a;

	
	//compile time error -	Syntax error, insert "VariableDeclarators" to complete LocalVariableDeclaration		
//	b;
	
	

//		compile time error -		
//		Multiple markers at this line
//		- Syntax error, insert ";" to complete LocalVariableDeclarationStatement
//		- Syntax error, insert "VariableDeclarators" to complete LocalVariableDeclaration
//		- Syntax error on token ";", invalid AssignmentOperator
//		obj1.c;




		
		
		
	}

}
