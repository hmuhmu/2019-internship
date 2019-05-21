package com.jdc.jpa.main;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jdc.jpa.entity.Employee;

//import com.jdc.jpa.entity.Order;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_db1");
		EntityManager em = emf.createEntityManager();
		
		Employee emp = em.find(Employee.class,1);
		System.out.println(emp.getCode());
		System.out.println(emp.getName());
		System.out.println(emp.getPhone());
		
		/*Order ord = em.find(Order.class, 1);
	    System.out.println(ord.getItem());
	    System.out.println(ord.getUnitPrice());
	    System.out.println(ord.getCount());*/

		em.close();
		emf.close();	
    
      	
	}

}
