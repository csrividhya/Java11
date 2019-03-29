/*This is a program that's about the final keyword. Even though you make a class final, it doesn't ensure the immutability of that class.*/
/*StringDupe is a final class with 2 data members, one of which is final and the other one isn't. This let's users to mutate objects of the final class - StringDupe*/
/*In short, A final class is simply a class that can't be extended.*/

package finalKeyword;

import java.util.Date;

final class StringDupe{
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getImmutableText() {
		return immutableText;
	}
	
	/*This is not allowed -- can't modify a final variable
	 * 
	 * public String setImmutableText(String t) {
		this.immutableText=t;
	}*/
	
	private String text;
	final private String immutableText;
	
	public StringDupe(String text, String text2){
		this.text=text;
		this.immutableText=text2;
	}
	
	public void getParentClassName() {
		System.out.println(StringDupe.class);
	}
	
	private void getParentClassName2() {
		System.out.println("Inside the private method.... "+StringDupe.class);
	}
}

/*Can't do the following - Can't subclass a final class
 * 
 * class StringDupeChild extends StringDupe{
}
*/

class ClassWithAFinalMethod{

	public final void getParentName() {
		System.out.println("My parent is "+ClassWithAFinalMethod.class);
	}
	
	public void printCurrentClassName() {
		System.out.println("Current class is "+this.getClass());	
	}
}

class SubclassOfClassWithFinalMethod extends ClassWithAFinalMethod{

	//Notice that you cannot override the final method 
	
	@Override
	public void printCurrentClassName() {
		// TODO Auto-generated method stub
		System.out.println("Overriden value");
	}
}

public class Immutable {
	public static void main(String...strings) {
		StringDupe stringDupeObj1 = new StringDupe("Hello world","Hulk smash");
		System.out.println("1 : "+stringDupeObj1.getText());
		System.out.println("1 : "+stringDupeObj1.getImmutableText());
		stringDupeObj1.setText("Bye world"); //--> You are able to mutate a member of a final class
		
		//stringDupeObj1.setImmutableText("Hulk squaaaaaaaaaashed");  --> Not allowed to mutate a final variable
		
		System.out.println("2 : "+stringDupeObj1.getText());
		System.out.println("2 : "+stringDupeObj1.getImmutableText());
		
		
		SubclassOfClassWithFinalMethod obj = new SubclassOfClassWithFinalMethod();
		obj.getParentName();
		obj.printCurrentClassName();
	}
}
