package client;


import java.util.Scanner;

import book_store.User;
import dao.UserDAO;
import service.UserService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	//	Map<Integer,User> createdCustomer = new HashMap<>();
		int choice;
		do {
		System.out.println(" 1.create User\n 2.update user\n 3.Delete User\n 4.get\n 5.Exit");
		System.out.println("Enter your choice: ");
		choice = Integer.parseInt(scan.nextLine());
		switch(choice) {
		
		case 1:
		System.out.println("Enter the number of customers:");
		int noOfCustomers = Integer.parseInt(scan.nextLine());
		for(int i=1;i<=noOfCustomers;i++) {
		System.out.println("Enter Your Details:");
		//scan.nextLine();
		
		System.out.println("Enter your fullname:");
		String name = scan.nextLine();
		System.out.println("Enter your email:");
		String email = scan.nextLine();
		System.out.println("Enter the password:");
		String pass = scan.nextLine();
		User u = new User(email,name,pass);
		UserService userservice = new UserService(new UserDAO());
		userservice.saveUser(u);
		}
		break;
		case 2:
			System.out.println("Enter the keyid to update:");
			int id = Integer.parseInt(scan.nextLine());
			System.out.println("Enter the new values:");
			System.out.println("Enter your fullname:");
			String name = scan.nextLine();
			System.out.println("Enter your email:");
			String email = scan.nextLine();
			System.out.println("Enter the password:");
			String pass = scan.nextLine();
			User u =new User(id,email,name,pass);
			UserService userservice = new UserService(new UserDAO());
			userservice.updateUser(u);
			break;
			
		case 3:
			User u2 = new User();
			System.out.println("Enter the id to be deleted: ");
			u2.setUserid(Integer.parseInt(scan.nextLine()));
			System.out.println("Enter the email to be deleted: ");
			u2.setEmail(scan.nextLine());
			System.out.println("Enter the fullname to be deleted: ");
			u2.setFullname(scan.nextLine());
			System.out.println("Enter the password to be deleted: ");
			u2.setPassword(scan.nextLine());
			UserService userservice1 = new UserService(new UserDAO());
			userservice1.deleteUser(u2);
			break;
			
		case 4:
			int gid;
			System.out.println("Enter the id:");
			gid = Integer.parseInt(scan.nextLine());
			UserService userservice2 = new UserService(new UserDAO());
			User u1 = userservice2.getUser(gid);
			System.out.println(u1);
			
			break;
			
		}
		}while(choice!=5);
		
		
	}

}
