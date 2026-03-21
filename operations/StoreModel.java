class StoreModel{
	String[] models;
	int currentIndex=0;
	StoreModel(String[] models)
	{
		this.models=models;
	}
	void storeData(String model)
	{
		System.out.println("executing to store data of two wheeler model...");
		if(this.models!=null)
		{
			System.out.println("model name:"+model);
			System.out.println("executing the present index:"+this.currentIndex);
			int version=this.models.length-1;
			if(this.currentIndex <= version)
			{
				this.models[currentIndex]=model;
				this.currentIndex++;
				System.out.println("executing the current index values,move to next index:"+this.currentIndex);
			}
			else{
				System.out.println("array is full....");
			}
		}
		else{
			System.out.println("array cannot be null............");
		}
		
	}
	boolean search(String model)
	{
		System.out.println("executing the search in model store...");
		if(model!=null)
		{
			System.out.println("model is not null");
			if(this.models!=null)
			{
				for(String tempModel:this.models)
				{
					if(tempModel == model)
					{
					System.out.println("model:"+tempModel);
					return true;
					}
				}
			}
			else
			{
				System.out.println("Array is null");
			}
		}
		else
		{
			System.out.println("model is null:");
		}
		return false;
	}
	
	boolean update(int index,String newName)
	{
		System.out.println("executing to update the model by using index");
		if(index>=0 && this.models!=null && index<this.models.length-1)
		{
			System.out.println("index:"+index);
			if(newName!=null)
			{
			 	this.models[index]=newName;
				System.out.println("name:"+newName);
				return true;
			}
			else
			{
				System.out.println("model is null");
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
		System.out.println("executing to update the new name by old name..");
		if(oldName!=null && newName!=null)
		{
			System.out.println("old name:"+oldName+",new name:"+newName);
			if(this.models!=null)
			{
				int index=0;
				for(String model:this.models)
				{
					if(model == oldName)
					{
						this.models[index]=newName;
						System.out.println("new name:"+newName);
					}
					return true;
				}
			}
			else
			{
			  System.out.println("modelis null");
			}
			
		}
		else
		{
		   System.out.println("model name is null....... cannot exchange");
		}
		return false;
	}
	boolean delete(int index,String delete)
	{
		System.out.println("executing to delete types by using index value");
		if(this.models!=null && index>=0 && index<this.models.length-1)
		{
			System.out.println("index:"+index);
			if(delete!=null)
			{
			System.out.println("delete:"+models[index]);
			models[index]=null;
			return true;
			}
		}
		else
		{
			System.out.println("tree types is null.......");
		}
		return false;
	}
	
	boolean deleteByName(String name) 
	{
		System.out.println("Executing delete by name...");
		if (models != null && name != null) 
        {
		int i = 0;
		for (String model : models) 
        {
			System.out.println("model:"+model);
			if (model!= null && model == name) 
            {
                System.out.println("Deleting:"+model);
				models[i] = null;
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
