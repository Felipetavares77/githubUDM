package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Salary;

public class SalaryCalc {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Salary salary = new Salary();
		
		System.out.println("Enter the name of the Employee: ");
		salary.name = sc.nextLine();
		System.out.println("Enter the value of the gross salary of the employee: ");
		salary.grossSalary = sc.nextDouble();
		System.out.println("Enter the value of the taxes: ");
		salary.tax = sc.nextDouble();
		
		System.out.println(salary);
		
		System .out.println("Enter the percentage of the increase: ");
		salary.increase = sc.nextDouble();
		salary.incSalary();
		System.out.println("UPDATED DATA: \n" + salary);
		
		sc.close();
	}

}
