package enumTypes;

//Enum with instance fields
enum mealPlan{
	BREAKFAST("Oatmeal","Tofu fritata"),
	LUNCH("Tempeh fajitas", "Carrot Ginger soup"),
	DINNER("Papaya","Miso Ramen soup");
	
	String item1;
	String item2;
	
	mealPlan(String i1, String i2){
		this.item1=i1;
		this.item2=i2;		
	}
}

public class EnumExample {
	public static void main(String...strings) {
		System.out.println(mealPlan.BREAKFAST.item1);
		
		for(mealPlan plan : mealPlan.values()) {
			System.out.println(plan.item1+", "+plan.item2);
		}
	}

}
