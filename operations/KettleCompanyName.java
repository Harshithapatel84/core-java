class KettleCompanyName{
	String[] brandNames;
	int currentIndex=0;

	KettleCompanyName(String[] brandNames)
	{
		this.brandNames=brandNames;
	}

	void save(String name)
	{
		System.out.println("Executing to save kettle company names.....");

		if(this.brandNames!=null)
		{
			System.out.println("brand name:"+name);

			int index=this.brandNames.length-1;

			if(this.currentIndex<=index)
			{
				this.brandNames[this.currentIndex]=name;
				this.currentIndex++;
				System.out.println("executing next index:"+this.currentIndex);
			}
			else
			{
				System.out.println("Array is full");
			}
		}
		else
		{
			System.out.println("array cannot be null");
		}
	}

	boolean search(String name)
	{
		System.out.println("executing search in kettle company names...");
        boolean result=false;
		if(name!=null)
		{
			System.out.println("brand name is not null");
			if(this.brandNames!=null)
			{
				for(String brand:this.brandNames)
				{
					System.out.println("comparing with:"+brand);

					if(brand==name)
					{
						System.out.println("brand found:"+brand);
						result=true;
						break;
					}
				}
			}
		}
		else
		{
			System.out.println("brand cannot be null");
		}
          return result;
	}
}