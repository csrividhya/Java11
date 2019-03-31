package NestedClass;

public class ShadowingExample {
	
	public String whoLetTheDogsOut = "Jerry";
	
	void func() {
		
		class localClass{
			
			String wholeLetTheDogsOut="Kramer";

			 void findWhoLetDemDogsOut() {
				
				String whoLetTheDogsOut = "George";
				
				//focus on accessing mechanisms -->
				System.out.println(whoLetTheDogsOut);
				System.out.println(this.wholeLetTheDogsOut);
				System.out.println(ShadowingExample.this.whoLetTheDogsOut);
				
			}
		}
		 
		 localClass obj = new localClass();
		 obj.findWhoLetDemDogsOut();
	}
	public static void main(String...strings) {
		ShadowingExample obj = new ShadowingExample();
		obj.func();
	}

}
