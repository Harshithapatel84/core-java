class StoreTreeTypes{
	String[] trees;
	int curIndex=0;
	
	StoreTreeTypes(String[] trees)
	{
		this.trees=trees;
		this.curIndex=curIndex;
	}
	void save(String name)
	{
		System.out.println("executing the save in types..........");
		if(this.trees!=null)
		{
			System.out.println("name:"+name);
			int index=this.trees.length-1;
			if(this.curIndex <= index)
			{
				this.trees[curIndex]=name;
				this.curIndex++;
				System.out.println("Executing the next index:"+this.curIndex);
			}
			else{
				System.out.println("Array is full");
			}
		}
		else
		{
			System.out.println("array cannot be .....");
		}
	}
	
	boolean search(String name)
	{
		System.out.println("executing the seach.......");
		if(name!=null)
		{
		System.out.println("name is not null....");
		if(this.trees!=null)
		{
			for(String tree:this.trees)
			{
				System.out.println("comparing with:"+tree);
				if(tree == name)
				{
					System.out.println("tree name:"+tree);
					return true;
				}
			}
		}
		}
		else
		{
			System.out.println("name cannot be ..........");
		}
		return false;
	}
	
	boolean update(int index,String newName)
	{
		System.out.println("executing to update the values in store");
		if(index>=0 && this.trees!=null && index<this.trees.length-1)
		{
			System.out.println("index:"+index);
			if(newName!=null)
			{
			 	this.trees[index]=newName;
				System.out.println("name:"+newName);
				return true;
			}
			else
			{
				System.out.println("types is null");
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
			if(this.trees!=null)
			{
				int index=0;
				for(String tree:this.trees)
				{
					if(tree == oldName)
					{
						this.trees[index]=newName;
						System.out.println("new name:"+newName);
					}
					return true;
				}
			}
			else
			{
			  System.out.println("types is null");
			}
			
		}
		else
		{
		   System.out.println("tree types is null....... cannot exchange");
		}
		return false;
	}
	boolean delete(int index,String delete)
	{
		System.out.println("executing to delete types by using index value");
		if(this.trees!=null && index>=0 && index<this.trees.length-1)
		{
			System.out.println("index:"+index);
			if(delete!=null)
			{
			System.out.println("delete:"+trees[index]);
			trees[index]=null;
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
		if (trees != null && name != null) 
        {
		int i = 0;
		for (String tree : trees) 
        {
			System.out.println("tree: " + tree);
			if (tree != null && tree == name) 
            {
                System.out.println("Deleting: " + tree);
				trees[i] = null;
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