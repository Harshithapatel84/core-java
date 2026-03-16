class CylinderCompanyName{
	String[] brandNames;
	int currentIndex=0;
	
	CylinderCompanyName(String[] brandNames)
	{
		this.brandNames=brandNames;
	}
	void save(String name)
	{
		System.out.println("Executing to save the brands of cylinder.....");
		if(this.brandNames!=null)
		{
			System.out.println("brand name:"+name);
			int nameIndex=this.brandNames.length-1;
			if(this.currentIndex <= nameIndex)
			{
				this.brandNames[this.currentIndex]=name;
				this.currentIndex++;
				System.out.println("executing the next index:"+this.currentIndex);
			}
		}
		else
		{
			System.out.println("it cannot be null");
		}
	}
	
	int search(String name)
	{
		System.out.println("executing the search in brand........");
		if(name!=null)
		{
			System.out.println("brand is not null");
			if(this.brandNames!=null)
			{
				for(String brand:this.brandNames)
				{
					System.out.println("comparing with:"+brand);
					if(brand == name)
					{
						System.out.println("brand name:"+brand);
						return 1;
					}
				}
				
			}
		}
		else
		{
			System.out.println("brand cannot be  null");
			
		}
		return 0;
	}
	
}