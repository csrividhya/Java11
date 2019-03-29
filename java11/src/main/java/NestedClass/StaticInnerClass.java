/* There are 2 types of nested classes - Static and Inner classes. Nested classes declared with the static keyword are called static nested classes. */
/*Static nested classes are accessed using the enclosing class name => OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();*/
/*To instantiate an inner class, you must first instantiate the outer class. Then, create the inner object within the outer object with this syntax: OuterClass.InnerClass innerObject = outerObject.new InnerClass();*/

package NestedClass;

class Details{
	String name;
	Address address;
	Inner inner;
	public static long zipcode;
	
	public static void printMessage() {
		System.out.println("Hey! Inside static method of the outer class!");
	}
	
	public void nonStaticPrintFunction() {
		System.out.println("Hey! Inside non-static method of the outer class! " + name);
	}
	
	//nested classes
	 static class Address{
		 //needs instance of enclosing class to access non-static members and functions of outer class
		int doorNumber;
		String streetname;
		
		void innerPrint() {
			Details d = new Details();
			System.out.println("Hey! You're inside the nexted static class print function"+zipcode+d.name);
			printMessage();
			d.nonStaticPrintFunction();
			//cannot access nonStaticPrintMessage() cos it's not static
		}
	}
	 
	class Inner{
		 int phoneNumber;
		 void innerPrint() {
			 printMessage();
			 nonStaticPrintFunction();
				System.out.println("Hey! You're inside the nested inner class print function" + name);
			}
	 }	
}

public class StaticInnerClass {
	
	public static void main(String...strings)
	{		
		//creating obj of static nested class
		Details.Address staticObj = new Details.Address(); //OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass()
		//staticObj.innerPrint();
		
		//creating obj of inner class
		Details deets = new Details();
		deets.name = "Frank";
		Details.Inner innerObj = deets.new Inner(); //OuterClass.InnerClass innerObject = outerObject.new InnerClass()
		
		
		deets.address = staticObj;
		deets.address.innerPrint();
		deets.inner = innerObj;
		deets.address.innerPrint();
		
	
		
	}
}
