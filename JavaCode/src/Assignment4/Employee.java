//4. WAP to create a ‘Employee’  class and define a constructor that accept three argument 
//( first argument - name , second argument- age,   third  argument  – monthly salary ) and 
//define a normal method that print all these values.
package Assignment4;

public class Employee {
	String name;
    int age;
    double sal;
    
    Employee(String name, int age, float sal) {
        this.name=name;
        this.age=age;
        this.sal=sal;
    }
    void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age +" Years");
        System.out.println("Monthly Salary: " + sal +" /-Only");
    }

	public static void main(String[] args) {
		Employee emp = new Employee("Sumit Kumar", 23, 45000);
	    emp.getDetails();
	}
}