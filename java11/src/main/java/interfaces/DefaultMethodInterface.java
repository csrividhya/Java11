package interfaces;
//Default methods enable you to add new functionality to existing interfaces

interface plant{
	public void getName();
	public default void printDefault() {
		System.out.println("I'm a plant!");
	}
}
public class DefaultMethodInterface {
	public static void main(String...strings) {
		plant succulent = new plant() {
			@Override
			public void getName() {
				System.out.println("I'm a succulent");
				
			}	
		};
		
		succulent.printDefault();
		
		plant hibiscus = new plant(){

			@Override
			public void getName() {
				System.out.println("Hibiscus");
				
			}
			
			//reimplementing default method thus overriding the default implementation
			public void printDefault() {
				System.out.println("I'm a flower!");
			}
		};
		
		hibiscus.printDefault();
	}
	

}
