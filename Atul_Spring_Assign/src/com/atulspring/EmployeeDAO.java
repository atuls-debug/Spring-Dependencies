package com.atulspring;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class EmployeeDAO {
	HibernateTemplate template;
	SessionFactory factory1;

	public void setSessionFactory(SessionFactory factory) {
		template=new HibernateTemplate(factory);
		factory1 = factory;
	}

	public void saveEmployee(Employee2 e){
		template.save(e);
	}
	
	public List<Employee2> getEmployee (String name)
	{	 
	 
	String query = "FROM Employee2 WHERE name = '"+name+"'";
	Session session = factory1.openSession();
	
	List<Employee2> emplst = session.createQuery(query).list();
	return emplst;
	
	
	
	}

}

