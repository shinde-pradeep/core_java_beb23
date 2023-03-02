package programs;

public class A_reverseString {

	public static void usingCharAtMethod() {

		String s1 = "i am good";
		int len = s1.length();

		String revS1 = "";

		for (int a = len - 1; a >= 0; a--) 
		{
			revS1 = revS1 + s1.charAt(a);
		} 
		     System.out.println("original string is - " + s1 + "\nreverse string is - " + revS1);
 }

	
	public static void usingStringBuffer () {

		String s1 = "i am good coder";
	
	    StringBuilder sb= new StringBuilder();	
	    StringBuilder revStr= sb.append(s1).reverse();
	   
		System.out.println("original string is - " + s1 +"\nreverse string is - "+ revStr);
	
	}
	
	public static void usingSplitMethod () {

		String s1 = "i am good coder";
	
	   String [] arr = s1.split("");
	  
	   System.out.println(s1);

	  for(int a=arr.length-1; a>=0; a--)
	  {
			System.out.print(arr[a]);	  
	  }
			
}

	public static void usingToCharArray () {

		String s1 = "i am good coder boss";
	
	   char [] arr = s1.toCharArray();
	  
	   System.out.println(s1);

	  for(int a=arr.length-1; a>=0; a--)
	  {
			System.out.print(arr[a]);	  
	  }
			
}
	
	
	public static void main(String[] args) {
		
		
		System.out.println("1---s.charAt(indexNumber).............");
        A_reverseString.usingCharAtMethod();
        
		System.out.println("2---usingStringBuffer.................");
		A_reverseString.usingStringBuffer();
        
		System.out.println("3---usingSplitMethod..................");
		A_reverseString.usingSplitMethod();
        
		System.out.println("\n4---usingToCharArray..................");
		A_reverseString.usingToCharArray();
        

	}

}
