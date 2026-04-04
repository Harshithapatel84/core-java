class StroreEmpDetail{
	Employee[] employees;
	int curtIndex;
	
	StroreEmpDetail(Employee[] employees)
	{
		this.employees=employees;
	}
	void save(Employee employee)
	{
		System.out.println("executing to save the employee details");
		if(this.employees!=null && employee!=null)
		{
			int index=this.employees.length;
			if(curtIndex<=index)
			{
				this.employees[curtIndex]=employee;
				this.curtIndex++;
			}
		}
		else{
			System.out.println("no details to store");
		}
	}
    boolean getName(String id)
	{
		System.out.println("get name by emp id");
		if(this.employees!=null && id!=null)
		{
			System.out.println("");
			for(Employee employee:this.employees)
			{
				if(employee!=null)
				{
					System.out.println("chech id is matching:"+employee.empId);
					if(employee.empId == id){
						System.out.println("id is matching");
						System.out.println("employee name:"+employee.name);
						return true;
					}
				
				}
			}
		}
		return false;
	}
	boolean getSalary(String name)
	{
		System.out.println("execute to get the salary by name");
		if(this.employees!=null && name!=null)
		{
			for(Employee employee:this.employees)
			{
				if(employee!=null)
				{
					System.out.println("check employee name:"+employee.name);
					if(employee.name == name)
					{
						System.out.println(employee.salary);
						return true;
					}
				}
			}
		}
		else{}
		return false;
	}
	
	boolean updateSalary(String name,double newSalary)
	{
		System.out.println("execute to update the salary by name");
		if(this.employees!= null && name!=null )
		{
			for(Employee employee:this.employees)
			{
				if(employee!=null)
				{
					System.out.println("check employee name:"+employee.name);
					if(employee.name == name){
						employee.salary=newSalary;
						System.out.println("updated salary:"+employee.salary);
						return true;
					}
					
				}
			}
		}
		return false;
	}
	
	boolean deleteEmployee(String name)
	{
		System.out.println("executing to delete the employee by name");
		if(this.employees!=null)
		{
			int i=0;
			for(Employee employee:this.employees)
			{
				if(employee!=null)
				{
					if(employee.name == name)
					{
					employees[i]=null;
				    System.out.println("deleted:"+employee.name);
					return true;
					}
				}
			}
		}
		return false;
	}
	
	boolean getEmployeeAfterDate(String afterDate)
	{
		if(this.employees!=null && afterDate!=null)
		{
			boolean found= false;
			int input = convertToNumber(afterDate);
			for(Employee employee:this.employees)
			{
				if(employee!=null)
				{
					if(convertToNumber(employee.joiningDate) > input)
					{
						System.out.println("Employee joined after date:"+employee.name+","+employee.joiningDate);
					    found=true;
						 
					
					}
				}
			}
			return found;
		}
		return false;
	}
	int convertToNumber(String date)
   {
    String[] p = date.split("-");
    return Integer.parseInt(p[2] + p[1] + p[0]);
   }
   
  int totalEmployee()
  {
	  int count=0;
	  if(this.employees!=null)
	  {
		  for(Employee employee:this.employees)
		  {
			  if(employee!=null)
			  {
			  System.out.println("total no of employess:"+count);
			  count++;
			  }
		  }
	  }
	   return count;
   }
  
	
}