package functionalInterface;
/*
 * Functional interface is one that has one and only one abstract method that can be overridden and implemented. Annotate an interface with @FunctionalInterface. 
 * The annotation expresses the intent that you will be using lambdas in place of the SAM.
 * 
 * Questions to think about:-
 * 1)How to modify a class variable inside a lambda?!
 * */

@FunctionalInterface
interface Shape{
	public double area(double x);
	
	public default void print() {
		System.out.println("I am a default method inside this functional interface");
	}
}

public class FunctionalInterfaceAnnotation {
	public static void main(String...strings) {
		
		//before java 8
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Inside the run() of the anonymous class -- hey!!");			
			}
		}).start();
		
		//Java 8 onwards..
		new Thread(()-> System.out.println("Inside the run() of lambda --- WOOHOoo ")).start();
		
		//using FunctionalInterface
		Shape square = x -> x*x; //implementing the lambda
		double area = square.area(5.0);
		System.out.println("Area of a square with side:5 = "+area);
		area = square.area(10.0);
		System.out.println("Area of a square with side:10 = "+area);
		
		Shape circle = radius -> (Math.PI*radius*radius); //giving in
		area = circle.area(1.0);
		System.out.println("Area of circle with radius : 1 is "+area);
	}
}
