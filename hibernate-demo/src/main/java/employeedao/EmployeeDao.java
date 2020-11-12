package employeedao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import employee.Employee;

public class EmployeeDao {
private SessionFactory sessionFactory;

	
	public EmployeeDao() {
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        this.sessionFactory =  cfg.buildSessionFactory();
	}

	private void close() {
		sessionFactory.close();
	}

	public void saveEmployee(Employee emp) {
		
		Session session =  sessionFactory.openSession();
		
		session.beginTransaction();
		session.save(emp);
		session.getTransaction().commit();
		
	}
	public Employee getEmployee(Long id){
		Employee e = null;
		Session session =  sessionFactory.openSession();
		session.beginTransaction();
		e =	session.find(Employee.class, id);
		return e;
	}
	
	public void updateEmployee(Employee e) {
		Session session =  sessionFactory.openSession();
		session.beginTransaction();
		session.update(e);
		session.getTransaction().commit();
	}
	
	public void deleteEmployee(Employee e) {
		Session session =  sessionFactory.openSession();
		session.beginTransaction();
		session.delete(e);
		session.getTransaction().commit();
	}
	
}
