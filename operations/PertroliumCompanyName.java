class PertroliumCompanyName{
	String[] CompanyNames;
	int currentIndex=0;
	
	PertroliumCompanyName(String[] CompanyNames)
	{
		this.CompanyNames=CompanyNames;
	}
	void store(String name)
	{
		System.out.println("executing to store the  petrolium company names.......");
		if(this.CompanyNames!=null)
		{
			System.out.println("name:"+name);
			int index=this.CompanyNames.length-1;
			System.out.println("executing the name with current index:"+this.currentIndex);
			if(this.currentIndex <= index)
			{
				this.CompanyNames[this.currentIndex]=name;
				this.currentIndex++;
				System.out.println("executing to store in next index:"+this.currentIndex);
			}
			else{
				System.out.println("Array is full...");
			}
		}
		else
		{
			System.out.println("array cannot be null");
		}
	}
	
	boolean search(String name)
	{
		System.out.println("executing the search in nameStrore..");
		if(name!=null)
		{
			System.out.println("name is not null,continue search");
			if(this.CompanyNames!=null)
			{
				for(String temp:this.CompanyNames)
				{
					System.out.println("comparing with:"+temp);
					if(name == temp)
					{
					  System.out.println("name:"+temp);
					return true;
					}
				}
			}
			else
			{
				System.out.println("name is null.....");
			}
		}
		else
		{
			System.out.println("name is null...");
		}
		return false;
	}
	
	boolean update(int index,String newName)
	{
		System.out.println("executing to update the values in store");
		if(index>=0 && this.CompanyNames!=null && index<this.CompanyNames.length-1)
		{
			System.out.println("index:"+index);
			if(newName!=null)
			{
			 	this.CompanyNames[index]=newName;
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
			System.out.println("cannot update.......");
		}
		return false;
	}
	
	boolean updateNewName(String oldName,String newName)
	{
		System.out.println("executing to change the similar names");
		if(oldName!=null && newName!=null)
		{
			System.out.println("old name:"+oldName+",new name:"+newName);
			if(this.CompanyNames!=null)
			{
				int index=0;
				for(String tempName:this.CompanyNames)
				{
					if(tempName == oldName)
					{
						this.CompanyNames[index]=newName;
						System.out.println("new name:"+newName);
					}
					return true;
				}
			}
			else
			{
			  System.out.println("nameis null");
			}
			
		}
		else
		{
		   System.out.println("name is null....... cannot update");
		}
		return false;
	}
	boolean delete(int index,String delete)
	{
		System.out.println("executing to delete company names by using index value");
		if(this.CompanyNames!=null && index>=0 && index<this.CompanyNames.length-1)
		{
			System.out.println("index:"+index);
			if(delete!=null)
			{
			System.out.println("delete:"+CompanyNames[index]);
			CompanyNames[index]=null;
			return true;
			}
		}
		else
		{
			System.out.println("company name is null.......");
		}
		return false;
	}
	
	boolean deleteByName(String name) 
	{
		System.out.println("Executing delete by the name from store.....");
		if (CompanyNames!=null && name != null) 
        {
		int i = 0;
		for (String companyName:CompanyNames) 
        {
			System.out.println("companyName:"+companyName);
			if (companyName!= null && companyName == name) 
            {
                System.out.println("Deleting:"+companyName);
				CompanyNames[i] = null;
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


