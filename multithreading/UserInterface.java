package multithreading;
class classA {
	public void display() {
		for(int i=1;i<=10;i++) {
			System.out.println("Class A -"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class classB{
	public void display() {
		for(int i=1;i<=10;i++) {
			System.out.println("Class B -"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 classA A=new classA();
		 classB B=new classB();
		 Thread tr1=new Thread() {
			 @Override 
			 public void run() {
				 A.display();
			 }
			 
			 
		 };
		
		 Thread tr2=new Thread() {
			 @Override 
			 public void run() {
				 B.display();
			 }
		 };
		 
		 
		 tr1.start();
		 tr2.start();

	}
}

