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
		String nonStaticVar = "checker";
		final String staticVar = "Hahaha";
		
		if(age>18)
			isAdult=true;
		
		nonStaticVar+="!!";
	
	class LocalClassExample{
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
			
			//System.out.println(nonStaticVar);
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
