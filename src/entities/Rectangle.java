package entities;

public class Rectangle {
	
	public double width;
	public double height;
	
	public double areaRec(){
		return width * height;
	}
	public double perimeterRec(){
		return (width + height) * 2; 
	}
	public double diagonalRec(){
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	public String toString() {
		return "The width of rectangle is: " + String.format("%.2f\n", width) + 
				"The Height of rectangle is: " + String.format("%.2f\n", height) + 
				"The Area of rectangle is: " + String.format("%.2f\n", areaRec()) +
				"The Perimeter of rectangle is: " + String.format("%.2f\n", perimeterRec()) +
				"The Diagonal of retangle is: " + String.format("%.2f", diagonalRec());
	}
}
