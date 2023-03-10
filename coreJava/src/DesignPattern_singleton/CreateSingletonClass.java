package DesignPattern_singleton;


public class CreateSingletonClass  {

//1.declare  - private, static, return-> class
	
	private static CreateSingletonClass singletonObj;

//2.make constructor as - private
	
	private CreateSingletonClass () {
		
	}
	
//3.create method as - public, static, return-> class
	
	public static CreateSingletonClass getSingletonObj () {
		
		
//4.create method for checking reference & use synchronized block instid of method
		
	synchronized (CreateSingletonClass.class)
	{
		if(singletonObj == null)
		{
			singletonObj=new CreateSingletonClass();
		}
		else
		{
			return singletonObj;
		}
	
		return singletonObj;
		
	}
		
	
}
	
public static void main(String[] args) throws CloneNotSupportedException  {
	
	CreateSingletonClass o1=CreateSingletonClass.getSingletonObj();
	
	System.out.println("instance 1 -"+ CreateSingletonClass.getSingletonObj().hashCode() );
	System.out.println("instance 1 -"+ CreateSingletonClass.getSingletonObj().hashCode() );

	
	
}	
	
	
	
	
}
