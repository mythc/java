import java.util.*;

/**
  * This program demonstrates object construction.
  * @version 1.0
  * @author Colin Myth
  * @date 2016-04-19
  */
  
public class ConstructorTest{
	public static void main(String[] args){
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Harry", 4000);
		staff[1] = new Employee(6000);
		staff[2] = new Employee();
		
		for(Employee e: staff)
			System.out.println("name="+e.getName()+", id="+e.getId()+", salary="+e.getSalary());
	}
}

class Employee{
	private static int nextId;
	
	private int id;
	private String name = "";
	private double salary;
	
	static{
		Random generator = new Random();
		nextId = generator.nextInt(1000);
	}
	
	{
		id = nextId;
		nextId++;
	}
	
	public Employee(String aName, double aSalary){
		name = aName;
		salary = aSalary;
	}
	
	public Employee(double aSalary){
		this("Employee #"+nextId, aSalary);
	}
	
	public Employee(){
		salary = 1000;
	}
	
	public String getName(){
		return name;
	}
	
	public int getId(){
		return id;
	}	
	
	public double getSalary(){
		return salary;
	}
}