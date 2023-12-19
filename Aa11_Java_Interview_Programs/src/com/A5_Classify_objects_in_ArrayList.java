package com;

import java.util.*;


class Employee{
	private String id;
	private String name;
	private String designation;
	
	public Employee() {
		
	}

	public Employee(String id, String name, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + "]";
	}
	
	
	
	
}


public class A5_Classify_objects_in_ArrayList {
	
	public static void main(String[] args) 
	{

		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("1","Swapnil","Developer"));
		emp.add(new Employee("2","Yash","Programmer"));
		emp.add(new Employee("3","Pratik","Tester"));
		emp.add(new Employee("4","Deepak","Developer"));
		
		List<Employee> e = new ArrayList<Employee>();
		
		HashMap<String, List<Employee>> hm = new HashMap<String, List<Employee>>();
		
		for(int i = 0 ; i < emp.size(); i++)
		{
			
			
			if(hm.containsKey(emp.get(i).getDesignation())) 
			{
				e =  hm.get(emp.get(i).getDesignation());
				e.add(emp.get(i));
				hm.put(emp.get(i).getDesignation(),e);
			}
			
			else {
				e.add(emp.get(i));
				
				hm.put(emp.get(i).getDesignation(),e);
			}
			
			e = new ArrayList<Employee>();
		}
		
		System.out.println(hm);
		
		
		
		
	}
	


}