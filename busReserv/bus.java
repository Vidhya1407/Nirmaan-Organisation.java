package busReserv;

public class bus {
	private int busNo;
	private boolean ac;
	private int capacity;
	
    bus(int no,boolean ac,int cap) {
		this.busNo=no;
		this.ac=ac;
		this.capacity=cap;
	}

	public int getCapacity() {   //accessor method
		return capacity;
	}

	public void setCapacity(int capacity) {   //mutator method
		this.capacity = capacity;
	}

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	
	public void displayBusInfo() {
		System.out.println( "Bus No = " + busNo + "\tAc= " + ac + "\tCapacity = " + capacity );
	}
    
	
	
	

}
