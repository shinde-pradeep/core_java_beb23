package DesignPattern_factory;

import java.util.Scanner;

public class FactoryTesting {

	public static void main(String[] args) {
		
		System.out.println("Enter ac tyre/class type -");
		
		Scanner sc=new Scanner(System.in);
		
		String acClassTypeByUser = sc.nextLine();
		
		Booking booking=BookingFactory.createBooking(acClassTypeByUser);
		
		System.out.println(booking.getACClass());
		
		sc.close();
		
		
	}
}
