package compare;

import java.util.*;

public class FoodCalories {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<FoodItems>foodList=new ArrayList<>();
		a:while(true) {
		System.out.println("List of Items you want:\nFruits\n(Banana/Apple)\nFood\n(Rice/Wheat)\nVegetables\n(Carrot/Cucumber");
		String food=sc.next();
		System.out.println("Enter Carbohydrates(g)=");
		int carb=sc.nextInt();
		System.out.println("Enter Proteins(g)=");
		int proteins=sc.nextInt();
		System.out.println("Enter Fat(g)=");
		int fat=sc.nextInt();
		System.out.println("Enter quantity:");
		int quantity=sc.nextInt();
		String ques="";
		
		FoodItems fI=null;
		
		if(food.equalsIgnoreCase("banana")||food.equalsIgnoreCase("apple")) {
			Fruit fruit=new Fruit();
			fI=fruit.selectFruit(food,carb,proteins,fat);
		}else if(food.equalsIgnoreCase("rice")||food.equalsIgnoreCase("wheat")) {
			Food foodItem=new Food();
			fI=foodItem.selectFood(food,carb,proteins,fat);
		}else if(food.equalsIgnoreCase("carrot")||food.equalsIgnoreCase("cucumber")) {
			Vegetable veg=new Vegetable();
			fI=veg.selectVegetable(food,carb,proteins,fat);
		}else {
			System.out.println("Invalid Food Item");
		}
		if(fI!=null) {
			fI.setquantity(quantity);
			foodList.add(fI);
			System.out.println("Calories per "+food+" : "+fI.totalcalories(quantity));
		}
		System.out.println("Do you want to continue?(yes/no)");
		ques=sc.next();
		if(ques.equalsIgnoreCase("no"))
			break a;
		}
		
		System.out.println("Sorted from highest to lowest calories");
		Collections.sort(foodList,new Comparator<FoodItems>() {

			@Override
			public int compare(FoodItems f1, FoodItems f2) {
				return Integer.compare(f2.gettotalcalories(), f1.gettotalcalories());
			}
			
		});
		foodList.forEach(item->System.out.println(item.getClass().getSimpleName()+": "+item.gettotalcalories()));
	}
}

class FoodItems{
	private int carb;
	private int proteins;
	private int fat;
	protected int calories;
	private int quantity;
	public FoodItems() {
		this.carb=0;
		this.proteins=0;
		this.fat=0;
		this.calories=0;
		this.quantity=0;
	}
	
	public int getquantity() {
		return quantity;
	}
	public void setquantity(int quantity) {
		this.quantity=quantity;
	}
	public int getcarb() {
		return carb;
	}
	public void setcarb(int carb) {
		this.carb=carb;
	}
	public int getproteins() {
		return proteins;
	}
	public void setproteins(int proteins) {
		this.proteins=proteins;
	}
	public int getfat() {
		return fat;
	}
	public void setfat(int fat) {
		this.fat=fat;
	}
	public int totalcalories(int quantity){
		return (calories*quantity);

	}
	public int gettotalcalories() {
		return calories*quantity;
	}
	
	
}

//Fruit
class Fruit extends FoodItems{
	private FoodItems banana,apple;
	public Fruit() {
		super();
		this.apple=new FoodItems();
		this.banana=new FoodItems();
	
	}
	
	public FoodItems selectFruit(String fruitName,int carb,int proteins,int fat) {
		FoodItems fruit=null;
		if(fruitName.equalsIgnoreCase("banana")) {
			fruit=new FoodItems();
			banana.setcarb(carb);
			banana.setproteins(proteins);
			banana.setfat(fat);
			banana.calories=calBananaCalories(banana);
			fruit.calories=banana.calories;
		}
		else if(fruitName.equalsIgnoreCase("apple")) {
			fruit=new FoodItems();
			apple.setcarb(carb);
			apple.setproteins(proteins);
			apple.setfat(fat);
			apple.calories=calAppleCalories(apple);
			fruit.calories=apple.calories;
		}else {
			System.out.println("Invalid fruit");
		}
		return fruit;
	}
			//carb
			private int calBananaCalories(FoodItems banana) {
				int calories=0;
			if(banana.getcarb()>=(10) && banana.getcarb()<(20)) {
				calories=4;
			}else if(banana.getcarb()>=(20) && banana.getcarb()<(30)){
				calories=5;
			}else if(banana.getcarb()>=(30) && banana.getcarb()<(40)) {
				calories=6;
			}else if(banana.getcarb()>=(40)) {
				calories=7;
			}else {
				System.out.println("Enter valid number");
			}
			//proteins
			if(banana.getproteins()>=(10) && banana.getproteins()<(20)) {
				calories+=5;
			}else if(banana.getproteins()>=(20) && banana.getproteins()<(30)) {
				calories+=6;
			}else if(banana.getproteins()>=(30) && banana.getproteins()<(40)) {
				calories+=7;
			}else if(banana.getproteins()>=(40)) {
				calories+=8;
			}else {
				System.out.println("Enter valid number");
			}
			
			//fat
			if(banana.getfat()>=(10) && banana.getfat()<(20)) {
				calories+=8;
			}else if(banana.getfat()>=(20) && banana.getfat()<(30)) {
				calories+=9;
			}else if(banana.getfat()>=(30) && banana.getfat()<(40)) {
				calories+=10;
			}else if(banana.getfat()>=(40)) {
				calories+=11;
			}else {
				System.out.println("Enter valid number");
			}
			
			return calories;
			}
		private int calAppleCalories(FoodItems apple) {
			
			int calories=0;
			//carb
			if(apple.getcarb()>=(10) && apple.getcarb()<(20)) {
				calories=6;
			}else if(apple.getcarb()>=(20) && apple.getcarb()<(30)){
				calories=8;
			}else if(apple.getcarb()>=(30) && apple.getcarb()<(40)) {
				calories=9;
			}else if(apple.getcarb()>=(40)) {
				calories=10;
			}else {
				System.out.println("Enter valid number");
			}
			//proteins
			if(apple.getproteins()>=(10) && apple.getproteins()<(20)) {
				calories+=5;
			}else if(apple.getproteins()>=(20) && apple.getproteins()<(30)) {
				calories+=6;
			}else if(apple.getproteins()>=(30) && apple.getproteins()<(40)) {
				calories+=7;
			}else if(apple.getproteins()>=(40)) {
				calories+=8;
			}else {
				System.out.println("Enter valid number");
			}
			
			//fat
			if(apple.getfat()>=(10) && apple.getfat()<(20)) {
				calories+=8;
			}else if(apple.getfat()>=(20) && apple.getfat()<(30)) {
				calories+=9;
			}else if(apple.getfat()>=(30) && apple.getfat()<(40)) {
				calories+=10;
			}else if(apple.getfat()>=(40)) {
				calories+=11;
			}else {
				System.out.println("Enter valid number");
			}
			return calories;
		}
}
		
class Food extends FoodItems{
	private FoodItems rice,wheat;
	
	public Food() {
		super();
		this.rice=new FoodItems();
		this.wheat=new FoodItems();
	}
	public FoodItems selectFood(String foodName,int carb,int proteins,int fat) {
		FoodItems food=null;
		if(foodName.equalsIgnoreCase("rice")) {
			food=new FoodItems();
			rice.setcarb(carb);
			rice.setproteins(proteins);
			rice.setfat(fat);
			rice.calories=calRiceCalories(rice);
			food.calories=rice.calories;
		}else {
			System.out.println("Invalid food");
		}
		return food;
	}
	private int calRiceCalories(FoodItems rice) {
			//carb
			if(rice.getcarb()>=(10) && rice.getcarb()<(20)) {
				calories=3;
			}else if(rice.getcarb()>=(20) && rice.getcarb()<(30)){
				calories=4;
			}else if(rice.getcarb()>=(30) && rice.getcarb()<(40)) {
				calories=8;
			}else if(rice.getcarb()>=(40)) {
				calories=10;
			}else {
				System.out.println("Enter valid number");
			}
			//proteins
			if(rice.getproteins()>=(10) && rice.getproteins()<(20)) {
				calories+=2;
			}else if(rice.getproteins()>=(20) && rice.getproteins()<(30)) {
				calories+=9;
			}else if(rice.getproteins()>=(30) && rice.getproteins()<(40)) {
				calories+=11;
			}else if(rice.getproteins()>=(40)) {
				calories+=12;
			}else {
				System.out.println("Enter valid number");
			}
			
			//fat
			if(rice.getfat()>=(10) && rice.getfat()<(20)) {
				calories+=2;
			}else if(rice.getfat()>=(20) && rice.getfat()<(30)) {
				calories+=4;
			}else if(rice.getfat()>=(30) && rice.getfat()<(40)) {
				calories+=6;
			}else if(rice.getfat()>=(40)) {
				calories+=9;
			}else {
				System.out.println("Enter valid number");
			}
			
			return calories;
	}
	
		private int calWheatCalories(FoodItems wheat) {
			
			int calories=0;
			//carb
			if(wheat.getcarb()>=(10) && wheat.getcarb()<(20)) {
				calories=3;
			}else if(wheat.getcarb()>=(20) && wheat.getcarb()<(30)){
				calories=5;
			}else if(wheat.getcarb()>=(30) && wheat.getcarb()<(40)) {
				calories=7;
			}else if(wheat.getcarb()>=(40)) {
				calories=12;
			}else {
				System.out.println("Enter valid number");
			}
			//proteins
			if(wheat.getproteins()>=(10) && wheat.getproteins()<(20)) {
				calories+=5;
			}else if(wheat.getproteins()>=(20) && wheat.getproteins()<(30)) {
				calories+=7;
			}else if(wheat.getproteins()>=(30) && wheat.getproteins()<(40)) {
				calories+=9;
			}else if(wheat.getproteins()>=(40)) {
				calories+=11;
			}else {
				System.out.println("Enter valid number");
			}
			
			//fat
			if(wheat.getfat()>=(10) && wheat.getfat()<(20)) {
				calories+=9;
			}else if(wheat.getfat()>=(20) && wheat.getfat()<(30)) {
				calories+=11;
			}else if(wheat.getfat()>=(30) && wheat.getfat()<(40)) {
				calories+=12;
			}else if(wheat.getfat()>=(40)) {
				calories+=13;
			}else {
				System.out.println("Enter valid number");
			}
			return calories;
		}
}

class Vegetable extends FoodItems{
	private FoodItems carrot,cucumber;
	
	public Vegetable() {
		super();
		this.carrot=new FoodItems();
		this.cucumber=new FoodItems();
	}
	public FoodItems selectVegetable(String vegetableName,int carb,int proteins,int fat) {
		
		FoodItems vegetable=null;
		if(vegetableName.equalsIgnoreCase("carrot")) {
			vegetable=new FoodItems();
			carrot.setcarb(carb);
			carrot.setproteins(proteins);
			carrot.setfat(fat);
			carrot.calories=calCarrotCalories(carrot);
			vegetable.calories=carrot.calories;
		}else if(vegetableName.equalsIgnoreCase("Cucumber")) {
			vegetable=new FoodItems();
			cucumber.setcarb(carb);
			cucumber.setproteins(proteins);
			cucumber.setfat(fat);
			cucumber.calories=calCucumCalories(cucumber);
			vegetable.calories=cucumber.calories;
		}else {
			System.out.println("Invalid vegetable");
		}
		return vegetable;
	}
	private int calCarrotCalories(FoodItems carrot) {
			//carb
			if(carrot.getcarb()>=(10) && carrot.getcarb()<(20)) {
				calories=4;
			}else if(carrot.getcarb()>=(20) && carrot.getcarb()<(30)){
				calories=5;
			}else if(carrot.getcarb()>=(30) && carrot.getcarb()<(40)) {
				calories=6;
			}else if(carrot.getcarb()>=(40)) {
				calories=7;
			}else {
				System.out.println("Enter valid number");
			}
			//proteins
			if(carrot.getproteins()>=(10) && carrot.getproteins()<(20)) {
				calories+=4;
			}else if(carrot.getproteins()>=(20) && carrot.getproteins()<(30)) {
				calories+=6;
			}else if(carrot.getproteins()>=(30) && carrot.getproteins()<(40)) {
				calories+=8;
			}else if(carrot.getproteins()>=(40)) {
				calories+=10;
			}else {
				System.out.println("Enter valid number");
			}
			
			//fat
			if(carrot.getfat()>=(10) && carrot.getfat()<(20)) {
				calories+=3;
			}else if(carrot.getfat()>=(20) && carrot.getfat()<(30)) {
				calories=+4;
			}else if(carrot.getfat()>=(30) && carrot.getfat()<(40)) {
				calories+=5;
			}else if(carrot.getfat()>=(40)) {
				calories+=7;
			}else {
				System.out.println("Enter valid number");
			}
			
			return calories;
	}
		private int calCucumCalories(FoodItems cucumber) {
			int calories=0;
			//carb
			if(cucumber.getcarb()>=(10) && cucumber.getcarb()<(20)) {
				calories=3;
			}else if(cucumber.getcarb()>=(20) && cucumber.getcarb()<(30)){
				calories=4;
			}else if(cucumber.getcarb()>=(30) && cucumber.getcarb()<(40)) {
				calories=5;
			}else if(cucumber.getcarb()>=(40)) {
				calories=7;
			}else {
				System.out.println("Enter valid number");
			}
			//proteins
			if(cucumber.getproteins()>=(10) && cucumber.getproteins()<(20)) {
				calories+=3;
			}else if(cucumber.getproteins()>=(20) && cucumber.getproteins()<(30)) {
				calories+=4;
			}else if(cucumber.getproteins()>=(30) && cucumber.getproteins()<(40)) {
				calories+=5;
			}else if(cucumber.getproteins()>=(40)) {
				calories+=6;
			}else {
				System.out.println("Enter valid number");
			}
			
			//fat
			if(cucumber.getfat()>=(10) && cucumber.getfat()<(20)) {
				calories+=4;
			}else if(cucumber.getfat()>=(20) && cucumber.getfat()<(30)) {
				calories+=6;
			}else if(cucumber.getfat()>=(30) && cucumber.getfat()<(40)) {
				calories+=7;
			}else if(cucumber.getfat()>=(40)) {
				calories+=8;
			}else {
				System.out.println("Enter valid number");
			}
			return calories;
		}
}
			
