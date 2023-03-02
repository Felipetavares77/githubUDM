package application;

import java.util.Locale;
import java.util.Scanner;

import entities.StudentGrade;

public class Student {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		StudentGrade studentGrade = new StudentGrade();
		
		System.out.println("Enter the student name: ");
		studentGrade.name = sc.nextLine();
		System.out.println("Enter the grade of the FIRST trimester: ");
		studentGrade.gradeFir = sc.nextDouble();
		System.out.println("Enter the grade of the SECOND trimester: ");
		studentGrade.gradeSec = sc.nextDouble();
		System.out.println("Enter the grade of the THIRD trimester: ");
		studentGrade.gradeThir = sc.nextDouble();
		
		System.out.println(studentGrade);
		
		sc.close();

	}

}
