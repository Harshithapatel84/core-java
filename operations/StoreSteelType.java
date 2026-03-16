class StoreSteelType{
	String[] steelTypes;
	int curIndex=0;
	
	StoreSteelType(String[] steelTypes)
	{
		this.steelTypes=steelTypes;
	}
	void store(String type)
	{
		System.out.println("Executing the store method  to store steel types.....");
		if(this.steelTypes!=null)
		{
			System.out.println("type:"+type);
			int index=this.steelTypes.length-1;
			System.out.println("executingthe stored index"+this.curIndex);
			if(this.curIndex <= index)
			{
				this.steelTypes[curIndex]=type;
				this.curIndex++;
				System.out.println("executing the next index"+this.curIndex);
			}
		}
		else
		{
			System.out.println("array cannot be null");
		}
	}
	
	boolean find(String type)
	{
		System.out.println("executing the find in steel type....");
		if(type!=null)
		{
			System.out.println("steel type:"+type);
			if(this.steelTypes!=null)
			{
				for(String tempType:this.steelTypes)
				{
					System.out.println("comparing with:"+tempType);
					if(tempType == type)
					{
						System.out.println("type:"+tempType);
						return true;
					}
				}
				
			}
		}
		else
		{
			System.out.println("name is null");
		}
		return false;
	}
}


