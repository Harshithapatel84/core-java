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
	boolean update(int index,String newName)
	{
		System.out.println("Executing the update by using index");
		if(index>=0 && index<this.types.length-1 && this.types!=null)
		{
			System.out.println("index:"+index);
			if(newName!=null)
			{
				this.types[index]=newName;
				System.out.println("new name:"+newName);
				return true;
			}
		}
		return false;
	}
	
	boolean updateNewName(String oldName,String newName)
	{
		System.out.println("executing to change the old name by new name");
		if(oldName!=null && newName!=null)
		{
			System.out.println("old name:"+oldName+",new name:"+newName);
			if(this.types!=null)
			{
				int index=0;
				for(String type:this.types)
				{
					if(type == oldName)
					{
						this.types[index]=newName;
						System.out.println("new name:"+newName);
					}
					return true;
				}
			}
			else
			{
			  System.out.println("turbine type is null");
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
		if(this.types!=null && index>=0 && index<this.types.length-1)
		{
			System.out.println("index:"+index);
			if(delete!=null)
			{
			System.out.println("delete:"+types[index]);
			types[index]=null;
			return true;
			}
		}
		else
		{
			System.out.println("turbine types is null.......");
		}
		return false;
	}
	
	boolean deleteByName(String name) 
	{
		System.out.println("Executing delete by name...");
		if (this.types!=null && name != null) 
        {
		int i = 0;
		for (String type : types) 
        {
			System.out.println("type: " + type);
			if (type!= null && type == name) 
            {
                System.out.println("Delete old name: " + type);
				types[i] = null;
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
	

