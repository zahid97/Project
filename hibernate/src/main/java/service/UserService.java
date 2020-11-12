package service;
import book_store.User;
import dao.UserDAO;

public class UserService {
	public UserDAO userdao;

	public UserService(UserDAO userdao) {
		super();
		this.userdao = userdao;
	}

	public User saveUser(User u) {
		User u1 = null;
		u1 = userdao.createUser(u);
		return u1;
	}

	public User updateUser(User u) {
	User u1 = userdao.updateUser(u);
		return u1;
	}

	public void deleteUser(User u) {
			userdao.deleteUser(u);
		}

	public User getUser(int id) {
		User u = null;
		u = userdao.get(id);
		return u;
	}
}
