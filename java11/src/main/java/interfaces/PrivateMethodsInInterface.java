package interfaces;

/*From Java9, an interface can have the following:-
 * Constant variables
Abstract methods
Default methods
Static methods
Private methods
Private Static methods*/

interface HelloWorld{
	private String hello() {
		return "hello";
	}
	
	public default void printHW() {
		System.out.println(hello()+" world"); 
	}
}

public class PrivateMethodsInInterface {
	public static void main(String...strings) {
		HelloWorld obj = new HelloWorld() {};
		obj.printHW();
	}
	

}
