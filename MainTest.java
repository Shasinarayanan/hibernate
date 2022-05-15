package com.edubridge.onetoonemapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			 Configuration cfg=new Configuration();
			    System.out.println("2222222222222222222222222222");
			    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
			    System.out.println("3333333333333333333333333333");
			    //creating seession factory object  
			    SessionFactory factory=cfg.buildSessionFactory();  
			    System.out.println("4444444444444444444444444");
			    //creating session object  
			    Session session=factory.openSession();  
			    System.out.println("5555555555555555555555555");
			    //creating transaction object  
			    Transaction t=session.beginTransaction();  
			    
			    Address address=new Address();
			  //  address.setStreet("2nd block");
			    address.setCity("mangalore");
			    address.setState("Karnataka");
			  //  address.setPincode("98653");
		
			    
			    Employee employee=new Employee();
			    employee.setName("satish");
			    employee.setEmail("satish@gmail.com");
			   // Address address1=session.get(Address.class,1);
			    employee.setAddress(address);//employee is mapping with address
			    address.setEmployee(employee);//address is mapping with employee
			    
			    session.save(employee);
			    t.commit();
			    session.close();
	}catch(Exception ex)
	{
		System.out.println(ex.getMessage());
	}
		}

	

	}


