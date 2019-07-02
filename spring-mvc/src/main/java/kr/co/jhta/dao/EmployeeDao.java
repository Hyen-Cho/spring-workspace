package kr.co.jhta.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import kr.co.jhta.vo.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	private SqlMapClientTemplate template;
	
	public Employee getEmployeeById(int empid) {
		return (Employee) template.queryForObject("getEmployeeById", empid);
	}
	
	public List<Employee> getEmployeesByDepartmentId(int deptid) {
		return template.queryForList("getEmployeesByDepartmentId", deptid);
	}
}
