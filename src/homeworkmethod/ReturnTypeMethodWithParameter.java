package homeworkmethod;

public class ReturnTypeMethodWithParameter {

	
	
	public static void main(String[] args) {
		
		ReturnTypeMethodWithParameter.getSum(9, 9);
		ReturnTypeMethodWithParameter.doCalculation(500, 500);
		
		
	}	
		
		
		public static int getSum(int cost1, int cost2) {
		int cost3 = cost1+cost2;
		
		System.out.println("Total cost: "+cost3);
	
	return cost3;
		}
	
	public static double doCalculation(double rent1,double rent2) {
	double rent = rent1 + rent2;
	System.out.println("Total rent: "+rent);
	
	return rent;
	
	}
}
