class Employee{
	String empId;
	String name;
	String dept;
	double salary;
	String joiningDate;
	
	Employee(String empId,String name,String dept,double salary,String joiningDate)
	{
		this.empId=empId;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
		this.joiningDate=joiningDate;
	}
	void display()
	{
		System.out.println("employee id:"+this.empId+",emp name:"+this.name+",dept:"+this.dept+",salary:"+this.salary+",joining date:"+this.joiningDate);
	}
}