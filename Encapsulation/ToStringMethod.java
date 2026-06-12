package com.encapsulation;
class Employee{
	private int employeeId;
	private String employeeName;
	private float salary;
	private String department;
	private String city;
	public Employee(int employeeId, String employeeName, float salary, String department, String city) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.department = department;
		this.city = city;
	}
	public String toString() {
		return employeeId+"\n"+employeeName+"\n"+salary+"\n"+department+"\n"+city;
	}
}
public class ToStringMethod {

	public static void main(String[] args) {
		Employee e1 = new Employee(10, "Darshan", 4000, "SDE", "Bengaluru");
		System.out.println(e1);
	}

}
//Output
//10
//Darshan
//4000.0
//SDE
//Bengaluru