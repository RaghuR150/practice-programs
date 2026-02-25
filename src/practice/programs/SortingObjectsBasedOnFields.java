package practice.programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    
    public Employee(int id, String name, String department, double salary){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    
    public double getSalary(){
        return salary;
    }
    
    public String getDepartment(){
        return department;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
}
public class SortingObjectsBasedOnFields 
{
    
	public static void main(String[] args) {
	    
	    List<Employee> employees = new ArrayList<>();
	    employees.add(new Employee(1,"Raghu","IT",55000));
	    employees.add(new Employee(2,"Suresh","HR",62000));
	    employees.add(new Employee(4,"Monu","IT",45000));
	    employees.add(new Employee(3,"Janardhan","HR",89000));
	    
	    
	       List<Employee> disSortedEmployeesByDept =  employees.stream()
	                .sorted(Comparator.comparing((Employee e )-> e.getSalary()).reversed())
	                .collect(Collectors.toList());
	                
	       disSortedEmployeesByDept.forEach(e -> System.out.println("id: "+e.getId()+" "+"name: "+e.getName()+" "+"dept: "+e.getDepartment()+" "+"salary: "+e.getSalary()));         

}

}