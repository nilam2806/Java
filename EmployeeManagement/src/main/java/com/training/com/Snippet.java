package com.training.com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Snippet {
	private static EntityManager em;

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("StudentPU");
		em = emf.createEntityManager();

		em.getTransaction().begin();

		Address a1 = new Address();
		a1.setE_pincode(201301);
		a1.setE_city("Pune");
		a1.setE_state("Maharashtra");
//
//
//
//
//
		Address a2 = new Address();
		a2.setE_pincode(302001);
		a2.setE_city("Bangalore");
		a2.setE_state("Karanataka");
//
		
		
        Department d1=new Department();
		d1.setDept_id(101);
		d1.setDepartment_name("Science");
		d1.setDepartment_head("Yash");
//
		
		
		Employee e1 = new Employee();
		e1.setE_id(1);
		e1.setE_name("Vijay");
		e1.getAddress().add(a1);
//
		
		
		Employee e2 = new Employee();
		e2.setE_id(2);
		e2.setE_name("John");
		e2.getAddress().add(a2);
		
		

		em.persist(e1);
		em.persist(e2);

		em.getTransaction().commit();

		em.close();
		emf.close();

	}

}
