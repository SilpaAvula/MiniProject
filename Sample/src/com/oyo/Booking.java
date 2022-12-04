package com.oyo;

import java.util.List;

public class Booking  implements BookingInterf{
	static UserUtil ul= new UserUtil();
	public static void main(String[] args) {
		getBookUser();
	}
	
	public static void getBookUser() {
	List<User> user=ul.getUserDetails();
	System.out.println("Users List "+user + '\n' ) ;
	}

	@Override
	public void getbooking() {
		List<User> user=ul.getUserDetails();
		System.out.println("Users List "+user + '\n' ) ;		
	}

	@Override
	public void getcencel() {
		List<User> user=ul.getUserDetails();
		System.out.println("Users List "+user + '\n' ) ;
		
	}

	@Override
	public void getBookingAmount() {
		//List<User> user=ul.getUserDetails();
		System.out.println("Booking Amount is 2140898" ) ;		
	}
	

}
