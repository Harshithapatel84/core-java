class EmployeeRunner{
	public static void main(String... values)
	{
		Employee[] employee=new Employee[5];
		StroreEmpDetail empDetail=new StroreEmpDetail(employee);
		Employee employee1=new Employee("Hs048","Harshitha","project",50000,"12-3-26");
		Employee employee2=new Employee("c609","ciya","development",40000,"31-3-25");
		Employee employee3=new Employee("A048","ayra","project",70000,"8-7--26");
		Employee employee4=new Employee("B048","bharath","testing",20000,"4-3-26");
		Employee employee5=new Employee("Rs048","rahul","management",30000,"6-9-26");
		empDetail.save(employee1);
		employee1.display();
		empDetail.save(employee2);
		empDetail.save(employee3);
		empDetail.save(employee4);
		empDetail.save(employee5);
		
		
		employee2.display();
		employee3.display();
		employee4.display();
		employee5.display();
		
		boolean empName=empDetail.getName("c609");
		System.out.println(empName);
		
		System.out.println("==============================================");
		
		boolean empsalary=empDetail.getSalary("rahul");
		System.out.println(empsalary);
		
		System.out.println("==============================================");
		
		boolean empNewsalary=empDetail.updateSalary("bharath",40000);
		System.out.println(empNewsalary);
		
		System.out.println("==============================================");
		
		boolean delete=empDetail.deleteEmployee("ciya");
		System.out.println(delete);
		
		System.out.println("==============================================");
		
		boolean emplDate=empDetail.getEmployeeAfterDate("4-3-26");
		System.out.println(emplDate);
		
		System.out.println("==============================================");
		
		int totalEmp=empDetail.totalEmployee();
		System.out.println(totalEmp);
		
		
	}
}