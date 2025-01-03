package day10;

public class ConstructorExample {
	int carId;
	String carName;
	
   
    ConstructorExample(int id,String name){
    	carId=id;
    	carName=name;
    }
 ConstructorExample() {
    	
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		ConstructorExample coex= new ConstructorExample(1001,"tata");
		System.out.println(coex.carId+"    "+coex.carName);
		
		ConstructorExample coex2 = new ConstructorExample();
		coex2.carId = 1001;
		coex2.carName="honda";
		System.out.println(coex2.carId+"    "+coex2.carName);
		
	}

}
