package functionalInterface;
//Function<T,R> is a functional interface where T:argument type and R:return type. Has a SAM - apply(). 
//The lambda expression assigned to an object of Function type is used to define its apply() which eventually applies the given function on the argument.

import java.util.function.BiFunction;

//IntFunction, LongFunction, DoubleFunction : apply()
//ToIntFunction, ToLongFunction, ToDoubleFunction : applyAsInt(), applyAsLong() and applyAsDouble()
//DoubleToInt, DoubleToLong, IntToDouble, IntToLong, LongToInt, LongToDouble - applyAsxxxx()
//Two-arity functions - BiFunction, ToDoubleBiFunction, ToIntBiFunction and ToLongBiFunction

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;

public class PrimitiveFunctionSpecializationExample {
	
	public static void main(String...args) {
		//1) Function<T,R>'s apply function
		Function<Integer, Double> half = num -> num/2.0;
		System.out.println(half.apply(100));
		
		//2) IntFunction<R> has apply()
		IntFunction<Double> sine = theta -> Math.sin(theta);
		System.out.println(sine.apply(0));
		
		//3) ToIntFunction<T>: has applyAsInt()
		//Similarly ToLongFunction has applyAsLong() and ToDoubleFunction has applyAsDouble().
		ToIntFunction<String> stringLength = str -> str.length();
		System.out.println(stringLength.applyAsInt("srividhya"));
		
		//4 This is equivalent to 1 and 2. Takes an integer argument and returns a double type result.
		IntToDoubleFunction squareRoot = x -> Math.sqrt(x);
		System.out.println(squareRoot.applyAsDouble(100));
		
		//Two-Arity function
		//BiFunction<T, U, Integer> : T - type of 1st argument, U - type of 2nd argument and return type of function is Integer
		BiFunction<String, String, Integer> compareStrings = (a,b) -> a.compareTo(b);
		System.out.println(compareStrings.apply("computer","science"));
		System.out.println(compareStrings.apply("Hakuna Matata","Hakuna Matata"));
		
		ToIntBiFunction<Integer,Integer> compareNums = (a,b) -> a.compareTo(b);
		System.out.println(compareNums.applyAsInt(10, 1));
	}
}
