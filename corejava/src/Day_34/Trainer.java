package Day_34;

public class Trainer extends Employee{
	int batchCount;
	double perkPerBatch;
	
	public Trainer(int id, String name, double basicSalary, double hRAPer, double dAPer, int batchCount,
			double perkPerBatch) {
		super(id, name, basicSalary, hRAPer, dAPer);
		this.batchCount = batchCount;
		this.perkPerBatch = perkPerBatch;
	}
	
	public double calculateGrossSalary() {
		double GrossSalary = super.basicSalary + super.HRAPer + super.DAPer + (this.batchCount * this.perkPerBatch);
		return GrossSalary;
	}
	
}

/*
Class Trainer

Fields: id: int, name : String, basicSalary : double, HRAPer : double,DAPer : double, batchCount: int, perkPerBatch: double


Public Method: calculateGrossSalary() - returns r +(batchCount * perkPerBatch)
*/