package DesignPattern_factory;

public class BookingFactory {

	public static Booking createBooking (String acTireType){
		
		
		if(acTireType.equalsIgnoreCase("first"))
		{
			return new BookingImpl_FirstTire();
		}
		else if(acTireType.equalsIgnoreCase("second"))
		{
			return new BookingImpl_SecondTire();
		}
		else if(acTireType.equalsIgnoreCase("third"))
		{
			return new BookingImpl_ThirdTire();
		}
		
		throw	
		new IllegalArgumentException("please enter acTireType from -> first,second,third");
		
		
		
		
		
		
}
	
	
	
	
	
	
	
	
	
	
	
	
}
