package NestedClass;
//Local classes are defined inside a block {}

public class LocalClass {
	String name;
	int age;
	boolean isAdult;
	static String message = "Hello World";
	
	public LocalClass(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.isAdult=false;
	}
	
	public void checkIfAdult() {
		final String staticVar = "Hahaha";
		
		if(age>18)
			isAdult=true;
		
	class LocalClassExample{
		/*Local classes are non-static because they have access to instance members of the 
		 * enclosing block. Consequently, they cannot contain most kinds of static declarations.*/
		
		//static String msg ="YOLO";  <-- Error 1
		
		/*local class can access only static or effectively static local variables of
		 * enclosing class*/
		public void printAdultOrNot() {
			if(isAdult) {
				System.out.println("YOU ARE AN ADULT "+ name);
			}
			else {
				System.out.println("Luke, I am your father!");
			}
		}
		
		public void tamperAge() {
			message+=message;
			age++;
			
			/*The commented line will produce an error -->
			 * The local variable nonStaticVar defined in enclosing scope should be final or 
			effectively finally effectively final --> value remains unchanged*/
			
			//System.out.println(nonStaticVar);  <----ERROR 2
			System.out.println(staticVar);			
		}
	}	
	LocalClassExample checker = new LocalClassExample();
	age=18;
	checker.printAdultOrNot();		
	}
	
	public static void main(String...strings) {
		LocalClass obj = new LocalClass("sri",24);
		obj.checkIfAdult();		
	}
}
