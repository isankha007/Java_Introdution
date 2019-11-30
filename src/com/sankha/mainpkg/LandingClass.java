package com.sankha.mainpkg;
import com.sankha.employee.Employee;
public class LandingClass {

	public static void main(String[] args) {
		//Class cls = Class.forName("com.sankha.Employee");
		Employee emp = new Employee("sankhadeep",10);
		
		emp.setName("No name");
		emp.setId(23);
		System.out.println(emp.getName()+" "+emp.getId());

	}

}
