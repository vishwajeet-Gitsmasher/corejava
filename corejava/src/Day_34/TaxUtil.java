package Day_34;

public class TaxUtil {
	public double calculateTax(Employee E) {
		double sal = E.calculateGrossSalary();
		if(sal>30000) {
			sal -= sal*20/100;
		} else {
			sal -= sal*5/100;
		}
		return sal;
	}
	
	public double calculateTax(Manager M) {
		double sal = M.calculateGrossSalary();
		if(sal>30000) {
			sal -= sal*20/100;
		} else {
			sal -= sal*5/100;
		}
		return sal;
	}

	public double calculateTax(Trainer T) {
		double sal = T.calculateGrossSalary();
		if(sal>30000) {
			sal -= sal*20/100;
		} else {
			sal -= sal*5/100;
		}
		return sal;
	}

	public double calculateTax(Sourcing S) {
		double sal = S.calculateGrossSalary();
		if(sal>30000) {
			sal -= sal*20/100;
		} else {
			sal -= sal*5/100;
		}
		return sal;
	}
}

/*
Class TaxUtil

Fields: None

Public Methods:

calculateTax(Employee) - returns a double

calculateTax(Manager) - returns a double

calculateTax(Trainer) - returns a double

calculateTax(Sourcing) - returns a double



Tax Calculation Logic: If gross salary is greater than 30000 tax is 20% else, tax is 5%

Note : Attributes/Fields must be non-Private for the above classes.
*/