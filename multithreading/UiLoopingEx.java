package multithreading;

class ExampleProgram extends Thread{
	public  void run() {
	     for(int i=1;i<=10;i++) {
				System.out.println("Loop 1 : "+i);
				try {
					Thread.sleep(1000);
				}catch(Exception e) {
					System.out.println(e);
				}
			}
	}
}
class ExampleProgram2 extends Thread{
	public  void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Loop 2 : "+i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		}
	}
	
	

public class UiLoopingEx {

	public static void main(String[] args) {
		ExampleProgram ex=new ExampleProgram();
		
		ExampleProgram2 ex1=new ExampleProgram2();
		
		ex.run();
		ex1.run();
		System.out.println("...............");
		ex.start();
		ex1.start();

	}

}
