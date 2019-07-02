package kr.co.jhta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.jhta.dao.DepartmentDao;
import kr.co.jhta.dao.EmployeeDao;
import kr.co.jhta.vo.Department;
import kr.co.jhta.vo.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private DepartmentDao departmentDao;
	@Autowired
	private EmployeeDao employeeDao;
	
	@RequestMapping("/employee.do")
	public String employee(int empid, Model model) {
		
		Employee employee = employeeDao.getEmployeeById(empid);
		model.addAttribute("employee", employee);
		
		return "emp/employee";
	}
	
	@RequestMapping("/employees.do")
	public String employeeslist(int deptid, Model model) {
		
		List<Employee> employees = employeeDao.getEmployeesByDepartmentId(deptid);
		model.addAttribute("employees", employees);
		
		return "emp/employees";
	}
	
	@RequestMapping("/depts.do")
	public String depts(Model model) {
		
		List<Department> departments = departmentDao.getAllDepartments();
		model.addAttribute("departments", departments);
		
		return "emp/depts";
	}
}
