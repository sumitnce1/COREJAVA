/* 2.Create a class 'Degree' having a method ' getDegree' that prints "I got a degree". It has two subclasses namely 'Undergraduate' and 'Postgraduate' 
 * each having a method with the same name that prints "Undergraduate" and "Postgraduate" respectively. Call the method by creating 
 * an objects of  subclasses respectively.
 */
package Assignment6;

class Degree{
    public void getDegree(){
        System.out.println("I got a degree");
    }
}
class Undergraduate extends Degree{
    public void getDegree() {
        System.out.println("Undergraduate");
    }
}
class Postgraduate extends Degree{
    public void getDegree(){
        System.out.println("Postgraduate");
    }
}

public class DegreeCertificate2{

	public static void main(String[] args){
		Degree bg = new Degree();
        Undergraduate ug = new Undergraduate();
        Postgraduate pg = new Postgraduate();    
        bg.getDegree();
        ug.getDegree();
        pg.getDegree();

	}
}
