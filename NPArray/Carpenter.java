class Carpenter{
	String[] materials;
	Location[] locations;
	
	Carpenter(String[] materials,Location[] locations)
	{
		this.materials=materials;
		this.locations=locations;
	}
	void display()
	{
		System.out.println("printing materials in carpenter work");
		if(this.materials!=null)
		{
			System.out.println("total no of materials:"+this.materials.length);
			for(String material:materials)
			{
				System.out.println("materials:"+material);
			}
		}
		if(locations!=null)
		{
			System.out.println("total address:"+this.locations.length);
			for(Location location:this.locations)
			{
				location.getInfo();
			}
		}
	}
}