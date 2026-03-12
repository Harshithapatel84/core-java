class PertroliumCompanyName{
	String[] CompanyNames;
	int currentIndex=0;
	
	PertroliumCompanyName(String[] CompanyNames)
	{
		this.CompanyNames=CompanyNames;
	}
	void store(String name)
	{
		System.out.println("executing to store the  petrolium company names");
		if(this.CompanyNames!=null)
		{
			System.out.println("name:"+name);
			int index=this.CompanyNames.length-1;
			System.out.println("executing the name with current index:"+this.currentIndex);
			if(this.currentIndex <= index)
			{
				this.CompanyNames[this.currentIndex]=name;
				this.currentIndex++;
				System.out.println("executing to store in next index:"+this.currentIndex);
			}
			else{
				System.out.println("Array is full");
			}
		}
		else
		{
			System.out.println("array cannot be null");
		}
	}
}

