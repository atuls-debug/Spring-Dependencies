package com.atulspring;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
public class EmpsMapper implements RowMapper<Employee2> {
	public Employee2 mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee2 emp = new Employee2();
		emp.setBasic(rs.getInt("basic"));
		emp.setDa(rs.getInt("da"));
		emp.setDeductions(rs.getInt("deductions"));
		emp.setHra(rs.getInt("hra"));
		emp.setId(rs.getInt("id"));
		emp.setName(rs.getString("name"));
 
 
		
		
		
		return emp;
	}  
}