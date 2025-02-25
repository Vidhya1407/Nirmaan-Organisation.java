package multithreading;


class classOne{
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

class classTwo{
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
public class InterfaceByUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 classOne A=new classOne();
		 classTwo B=new classTwo();
		 
		 Runnable r1=new Runnable() {
			 public void run() {
				 A.display();
			 }
		 };
		 
	
		 
		 Runnable r2=new Runnable() {
			 public void run() {
				 B.display();
			 }
		 };
		 

		 Thread thr1=new Thread(r1);
		 Thread thr2=new Thread(r2);
		 
		 
		 thr1.start();
		 thr2.start();


	}

}
