package Array;

import java.util.Scanner;

class Employee{
	//instance variable
	double salary_of_employee;
	double hour;
	void getInfo(double hourperday, double salary) {
		salary_of_employee=salary;
		hour=hourperday;
	}
	void addSalary() {
		if(salary_of_employee<5000) {
			System.out.println("increment in salary: " +(salary_of_employee+100));
		}else {
			System.out.println("no increment in salary.");
		}
	}
	void addWork() {
		if(hour>6) {
			System.out.println("Increment in salary: " +(salary_of_employee+25));
		}
		else {
			System.out.println("No increment due to hours.");
		}
	}
}
public class FinalSalary {

	public static void main(String[] args) {
		Scanner input = new Scannner(System.in);
		
		Employee obj=new Employee();
		System.out.println("Enter Salary: ");
		double salary= input.nextDouble();
		
		obj.getInfo(h,salary); //getinfo
		obj.addWork();
		obj.addSalary();
		

	}

}
