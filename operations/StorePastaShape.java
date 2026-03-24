class StorePastaShape{
	String[] shapes;
	int currentIndex=0;

	StorePastaShape(String[] shapes)
	{
		this.shapes=shapes;
	}
	void save(String name)
	{
		System.out.println("Executing to save pasta shapes.....");

		if(this.shapes!=null)
		{
			System.out.println("shape name:"+name);
			int index=this.shapes.length-1;
			if(this.currentIndex<=index)
			{
				this.shapes[this.currentIndex]=name;
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

	int search(String name)
	{
		System.out.println("executing search in pasta shapes...");

		if(name!=null)
		{
			if(this.shapes!=null)
			{
				for(String shape:this.shapes)
				{
					System.out.println("comparing with:"+shape);

					if(shape==name)
					{
						System.out.println("shape found:"+shape);
						return 1;
					}
				}
			}
		}
		else
		{
			System.out.println("shape name cannot be null...");
		}

		return 0;
	}
	
	boolean update(int index,String newName)
	{
		System.out.println("executing to update the values in store");
		if(index>=0 && this.shapes!=null && index<this.shapes.length-1)
		{
			System.out.println("index:"+index);
			if(newName!=null)
			{
			 	this.shapes[index]=newName;
				System.out.println("name:"+newName);
				return true;
			}
			else
			{
				System.out.println("shape is null");
			}
		}
		else
		{
			System.out.println("cannot update shape is null.......");
		}
		return false;
	}
	
	boolean updateNewName(String oldName,String newName)
	{
		System.out.println("executing to change the old names");
		if(oldName!=null && newName!=null)
		{
			System.out.println("old name:"+oldName+",new name:"+newName);
			if(this.shapes!=null)
			{
				int index=0;
				for(String shape:this.shapes)
				{
					if(shape == oldName)
					{
						this.shapes[index]=newName;
						System.out.println("new name:"+newName);
					}
					return true;
				}
			}
			else
			{
			  System.out.println("pasta shapeis null");
			}
		}
		else
		{
			System.out.println("cannot update shape is null");
		}
		return false;
	}
	
	boolean delete(int index,String delete)
	{
		System.out.println("executing to delete types by using index value");
		if(this.shapes!=null && index>=0 && index<this.shapes.length-1)
		{
			System.out.println("index:"+index);
			if(delete!=null)
			{
			System.out.println("delete:"+shapes[index]);
			shapes[index]=null;
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
		if (shapes!=null && name!=null) 
        {
		int i = 0;
		for (String shape:shapes) 
        {
			System.out.println("shape: " + shape);
			if (shape!=null && shape == name) 
            {
                System.out.println("Delete: " + shape);
				shapes[i] = null;
				return true;
            }
			i++;
        }
    }
    else 
    {
        System.out.println("shape name is null...");
    }

    return false;
}
}
	
	
