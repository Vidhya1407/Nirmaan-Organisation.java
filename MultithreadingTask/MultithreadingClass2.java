package MultithreadingTask;
//Mutithreading - using Runnable interface
// why runnable interface?@FunctionalInterface(SAM)
//  ->  we cannot use multiple inheritance by using multiple thread classes, so we go with runnable interface.
class classA implements Runnable{
	public void run() {                //override
		for(int i=1;i<=5;i++) {
			System.out.println("First Loop  "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class classB implements Runnable{
	public void run() {                //override
		for(int i=1;i<=5;i++) {
			System.out.println("Second Loop "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class MultithreadingClass2 {

	public static void main(String[] args) {
		classA obj1=new classA();
		classB obj2=new classB();
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
		t1.start();// it calls run method by using thread method
	    try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}//it waits for second process to start
		t2.start();
		
	}

}
