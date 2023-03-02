package entities;

public class StudentGrade {
	
	public String name;
	public double gradeFir;
	public double gradeSec;
	public double gradeThir;
	public String result;
	
	public double finalGrade() {
		return gradeFir+gradeSec+gradeThir; 
	}
	public double missPoint = 100 - finalGrade();
	
	public String toString() {
		if(finalGrade() >= 60.00){
			return "FINAL GRADE: " + String.format("%.2f\n", finalGrade()) + "PASS";
		}
		else{
			return "FINAL GRADE: " + String.format("%.2f\n", finalGrade()) + "Failed\nMISSING "+
			       String.format("%.2f", missPoint)+" POINTS";
		}		
	}	
	
}
