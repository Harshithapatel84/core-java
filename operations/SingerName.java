class SingerName{
	String[] musicians;
	int presntIndex=0;
	
	SingerName(String[] musicians)
	{
		this.musicians=musicians;
	}
	void save(String name)
	{
		System.out.println("executing the save of singername..");
		if(this.musicians!=null)
		{
			System.out.println("Singer Name:"+name);
			System.out.println("executing the present index:"+this.presntIndex);
			int singers=this.musicians.length-1;
			if(this.presntIndex<=singers)
			{
				this.musicians[this.presntIndex]=name;
				this.presntIndex++;
				System.out.println("executing the index,then move to next index:"+this.presntIndex);
			}
			else{
				System.out.println("array is .................");
			}
			
		}
		else{
			System.out.println("array cannot be.................");
		}
	}
	
	boolean search(String name)
	{
		System.out.println("executing the search.................");
		if(name!=null)
		{
			System.out.println("name is not null");
			if(this.musicians!=null)
			{
				for(String tempName:this.musicians)
				{
					System.out.println("comparing with:"+tempName);
					if(tempName == name)
					{
					 System.out.println("name:"+tempName);
				     return true;
					}
				}
			}
			else
			{
				System.out.println("name is null..");
			}
		}
		else
		{
			System.out.println("name is not found..");
		}
		return false;
	}
}