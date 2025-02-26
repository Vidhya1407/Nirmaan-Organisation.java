package busReserv;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class booking {
	String passengerName;
	int busNo;
	Date date;
	
	booking(){
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter the passenger Name : ");
        passengerName=sc.next();
        System.out.print("Enter the Bus Number : ");
        busNo=sc.nextInt();
        System.out.print("Enter Date (dd:mm:yyyy) : ");
        String dateInput=sc.next();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd:MM:yyyy");
        
        try {
			date=dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean isAvailable(ArrayList<booking> bookings,ArrayList<bus>buses) {
		int capacity=1;
		for(bus Bus:buses) {
			if(Bus.getBusNo()==busNo)
				capacity=Bus.getCapacity();
		}
		int booked=0;
		for(booking B:bookings) {
			if(B.busNo==busNo && B.date.equals(date)) {
				booked++;
			}
		}
		return booked<capacity?true:false;
	}

}
