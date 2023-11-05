package oops.A6_encapsulation;

public class B1_main {

	public static void main(String args[])
	{
		Emp obj1 = new Emp();
		obj1.setEmpId(3);
		obj1.setEmpName("Rakesh");
		
		System.out.println(obj1.getEmpId());
		System.out.println(obj1.getEmpName());
	}
}

class Emp
{
	private int empId;
	private String empName;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
	
	
}
