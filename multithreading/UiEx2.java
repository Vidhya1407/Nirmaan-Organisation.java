package multithreading;

class Ex2 {
	void add() {
		System.out.println(10+10);
	}
	

}

public class UiEx2{
	public static void main(String[] args) {
		Ex2 ex=new Ex2() {
			public void add() {
				System.out.println("Add : "+100+100);
			}
		};
		
		ex.add();
		
		Ex2 ex2=new Ex2();
		ex2.add();
	}
}
