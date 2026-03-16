class TurbineType{
	String[] types;
	int currentIndex=0;

    TurbineType(String[] types)
	{
		this.types=types;
	}
	void save(String name)
	{
		System.out.println("Executing to save turbine types.....");

		if(this.types!=null)
		{
			System.out.println("type name:"+name);
			int index=this.types.length-1;
			if(this.currentIndex<=index)
			{
				this.types[this.currentIndex]=name;
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
		System.out.println("executing search in turbine types...");
		boolean result=false;

		if(name!=null)
		{
			System.out.println("turbine type is not null");

			if(this.types!=null)
			{
				for(String type:this.types)
				{
					System.out.println("comparing with:"+type);

					if(type==name)
					{
						System.out.println("type found:"+type);
						return true;
					}
				}
			}
		}
		else
		{
			System.out.println("type cannot be null");
		}

		return false;
	}
}
