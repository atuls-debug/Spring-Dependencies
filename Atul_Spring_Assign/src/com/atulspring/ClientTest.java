 
package com.atulspring;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientTest {
public static void main(String[] args) {
	
	Resource r=new ClassPathResource("applicationContext.xml");
	BeanFactory factory=new XmlBeanFactory(r);
	
	EmployeeDAO dao=(EmployeeDAO)factory.getBean("d");
	
	Employee2 e=new Employee2();
	e.setId(1);
	e.setBasic(100000);
	e.setDa(50000);
	e.setDeductions(2000);
	e.setHra(15000);
	e.setName("Atul Sharma);
 
	
	dao.saveEmployee(e);
	System.out.println("Record inserted...");
	
	List <Employee2> empLst = dao.getEmployee("Atul Sharma");
	
	
	for (Employee2 emp : empLst)
	{
		 
		
		int basic = emp.getBasic();
		int hra = emp.getHra();
		int da = emp.getDa();
		int gross_salary = basic + hra + da;
		System.out.println("Gross salary "+gross_salary);
		
		int deductions = emp.getDeductions();
		
		float total_deductions = deductions + (float)0.15*basic;
		System.out.println("Deductions "+total_deductions);
		
		float total_sal = gross_salary - total_deductions;
		System.out.println("Final salary is "+total_sal);
		
		
		
	}
	
	
	
	
}
}
