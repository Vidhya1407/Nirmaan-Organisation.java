package ExceptionHandlingExample;
import java.util.Scanner;
/*
  THROW KEYWORD:
      *It is used to explicitly throw an exception during program execution.
      *Syntax: throw new ExceptionType("Error message");
  When to use throw?
       1.Custom Exception Handling
       2.Validating Input
       
  THROWS KEYWORD:
       *It is used in a method declaration to specify the types of Exception that the method can throw during its execution.
       *Syntax:
            returnType methodName(parameter) throws ExceptionType1,...,ExceptionTypeN{
                   //method body
            }
   When to use throws?
        1.Checked Exception Handling
        2.Custom Exception Handling
        
     */
public class throwAndThrows {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
			Bank bank= new  Bank(1000);//initialBalance: 1000
			System.out.println("--------------------------------------");
			System.out.println("Welcome to Banking Application");
			System.out.println("--------------------------------------");
			int choice;
			int amount;
	
			do {
				System.out.println("Click 1 for Deposit.");
				System.out.println("Click 2 for Withdraw. ");
				System.out.println("Click 3 for Exit.");
				System.out.println();
				System.out.println("Enter your Choice");
				choice=sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter amount to deposit : ");
					amount=sc.nextInt();
					bank.deposit(amount);
					break;
				case 2:
					System.out.println("Enter amount to withdraw : ");
					amount=sc.nextInt();
					bank.withdraw(amount);
					break;
				case 3:
				     System.out.println(0);
				default:
					throw new IllegalArgumentException("Unexpected value: " + choice);
				}
			}while(true);

		}catch (InsufficientFundsException e) {
			System.out.println("Exception : "+e.getMessage());
		}catch (InvalidAmountException e) {
			System.out.println("Exception : "+e.getMessage());
		}catch (Exception e) {
			System.out.println("Exception : "+e.getMessage());
		}finally {
			sc.close();
			System.out.println("Thank You, Visit Again.");
		}
	}
}