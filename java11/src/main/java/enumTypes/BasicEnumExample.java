package enumTypes;

//1) Basic enum - enum.values() returns days[]
enum days{
	MON,TUE,WED,THURS,FRI,SAT,SUN;
}

public class BasicEnumExample {	
	public static void main(String...strings) {
		for(days day : days.values()) {
			System.out.println(day.name());
			System.out.println(day.ordinal());
			System.out.println(day.toString());
		}
	}
}
