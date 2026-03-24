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
	boolean update(int index,String newName)
	{
		System.out.println("executing to update the type by using index");
		if(index>=0&& index<this.steelTypes.length-1)
		{
			if(this.steelTypes!=null)
			{
				{
					if(newName!=null)
					{
						this.steelTypes[index]=newName;
						System.out.println("new name:"+newName);
						return true;
					}
				}
				System.out.println("index:"+index);
				
			}
			else{
				System.out.println("steel type is null");
			}
		}
		else{
			System.out.println(" index not found cannot update");
		}
		return false;
	}
	
	boolean updateNewName(String oldName,String newName)
	{
		System.out.println("executing to change the old name by new name");
		if(oldName!=null && newName!=null)
		{
			System.out.println("old name:"+oldName+",new name:"+newName);
			if(this.steelTypes!=null)
			{
				int index=0;
				for(String type:this.steelTypes)
				{
					if(type == oldName)
					{
						this.steelTypes[index]=newName;
						System.out.println("new name:"+newName);
					}
					return true;
				}
			}
			else
			{
			  System.out.println("steel type is null");
			}
		}
		else
		{
			System.out.println("cannot update name is null");
		}
		return false;
	}
	
	boolean delete(int index,String delete)
	{
		System.out.println("executing to delete types by using index value");
		if(this.steelTypes!=null && index>=0 && index<this.steelTypes.length-1)
		{
			System.out.println("index:"+index);
			if(delete!=null)
			{
			System.out.println("delete:"+steelTypes[index]);
			steelTypes[index]=null;
			return true;
			}
		}
		else
		{
			System.out.println("steel types is null.......");
		}
		return false;
	}
	
	boolean deleteByName(String name) 
	{
		System.out.println("Executing delete by name...");
		if (steelTypes != null && name != null) 
        {
		int i = 0;
		for (String steel:steelTypes ) 
        {
			System.out.println("steel: " + steel);
			if (steel != null && steel == name) 
            {
                System.out.println("Deleting: " + steel);
				steelTypes[i] = null;
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
	
	
	



