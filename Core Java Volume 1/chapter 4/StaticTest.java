/**
  *This program demonstrates static methods.
  *@version 1.0
  *@author colin
  *@date 2016-04-15
  */
  
public class StaticTest{
	public static void main(String[] args){
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Tom", 4000);
		staff[1] = new Employee("Dick", 6000);
		staff[2] = new Employee("Harry", 6500);
		
		for(Employee e: staff){
			e.setId();
			System.out.println("name=" + e.getName() + ", id=" + e.getId() + ", salary=" + e.getSalary());
		}
	}
}


class Employee{
	private static int nextId = 1;
	
	private String name;
	private double salary;
	private int id;
	
	public Employee(String n, double s){
		name = n;
		salary = s;
		id = 0;
	}
	
	public String getName(){
		return name;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId()
	{
		id = nextId;
		nextId++;
	}
	
	public static int getNextId(){
		return nextId;
	}
	
	public static void main(String[] args){ //unit test
		Employee e = new Employee("Harry", 5000);
		System.out.println(e.getName()+" "+e.getSalary());
	}
}