package com.oyo;

import java.util.ArrayList;
import java.util.List;

public class UserUtil {
	User user= new User("Raj", 25, "male", 5556876, 9789687, "raj@gmail.com");
	User user2= new User("Mani", 34, "male", 9876, 12345, "mani@gmail.com");
	User user3= new User("ravi", 25, "male", 984768, 32134, "ravi@gmail.com");
	User user4= new User("lakshmi", 25, "female", 65419, 5239877, "lakshmi@gmail.com");
	
	public List<User> getUserDetails() {
		List<User> userlist= new ArrayList<>();
		userlist.add(user);
		userlist.add(user2);
		userlist.add(user3);
		userlist.add(user4);
		
		return userlist;
		
		
	}
	
	
	
	

}
