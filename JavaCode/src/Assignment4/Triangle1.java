//1.Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units 
// by creating a class named 'Triangle' with constructor having the three sides as its 
package Assignment4;

class Triangle{
    float s1,s2,s3;
    
    public Triangle(float s1, float s2, float s3) {
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }
    float getPerimeter(){
        return s1+s2+s3;
    }
    float getArea() {
        double s = (s1+s2+s3)/2;
        return (float) Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
    }
}

public class Triangle1 {

    public static void main(String[] args) {
        Triangle t = new Triangle(3, 4, 5);
        
        System.out.println("Perimeter: " + t.getPerimeter());
        System.out.println("Area: " + t.getArea());
    }
}