package Bus;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
	String passengerName;
	int busNo;
	Date date;
	
	public Booking() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the passenger name: ");
		passengerName=scanner.next();
		System.out.println("Enter Bus No: ");
		busNo=scanner.nextInt();
		System.out.println("Enter Date : dd-mm-yyyy");
		String dateInput=scanner.next();
		SimpleDateFormat dateFormat=new  SimpleDateFormat("dd-MM-yyyy"); 

		try {
			date=dateFormat.parse(dateInput);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
	}
	
public boolean isAvailable(ArrayList<Booking>bookings,ArrayList<Bus>bus) {
	int capacity=0;
  for(Bus buses:bus) {
	  if(buses.getBusNo()==busNo)
		  capacity= buses.getCapacity();
  }
  int booked=0;
  for(Booking b:bookings) {
	  if(b.busNo==busNo && date.equals(date)) {
		  booked++;
	  }
  }
  return booked<capacity?true:false;    
  
}
}