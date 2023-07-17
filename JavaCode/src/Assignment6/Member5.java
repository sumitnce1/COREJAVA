/* 5.Create a class named 'Member' having the following members:
    data members(variables)
   - Name
   - Age
   - Address
   - Salary
    Two classes 'Emp' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes
    have data members 'shift' and 'department' respectively.
    Now, assign name, age, address and salary to an employee and a manager by making an object of both of these classes and print the same. */
package Assignment6;

class Member {
    String name,add;
    int age; 
    double sal;
}
class Employee extends Member{
    String shift, dept;
}
class Manager extends Member{
    String dept;
}
public class Member5 {

	public static void main(String[] args) {
		Employee emp = new Employee();
        emp.name= "Rahul Kumar";
        emp.age= 23;
        emp.add= "CDAC Patna";
        emp.sal= 45000.00;
        emp.shift= "Night";

        Manager mng = new Manager();
        mng.name= "SUMIT KUMAR";
        mng.age= 23;
        mng.add= "CDAC Patna";
        mng.sal= 78000.00;
        mng.dept = "Management";
        
        System.out.println("Name: " +emp.name);
        System.out.println("Age: " +emp.age);
        System.out.println("Address: "+emp.add);
        System.out.println("Salary: "+emp.sal);
        System.out.println("Shift: "+emp.shift);
        
        System.out.println("");
        
        System.out.println("Name: "+mng.name);
        System.out.println("Age: "+mng.age);
        System.out.println("Address: "+mng.add);
        System.out.println("Salary: "+mng.sal);
        System.out.println("Department: "+mng.dept);
               
	}
}
