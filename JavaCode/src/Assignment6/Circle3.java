/* 3.Create a class named 'Shape' with a method to print "shape". Then create two other classes named 'Rectangle', 'Circle' 
 * inheriting the Shape class, both having a method to print " rectangular shape" and "circular shape" respectively. Create a subclass
 *  'Square' of 'Rectangle' having a method to print "Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by 
 *  the object of 'Square' class. 
 */
package Assignment6;

class Shape {
    public void design(){
        System.out.println("Shape");
    }
}
class Rectangle extends Shape{
    public void design(){
        System.out.println("Rectangular shape");
    }
}
class Circle extends Shape{
    public void design(){
        System.out.println("Circular shape");
    }
}
class Square extends Rectangle{
    public void design(){
        super.design();
        System.out.println("Square is a rectangle");
    }
}
public class Circle3{

	public static void main(String[] args){
		Square sq = new Square();
        sq.design();
        Rectangle rec = new Rectangle();
        rec.design();
        Shape shape = new Shape();
        shape.design();
	}
}
