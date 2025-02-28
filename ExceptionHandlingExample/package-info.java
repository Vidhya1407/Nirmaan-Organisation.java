package ExceptionHandlingExample;
class InsufficientFundsException extends Exception{
	
	public InsufficientFundsException(String str) {
		super(str);
	}
}
class InvalidAmountException extends RuntimeException{
		
	public InvalidAmountException(String str) {
		super(str);
	}
}

class Bank{
	double initialBalance;
	
	Bank(double initialBalance){
		this.initialBalance=initialBalance;
	}
	
	void Bank(){
		
	}
	
	void withdraw(double amount)throws InsufficientFundsException{
		if(initialBalance<amount) {
			throw new InsufficientFundsException("Insufficient Balance");
		}
		
		initialBalance -= amount;
		System.out.println("Withdraw Successfully!, Remaining Balance : "+initialBalance);
		System.out.println();
		}
	void deposit(int amount) {
		if(amount<=0) {
			throw new InvalidAmountException("Invalid amount - should be greater than zero.");
			
		}
		initialBalance+=amount;
		System.out.println("Deposit Successfully!!!.");
		System.out.println();
	}
	
	}
