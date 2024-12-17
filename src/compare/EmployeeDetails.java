package compare;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeDetails ed=new EmployeeDetails();
		Employee employee=new Employee(0, null, 0, 0);
		EmployeeComparator ec=new compare.EmployeeComparator();
		EmployeeManagement employeemanagement=new EmployeeManagement();
		EmployeeManagementSystem ems=new EmployeeManagementSystem(employeemanagement);
		while(true) {
			System.out.println("Welcome! Choose One");
			System.out.println("1.Comparing by Name\n2.Comparing by Id\n3.Comparing by Age\n"
					+ "4.Comparing by Salary\n5.Display\n6.Add new Employee\n7.Remove an employee");
			int number=sc.nextInt();
			
			switch(number) {
			case 1:
				employeemanagement.sortEmployees(ec.CompareByName);
				break;
			case 2:
				employeemanagement.sortEmployees(ec.CompareById);
				break;
			case 3:
				employeemanagement.sortEmployees(ec.CompareByAge);
				break;
			case 4:
				employeemanagement.sortEmployees(ec.CompareBySalary);
				break;
			case 5:
				ems.displayEmployees();
				break;
			case 6:
				System.out.println("Enter name:");
				String name=sc.next();
				System.out.println("Enter ID:");
				int id=sc.nextInt();
				System.out.println("Enter Age:");
				int age=sc.nextInt();
				System.out.println("Enter Salary:");
				double salary=sc.nextDouble();
				Employee emp=new Employee(id,name,age,salary);
				ems.addNewEmployee(id, name, id, salary);
				break;
			case 7:
				System.out.println("Enter the ID of Employee to be removed:");
				int rid=sc.nextInt();
				employeemanagement.removeEmployee(rid);
				break;
			default:
				System.out.println("Invalid choice.");
			}
		}

	}

}

class Employee{
	private int id;
	private String name;
	private int age;
	private double salary;
	public Employee(int id,String name,int age,double salary) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	//getter and Setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public String toString(){
		return "Name:"+name+" ID:"+id+" Age:"+age+" Salary:"+salary;
	}
}

class EmployeeComparator{

	
	public static Comparator<Employee> CompareById=new Comparator<Employee>() {
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getId(), o2.getId());
	}
	};
	
	public static Comparator<Employee>CompareByName=new Comparator<Employee>() {
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}};

	public static Comparator<Employee>CompareByAge=new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return Integer.compare(o1.getAge(), o2.getAge());
		}
		
	};
	
	public static Comparator<Employee>CompareBySalary=new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return Double.compare(o1.getSalary(), o2.getSalary());
		}
		
	};	
}

class EmployeeManagement{
	private List<Employee> employeeL;
	//private EmployeeManagementSystem ems;
	
	public EmployeeManagement() {
		this.employeeL=new LinkedList<>();
		//this.ems=ems;
	}
	//getter 
	public List<Employee> getEmployeeL(){
		return employeeL;
	}

	//List<Employee> list=new LinkedList<>();
	
	public void addEmployee(Employee employee) {
		employeeL.add(employee);
		System.out.println("Employee added:" +employee);
	}
	public void removeEmployee(int id) {
		//Removes an employee from the management system
		//Stream<Employee> stream=employeeL.stream();
		//Employee removedEmployee=employeeL.remove(0);
		employeeL.removeIf(emp -> emp.getId() == id);
        System.out.println("Employee with ID " + id + " removed.");
	}
	public void sortEmployees(Comparator<Employee> comparator) {
		employeeL.sort(comparator);
		System.out.println("Employees sorted.");
		
	}
	public void displayEmployees() {
		//List<Employee> stream=employeeL.stream()
			//						.collect(Collectors.toList());
		//System.out.println(stream);
		employeeL.forEach(System.out::println);
	}
}

class EmployeeManagementSystem{
	private EmployeeManagement employeemanagement;
	
	public EmployeeManagementSystem(EmployeeManagement employeemanagement) {
		this.employeemanagement=employeemanagement;
	}

	//getter
	public EmployeeManagement getemployeemanagement() {
		return employeemanagement;
	}
	public void addNewEmployee(int id,String name,int age,double salary) {
		//Creates a new Employee object and adds it to the management system.
		Employee employeeL=new Employee(id,name,age,salary);
		employeemanagement.addEmployee(employeeL);
		//System.out.println("Employee added:"+employeeL);
		
	}
	public void removeEmployee(int id) {
		employeemanagement.removeEmployee(id);
	}
	public void sortEmployeeById() {
		employeemanagement.sortEmployees(EmployeeComparator.CompareById);
	}
	public void sortEmployeeByName() {
		employeemanagement.sortEmployees(EmployeeComparator.CompareByName);
	}
	public void sortEmployeeByAge() {
		employeemanagement.sortEmployees(EmployeeComparator.CompareByAge);
	}
	public void sortEmployeeBySalary() {
		employeemanagement.sortEmployees(EmployeeComparator.CompareBySalary);
	}
	public void displayEmployees() {
		employeemanagement.displayEmployees();
	}
}



