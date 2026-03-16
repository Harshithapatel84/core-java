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
}