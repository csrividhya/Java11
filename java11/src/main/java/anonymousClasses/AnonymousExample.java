/*An anonymous class is an expression --> needs to be part of a statement. Anonymous class can't have constructor.
 * It captures variable values of enclosing scope --> can only access final or effectively final vars. 
 * Mostly can't declare static vars inside anonymous class but can have them if they are constant variables.
 * */
package anonymousClasses;

interface parentInterface{
	public void print();
}

public class AnonymousExample {
	public static void main(String...strings) {
		
		//1) Anonymous class extending Thread class
		Thread t = new Thread() {
			public void run() {
				System.out.println("Child thread");
			}
		};
		
		t.start();
		System.out.println("Main thread");

		//2) Anonymous class implementing an interface
		parentInterface interfaceObj = new parentInterface() {
			//static int x = 5; --> can't declare static variables inside anonymous class
			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("Inside interface anonymous implementation ");	
			}
		};	
		interfaceObj.print();
	}
}
