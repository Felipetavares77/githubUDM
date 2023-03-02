package entities;

public class Salary {
	
	public String name;
	public double grossSalary;
	public double tax;
	public double increase;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public String toString() {
		return "EMPLOYEE NAME: " + String.format("%s\n", name) + 
			   "Gross salary: " + String.format("%.2f\n", grossSalary) +
			   "Tax: " + String.format("%.2f\n", tax) +
			   "Net Salary: " + String.format("%.2f", netSalary());
	}
	public void incSalary() {
		increase = (increase/100) * grossSalary;
		this.grossSalary += increase;
	}

}
