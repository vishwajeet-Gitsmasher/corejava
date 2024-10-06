package Day_3;

public class Salary_Slip {

	public static void main(String[] args) {
		double basic = Double.parseDouble(args[0]);
		System.out.println("---------------Salary Slip-------------");
		System.out.println("---------------------------------------");
		System.out.println("Basic\t\t\t\t"+ basic);
		System.out.println("HRA\t\t\t\t"+ (basic * 0.15));
		System.out.println("Conveyance allowance\t\t"+ (basic * 0.15));
		System.out.println("Entertainment Allowance\t\t"+ (basic * 0.1));
		System.out.println("----------------------------------------");
		System.out.println("Total Salary\t\t\t"+(basic + (basic * 0.15)+ (basic * 0.15) + (basic * 0.1)));
	}

}

/*
---------------Salary Slip-------------
---------------------------------------
Basic						10000.0
HRA							1500.0
Conveyance allowance		1500.0
Entertainment Allowance		1000.0
----------------------------------------
Total Salary				14000.0
*/
