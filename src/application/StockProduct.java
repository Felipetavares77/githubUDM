package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class StockProduct {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter the product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println(product);
		System.out.println();
		
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println("Enter the number of products to be removed from stock: ");
		product.quantity = sc.nextInt();
		product.excludeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();
	}

}