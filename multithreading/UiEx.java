package multithreading;

class Class1 implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("LOOP 1 : "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
 class Class2 implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("LOOP 2 : "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
 public class UiEx{
	 public static void main(String[] args) {

		 Class1 c1=new Class1();
		 Class2 c2=new Class2();
		 Thread tr1=new Thread(c1);
		 Thread tr2=new Thread(c2);
		 tr1.start();
		 tr2.start();
	}
 }
