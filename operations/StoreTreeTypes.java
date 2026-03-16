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
			System.out.println("name not found");
		}
		return false;
	}
}