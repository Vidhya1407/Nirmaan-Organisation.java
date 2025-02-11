package BankManagementSystem;

public class Bank {
	private int Acc_Id=1010;
	private String name="Vidhya.S";
	private int pin=112333;
	private double balance=200000.00;
	public int getAcc_Id() {
		return Acc_Id;
	}
	public void setAcc_Id(int acc_Id) {
		Acc_Id = acc_Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "\nBank [Acc_Id=" + Acc_Id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	public Bank(int acc_Id, String name, int pin, double balance) {
		super();
		this.Acc_Id = acc_Id;
		this.name = name;
		this.pin = pin;
		this.balance = balance;
	}
	public Bank() {
		
	}
	
	
	


}
