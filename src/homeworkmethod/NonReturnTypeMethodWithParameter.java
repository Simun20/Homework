package homeworkmethod;

public class NonReturnTypeMethodWithParameter {

	
	public static void main(String[] args) {
		
		 NonReturnTypeMethodWithParameter.getPatietInfo("Dolly");
		 NonReturnTypeMethodWithParameter.getPatientInfo(101);
		 NonReturnTypeMethodWithParameter Teacher = new  NonReturnTypeMethodWithParameter();
		 Teacher.doAddition(9, 9);
		 NonReturnTypeMethodWithParameter Teacher2 = new  NonReturnTypeMethodWithParameter();
		 Teacher2.doMultiply(5, 5);
	}
	
	public void doAddition(int num1,int num2) {
	int num3 = num1+num2;
	System.out.println("Addition: "+num3);
	
	}
	public void doMultiply(int num4, int num5) {
		
		int num6 = num4*num5;
		System.out.println("Multiply: "+num6);
		
		
		
	}
	
	
	public static void getPatietInfo(String name)	{
		
		System.out.println("Patient name "+name );
		
	}	
		
	public static void getPatientInfo(int id)	{
	
		
		System.out.println("Patient id "+id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
	
	

	
		
	
	
	
	
	
	
	
	
	
	
	

