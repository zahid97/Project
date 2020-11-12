package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import book_store.User;

public class UserDAO {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("hibernate");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction tx = manager.getTransaction();

	public User createUser(User u) {
		tx.begin();
		manager.persist(u);
		tx.commit();
		return u;
	}

	public User updateUser(User u) {

		tx.begin();
		User u1 = get(u.getUserid());
		u1.setEmail(u.getEmail());
		u1.setFullname(u.getFullname());
		u1.setPassword(u.getPassword());
		tx.commit();
		return u1;
	}

	public void deleteUser(User u) {
		// TODO Auto-generated method stub

		User u1 = get(u.getUserid());
		tx.begin();
		manager.detach(u1);
		tx.commit();
	}

	public User get(int gid) {
		// TODO Auto-generated method stub
		User u = manager.find(User.class, gid);
		// System.out.println(u);
		return u;
	}

}
