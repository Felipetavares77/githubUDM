package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class RectangleCalc {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter the Width of rectangle: " );
		System.out.print("Width: ");
		rectangle.width = sc.nextDouble();
		System.out.println("Enter the height of rectangle: ");
		System.out.print("Height: ");
		rectangle.height = sc.nextDouble();
		
		System.out.println(rectangle);
	
		sc.close();

	}

}
