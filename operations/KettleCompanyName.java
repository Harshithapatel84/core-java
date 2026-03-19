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
	
	boolean update(int index,String newName)
	{
		System.out.println("executing to update the values in store");
		if(index>=0 && this.brandNames!=null && index<this.brandNames.length-1)
		{
			System.out.println("index:"+index);
			if(newName!=null)
			{
			 	this.brandNames[index]=newName;
				System.out.println("name:"+newName);
				return true;
			}
			else
			{
				System.out.println("brand name is null");
			}
		}
		else
		{
			System.out.println("brand is null cannot update......");
		}
		return false;
	}
	
	boolean updateNewName(String oldName,String newName)
	{
		System.out.println("executing to change the old names");
		if(oldName!=null && newName!=null)
		{
			System.out.println("old name:"+oldName+",new name:"+newName);
			if(this.brandNames!=null)
			{
				int index=0;
				for(String brand:this.brandNames)
				{
					if(brand == oldName)
					{
						this.brandNames[index]=newName;
						System.out.println("new name:"+newName);
					}
					return true;
				}
			}
			else
			{
			  System.out.println("company name is null");
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
		if(this.brandNames!=null && index>=0 && index<this.brandNames.length-1)
		{
			System.out.println("index:"+index);
			if(delete!=null)
			{
			System.out.println("delete:"+brandNames[index]);
			brandNames[index]=null;
			return true;
			}
		}
		else
		{
			System.out.println("brand is null,cannot delete.......");
		}
		return false;
	}
	
	boolean deleteByName(String name) 
	{
		System.out.println("Executing the delete by name...");
		if (brandNames != null && name != null) 
        {
		int i = 0;
		for (String brand:brandNames) 
        {
			System.out.println("brand:" + brand);
			if (brand!= null && brand == name) 
            {
                System.out.println("Deleting: " + brand);
				brandNames[i] = null;
				return true;
            }
			i++;
        }
    }
    else 
    {
        System.out.println("brand nameis null...");
    }

    return false;
}
}
	
