package programs;

public class B_swapNumbers {

	public static void twoNoWithThirdVariable () {
		
		int a=10;
		int b=20;
		
		System.out.println("before swap\na="+a+"\nb="+b);
		
		int c=a;
		    a=b;
		    b=c;
		    
		System.out.println("after swap\na="+a+"\nb="+b);
	}
	
public static void twoNoWithoutThirdVariable () {
		
		int a=100;
		int b=200;
		
		System.out.println("before swap\na="+a+"\nb="+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		    
		System.out.println("after swap\na="+a+"\nb="+b);
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("twoNoWithThirdVariable.....................");
		B_swapNumbers.twoNoWithThirdVariable();
		
		System.out.println("twoNoWithoutThirdVariable.....................");
		B_swapNumbers.twoNoWithoutThirdVariable();
		
		
		
		
	}
	
	
	
}
