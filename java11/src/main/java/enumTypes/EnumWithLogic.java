package enumTypes;

enum calculator{
PLUS, MINUS, DIVIDE, MULTIPLY;
	
public double compute(double a, double b) {
	switch(this) {
		case PLUS: return a+b;
		case MINUS: return a-b; 
		case DIVIDE: return a/b; 
		case MULTIPLY: return a*b; 
		default: return 0.013;
		}
	}
}

public class EnumWithLogic {
	public static void main(String...strings) {
		double a=10;
		double b = 5;
		System.out.println(calculator.PLUS.compute(a, b));
		System.out.println(calculator.MINUS.compute(a, b));
		System.out.println(calculator.DIVIDE.compute(a, b));
		System.out.println(calculator.MULTIPLY.compute(a, b));
	
	}

}
