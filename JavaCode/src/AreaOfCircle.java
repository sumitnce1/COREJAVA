//1. Area of circle and circumference

public class AreaOfCircle {
	
	public static void main(String[] args) {
		float radius = 5;
		double area, circum;
		area= Math.PI *Math.pow(radius, 2);
		circum = 2 * Math.PI* radius;
		
		System.out.println("Area of Circle is=" +area);
		System.out.println("Circumference is=" +circum);
		
	}

}

