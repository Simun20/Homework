package homeworkmethod;

public class NonReturnTypeMethodWithoutParameter {

	
	
	public static void main(String[] args) {
		
		NonReturnTypeMethodWithoutParameter.doAddition();
		NonReturnTypeMethodWithoutParameter.doSubtraction();
		NonReturnTypeMethodWithoutParameter.doDivision();
		NonReturnTypeMethodWithoutParameter Arya = new NonReturnTypeMethodWithoutParameter();
		Arya.doMultiplication();
		
		Arya.doCooking();
	}
		
	public static void doAddition()	{
		
		int num1 = 40;
		int num2 = 20;
		int num3 = num1+num2;
		System.out.println(num3);
	}
		
		public static void doSubtraction() {
		
		int num1 = 60;
		int num2 = 30;
		int num3 = num1-num2;
		System.out.println(num3);
		
		}
		
		public static void doDivision() {
			int num1= 20;
			int num2= 800;
			int num3= num1/num2;
			System.out.println(num3);
	
		}
	
	public void doMultiplication() {
	
		int num1 = 20;
		int num2= 30;
		int num3 = num1*num2;
		System.out.println(num3);
	}
	
	public void doCooking() {
	
	System.out.println("We love chicken curry");
	
	}
	
	
	
	
	
	
	
}
	
	
	
	
	
	

