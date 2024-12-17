package ppt;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		Employee e2=new Employee("Jack",50);
		Employee e3=new Employee("Chloe",40,5000);
		e1.printDetails();
		e2.printDetails();
		e3.printDetails();
	}
}
	class Employee{
		private String name;
		private int age;
		private int salary;
		public Employee() {
			
		}
		
		public Employee(String name,int age) {
			setName(name);
			setAge(age);
			setSalary(2000);
		}
		public Employee(String name,int age,int salary) {
			this(name,age);
			setSalary(salary);
			//this(name,age); //-->Compilation Error
		}
		//getter and setter methods for attributing go here
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name=name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age=age;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary=salary;
		}
		public void printDetails() {
			System.out.println(name+":"+age+":"+salary);
		}
	}


