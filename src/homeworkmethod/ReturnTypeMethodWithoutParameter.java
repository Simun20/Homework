package homeworkmethod;

public class ReturnTypeMethodWithoutParameter {

	public static void main(String[] args) {
		
		 ReturnTypeMethodWithoutParameter BK = new  ReturnTypeMethodWithoutParameter();
		BK.getValue();
		ReturnTypeMethodWithoutParameter.getSalary();
		 ReturnTypeMethodWithoutParameter AG = new  ReturnTypeMethodWithoutParameter();
			AG.getAge();
			ReturnTypeMethodWithoutParameter.doShopping();
	}
	
	public int getAge() {
		
		int age = 10;
		
		System.out.println("His age is "+age);
		
		return age;
	}
	
	
	public int getValue() {
	
	int price = 10;
	
	System.out.println("book price is "+price);
	
	return price;
	}
	public static int doShopping() {
		int cost = 8000;
		System.out.println("Total shopping cost "+cost);
		return cost;	
		}	
	public static int getSalary() {
	int salary = 8000;
	System.out.println("My salary is "+salary);
	return salary;	
	}
}
