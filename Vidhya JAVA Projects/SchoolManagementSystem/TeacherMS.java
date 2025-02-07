package SchoolManagementSystem;

public class TeacherMS {
		int id;
		String name;
		long mobileNo;
		double salary;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		public long getMobileno() {
			return mobileNo;
		}
		public void setMobileno(long mobileno) {
			this.mobileNo = mobileNo;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		
		public TeacherMS(int id, String name, long mobileno, double salary) {
			super();
			this.id = id;
			this.name = name;
			this.mobileNo = mobileNo;
			this.salary = salary;
		}
		public TeacherMS() {
			
		}
		@Override
		public String toString() {
			return "Teacher [Id = " + id + ", Name = " + name + ", MobileNumber = " + mobileNo + ", Salary = " + salary + "]";
		}

	}
