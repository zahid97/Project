package test;

import employee.Employee;
import employeedao.EmployeeDao;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDao employeeDAO = new EmployeeDao();
		//Employee emp = new Employee("Zahid", "Pune", 2000.00);
       
		//employeeDAO.saveEmployee(emp);
		
	//	Employee emp1 = employeeDAO.getEmployee(1L);
		//System.out.println(emp1);
		
		employeeDAO.deleteEmployee(new Employee(1L,"xzsh","pune",2000.00));
	}

	
	
	
}
