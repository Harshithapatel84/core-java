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
	
	boolean update(int index,String newName)
	{
		System.out.println("executing to update the values in save");
		if(index>=0 && this.musicians!=null && index<this.musicians.length-1)
		{
			System.out.println("index:"+index);
			if(newName!=null)
			{
			 	this.musicians[index]=newName;
				System.out.println("name:"+newName);
				return true;
			}
			else
			{
				System.out.println("name is null");
			}
		}
		else
		{
			System.out.println("name is null,cannot update.......");
		}
		return false;
	}
	
	boolean updateNewName(String oldName,String newName)
	{
		System.out.println("executing to update the old name");
		if(oldName!=null && newName!=null)
		{
			System.out.println("old name:"+oldName+",new name:"+newName);
			if(this.musicians!=null)
			{
				int index=0;
				for(String musician:this.musicians)
				{
					if(musician == oldName)
					{
						this.musicians[index]=newName;
						System.out.println("new name:"+newName);
					}
					return true;
				}
			}
			else
			{
			  System.out.println("name is null");
			}
		}
		else
		{
		   System.out.println("name is null....... cannot exchange");
		}
		return false;
	}
	boolean delete(int index,String delete)
	{
		System.out.println("executing to delete types by using index value");
		if(this.musicians!=null && index>=0 && index<this.musicians.length-1)
		{
			System.out.println("index:"+index);
			if(delete!=null)
			{
			System.out.println("delete:"+musicians[index]);
			musicians[index]=null;
			return true;
			}
		}
		else
		{
			System.out.println("musician name is null.......");
		}
		return false;
	}
	
	boolean deleteByName(String name) 
	{
		System.out.println("Executing to delete the name....");
		if (musicians != null && name != null) 
        {
		int i = 0;
		for (String musician:musicians) 
        {
			System.out.println("musician:"+musician);
			if (musician!= null && musician==name) 
            {
                System.out.println("Deleting:"+musician);
				musicians[i] = null;
				return true;
            }
			i++;
        }
    }
    else 
    {
        System.out.println("Array or name is null...");
    }

    return false;
}
}
