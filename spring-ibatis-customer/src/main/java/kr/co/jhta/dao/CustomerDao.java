package kr.co.jhta.dao;

import java.util.List;

import org.springframework.orm.ibatis.SqlMapClientTemplate;

import kr.co.jhta.vo.Customers;

public class CustomerDao {

	private SqlMapClientTemplate template;
	public void setTemplate(SqlMapClientTemplate template) {
		this.template = template;
	}
	
	public List<Customers> getAllCustomers() {
		return template.queryForList("getAllCustomers");
	}
	
	public Customers getCustomerById(int no) {
		return (Customers) template.queryForObject("getCustomerById", no);
	}
}
