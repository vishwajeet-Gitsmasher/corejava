package Day_34;

public class Manager extends Employee{
	double projectAllowance;

	public Manager(int id, String name, double basicSalary, double hRAPer, double dAPer, double projectAllowance) {
		super(id, name, basicSalary, hRAPer, dAPer);
		this.projectAllowance = projectAllowance;
	}
	
	public double calculateGrossSalary() {
		double GrossSalary = super.basicSalary + super.HRAPer + super.DAPer + this.projectAllowance;
		return GrossSalary;
	}
}

/*
Class Manager

Fields: id: int, name : String, basicSalary : double, HRAPer : double,DAPer : double, projectAllowance: double

Public Method: calculateGrossSalary() - returns a double

Calculate the gross salary as : basicSalary +HRAPer +DAPer + projectAllowance

*/