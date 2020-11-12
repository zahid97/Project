package database;

public class UserCrudOps {

	public static final String INSERT_USER = "Insert into bookstore(userid,email,fullname,password) Values (?,?,?,?)";

	public static final String UPDATE_USER = "Update bookstore set email=?, fullname = ? ,password = ? where userid = ?";

	public static final String DELETE_FROM_USER = "Delete from bookstore where userid = ?";

	public static final String GET_USER = "Select * from bookstore where userid = ?";

	public static final String GET_ALL = "Select * from bookstore";

}
