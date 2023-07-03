package com.KodNest.DAO_Design_Pattern;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class EmployeeDAOImplementation implements EmployeeDAO {

	SessionFactory sf = null;

	public SessionFactory getSessionFactory() {

		if (sf == null) {
			// create the hibernate configuration
			Configuration configuration = new Configuration();

			// configure hibernate.cfg.xml file
			configuration.configure("hibernate.cfg.xml");

			// create service registry
			StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();

			// build session factory
			sf = configuration.buildSessionFactory(serviceRegistry);

			return sf;
		}
		return sf;
	}

	@Override
	public List<Employee> getEmployees() {
		Session session = null;
		try {
			sf = getSessionFactory();
			session = sf.openSession();
			session.beginTransaction();

			Criteria criteria = session.createCriteria(Employee.class);
			List<Employee> emplist = criteria.list();
			return emplist;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public Employee getEmployeeById(int id) {
		Session session = null;
		try {
			sf = getSessionFactory();
			session = sf.openSession();
			session.beginTransaction();

			Employee emp = (Employee) session.get(Employee.class, id);
			return emp;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public String persistEmployee(Employee obj) {
		Session session = null;
		try {
			sf = getSessionFactory();
			session = sf.openSession();
			session.beginTransaction();

			session.persist(obj);
			session.getTransaction().commit();

			return "Object Saved to Database";

		} catch (Exception e) {
			e.printStackTrace();
			return "Something went Wrong! Please check...";
		} finally {
			session.close();
		}
	}

	@Override
	public String updateEmployee(Employee obj) {
		Session session = null;
		try {
			sf = getSessionFactory();
			session = sf.openSession();
			session.beginTransaction();

			session.update(obj);
			session.getTransaction().commit();

			return "Object Updated Successfully!";
		} catch (Exception e) {
			e.printStackTrace();
			return "Something went Wrong! Please check...";
		} finally {
			session.close();
		}
	}

	@Override
	public String deletetEmployee(Employee obj) {
		Session session = null;
		try {
			sf = getSessionFactory();
			session = sf.openSession();
			session.beginTransaction();

			session.delete(obj);

			return "Object Deleted Successfully!";
		} catch (Exception e) {
			e.printStackTrace();
			return "Something went Wrong! Please check...";
		} finally {
			session.getTransaction().commit();
			session.close();
		}
	}

}
