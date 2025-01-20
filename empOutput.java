package day12;

public class empOutput{
	public static void main(String[] args) {
		Employee E=new Employee("Kumar","v123456",9788667566l,25000d);
		
		System.out.println(E.getName());
		System.out.println(E.getId());
		System.out.println(E.getPhnNo());
		System.out.println(E.getSalary());
		
		System.out.println(E);
				
		Employee E1 = new Employee();
		
		E1.setName("Riya");
		E1.setId("R243546");
		E1.setPhnNo(9387474745l);
		E1.setSalary(30000d);
		
		System.out.println(E1.getName());
		System.out.println(E1.getId());
		System.out.println(E1.getPhnNo());
		System.out.println(E1.getSalary());
		
		System.out.println(E1);
	}
}