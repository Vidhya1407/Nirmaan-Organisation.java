package busReserv;
import java.util.Scanner;
import java.util.ArrayList;
public class BusDemo {

	public static void main(String[] args) {
		//bus buses[]=new bus[50];//ArrayList - collection
		
		ArrayList<bus> buses=new ArrayList<bus>();     //to call multiple bus in the array list of buses.
		ArrayList<booking> bookings=new ArrayList<booking>();

		buses.add(new bus (1,true,2));
		buses.add(new bus (2,false,50));
		buses.add(new bus (3,true,40));

		int userOption=1;
		Scanner sc=new Scanner(System.in);
		
		for(bus b:buses) {
			b.displayBusInfo();
		}
		
		while(userOption==1) {
	        System.out.println("Enter 1 to booking and 2 to exit ");
            sc.nextInt();
            if(userOption==1) {
    	        System.out.println("Booking............");
    	        booking isBook=new booking();
                if(isBook.isAvailable(bookings,buses)) {
                	bookings.add(isBook);
    	            System.out.print("Your Booking is Confirmed ");
                }else
        	        System.out.println("Sorry! Bus is Full. Try another Bus or Date.");
	
            }
		}
		
	}

}
