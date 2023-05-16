import java.util.Scanner;

public class Exercise11_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three sides for a triangle: ");
			double side1 = input.nextDouble();
			double side2 = input.nextDouble();
			double side3 = input.nextDouble();
			
		System.out.print("Enter color for triangle: ");
			String color = input.next();
			
		System.out.print("Is the triangle filled? True or false: ");
			boolean filled = input.nextBoolean();
			
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
		triangle.setFilled(filled);
		
		System.out.println(triangle.toString());
		System.out.println("Triangle area: " + triangle.getArea());
		System.out.println("Triangle perimeter: " + triangle.getPerimeter());
		System.out.println("Triangle color: " + triangle.getColor());
		System.out.println("Date triangle was made: " + triangle.getDateCreated());
		System.out.println("Triangle is " + (triangle.isFilled() ? " " : "not") + "filled");
	}
}