class Printer{
	String[] manufactures;
	Machine[] machines;
	
	Printer(String[] manufactures,Machine[] machines)
	{
		this.manufactures=manufactures;
		this.machines=machines;
	}
	void display()
	{
		System.out.println("executing the printer manufacturing.....");
		if(manufactures!=null)
		{
			System.out.println("total brand:"+this.manufactures.length);
			for(String name:this.manufactures)
			{
				System.out.println("brand:"+name);
				
			}
		}
		System.out.println("executing the manufacture location and price");
		if(this.machines!=null)
		{
			System.out.println("total number:"+this.machines.length);
			for(Machine machine:this.machines)
			{
				machine.printData();
			}
		}
	}
}


