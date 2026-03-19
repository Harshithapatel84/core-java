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
	
	boolean update(int index,String newName)
	{
		System.out.println("execiting to update the old name by index");
		if(index>=0 && index<this.brandNames.length-1 && this.brandNames!=null)
		{
			System.out.println("index:"+index);
			{
				if(newName!=null)
				{
					brandNames[index]=newName;
					System.out.println("new Name:"+newName);
					return true;
				}
				else{
					
					System.out.println("company name is null....");
					
				}
			}
		}
		else{
			System.out.println("cannot update .....");
		}
		return false;
	}
	
	boolean updateNewName(String oldName,String newName)
	{
		System.out.println("executing to change the old names by new one");
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
			System.out.println("company brand types is null.......");
		}
		return false;
	}
	
	boolean deleteByName(String name) 
	{
		System.out.println("Executing delete by name...");
		if (brandNames != null && name != null) 
        {
		int i = 0;
		for (String brand:brandNames) 
        {
			System.out.println("brand: "+brand);
			if (brand != null && brand == name) 
            {
                System.out.println("Delete:"+brand);
				brandNames[i] = null;
				return true;
            }
			i++;
        }
    }
    else 
    {
        System.out.println("brand name is null...");
    }

    return false;
}
}
	
	
